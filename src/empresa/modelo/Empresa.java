package empresa.modelo;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Empresa {
	
	private String nombre;

	private HashMap<String, Departamento> departamento = new HashMap<>();
	private HashMap<String, Clientes> clientes = new HashMap<>();

	public Empresa() {
		super();
	}

	public Empresa(String nombre, Map<String, Departamento> departamento) {
		super();
		this.nombre = nombre;
		departamento = new HashMap<>();
	}
	
	

	public Empresa(String nombre, HashMap<String, Departamento> departamento, HashMap<String, Clientes> clientes) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.clientes = clientes;
	}
	
	

	public HashMap<String, Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(HashMap<String, Clientes> clientes) {
		this.clientes = clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<String, Departamento> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(HashMap<String, Departamento> departamento) {
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", departamento=" + departamento + ", clientes=" + clientes + "]";
	}

	public void addDepartamento(String codigo, Departamento d) {

		departamento.put(codigo, d);

	}
	

	public void addCliente(String usuario, Clientes c) {

		if (clientes.containsKey(c.getUsuario())) {
			System.out.println("este usuario ya existe");
		} else {
			clientes.put(usuario, c);
		}
		

	}

	public void buscarDepartamento() {
		for (String key : departamento.keySet()) {
			System.out.println(departamento.get(key));
		}

	}
	public Trabajadores validarTrabajador(String usuario, String password, Empresa empresa) {
		boolean b = false;
		String claveDepartamento;
		Iterator<String> departamentos = empresa.getDepartamento().keySet().iterator();
		while (departamentos.hasNext()) {
			claveDepartamento = departamentos.next();
			Departamento d = empresa.getDepartamento().get(claveDepartamento);
			String clave;
			Iterator<String> trabajadores = d.getTrabajador().keySet().iterator();
			while (trabajadores.hasNext()) {
				clave = trabajadores.next();
				if (clave.equals(usuario)) {
					Trabajadores t = d.getTrabajador().get(clave);
					b = true;
					if (t.getContrasenya().equals(password)) {
						return t;
					} else {
						System.out.println("La password es incorrecta");
					}
				}
			}
		}
		if (!b) {
			System.out.println("No existe el usuario: "+usuario);
		}
				
		return null;

	}
	
	public Clientes validarClientes(String usuario,String password) {
		boolean b = false;
		if (clientes.containsKey(usuario)) {
			Clientes c1 = getClientes().get(usuario);
			if (c1.getPassword().equals(password)) {
				b = true;
				return c1;
			} 
		}
		if (!b) {
			System.out.println("Credenciales invalidos");
		}
			
			return null;		
	}
	
	
	public Mensajes enviarCorreo(String codigoTrabajador, String asunto, String cuerpo,Empresa empresa) {
		boolean b = false;
		Mensajes m = new Mensajes(new Date(),new Date(),asunto,cuerpo,true,false);
		String claveDepartamento;
		Iterator<String> departamentos = empresa.getDepartamento().keySet().iterator();
		while (departamentos.hasNext()) {
			claveDepartamento = departamentos.next();
			Departamento d = empresa.getDepartamento().get(claveDepartamento);
			String clave;
			Iterator<String> trabajadores = d.getTrabajador().keySet().iterator();
			while (trabajadores.hasNext()) {
				clave = trabajadores.next();
				if (clave.equals(codigoTrabajador)) {
					Trabajadores t = d.getTrabajador().get(clave);
					System.out.println("se ha encontrado el trabajador");
					b = true;
					System.out.println("Mensaje construido y enviado al usuario: "+codigoTrabajador);
				
					return m;
				}
			}
		}
		if (!b) {
			System.out.println("No existe el usuario: "+codigoTrabajador);
		}
		
		
		return null;
		
	}
	


}
