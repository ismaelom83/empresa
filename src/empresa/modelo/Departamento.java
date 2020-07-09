package empresa.modelo;

import java.util.HashMap;


public class Departamento {
	
	private String nombre;
	private String codigo;	
	private int numeroTrabajadores;
	
	public static final String DEPARTAMENTO_VENTAS = "DepartamentoVentas";
	public static final String DEPARTAMENTO_COMPRAS = "DepartamentoCompras";
	public static final String DEPARTAMENTO_RRHH = "DepartamentoRRHH";
	public static final String DEPARTAMENTO_ATENCION_CLIENTE = "DepartamentoAtencionCliente";
	public static final String DEPARTAMENTO_DIRECCION = "DepartamentoDireccion";
	
	public static final int TRABAJADORES_DIRECCION = 5;
	public static final int TRABAJADORES_COMPRAS = 7;
	public static final int TRABAJADORES_RRHH = 4;
	public static final int TRABAJADORES_VENTAS = 8;
	public static final int TRABAJADORES_ATENCION_CLIENTE = 3;
	
	private HashMap<String,Trabajadores> trabajador = new HashMap<>();

	public Departamento() {
		super();
	}
	
	

	public Departamento(HashMap<String, Trabajadores> trabajador) {
		super();
		this.trabajador = trabajador;
	}



	public Departamento(String nombre, String codigo, int numeroTrabajadores, HashMap<String,Trabajadores> trabajador) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.numeroTrabajadores = numeroTrabajadores;
		trabajador = new HashMap<String, Trabajadores>();
	}
	
	

	public Departamento(String nombre, String codigo, int numeroTrabajadores) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public Departamento(String nombre, int numeroTrabajadores) {
		super();
		this.nombre = nombre;
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public Departamento(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(int numeroTrabajadores) {
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public HashMap<String,Trabajadores> getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(HashMap<String, Trabajadores> trabajador) {
		this.trabajador = trabajador;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", codigo=" + codigo + ", numeroTrabajadores=" + numeroTrabajadores
				+ ", trabajador=" + trabajador + "]";
	}


	public void enviarCorreo() {
		
	}
	
public void altaTrabajador(String c,Trabajadores t) {
	trabajador.put(c,t);
	
}

//
//public Trabajadores altaTrabajadorConsola(String nombre, String apellido, float salario, String contrasenya, String usuario,String departamento) {
//	
//	 Trabajadores trab =	new Trabajadores(nombre, apellido, salario, contrasenya,usuario,departamento);
//
//	return trab;
//
//}

public void buscarTrabajador() {
	for (String key : trabajador.keySet()) {
		System.out.println(trabajador.get(key));
	}
}


}
