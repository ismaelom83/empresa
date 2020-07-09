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
	

//	public void addCliente(String usuario, Clientes c) {
//
//		if (clientes.containsKey(c.getUsuario())) {
//			System.out.println("este usuario ya existe");
//		} else {
//			clientes.put(usuario, c);
//		}	
//
//	}

	public void buscarDepartamento() {
		for (String key : departamento.keySet()) {
			System.out.println(departamento.get(key));
		}

	}
	public Trabajadores validarTrabajador(String usuario, String password, Empresa empresa) {
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
					if (t.getContrasenya().equals(password)) {
						return t;
					} else {
						System.out.println("La password es incorrecta");
					}
				}
			}
		}
				
		return null;

	}
	
	public Mensajes buscarMensajeTrabajador(String usuario,Empresa empresa,Mensajes men) {
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
					return men;
				}
			}
		}
				
		return null;

	}

	
//	public Clientes validarClientes(String usuario,String password) {
//
//		if (clientes.containsKey(usuario)) {
//			Clientes c1 = getClientes().get(usuario);
//			if (c1.getPassword().equals(password)) {
//				return c1;
//			} 
//		}
//			
//			return null;		
//	}
	



}
