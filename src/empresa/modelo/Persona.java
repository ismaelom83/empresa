package empresa.modelo;

import java.util.Date;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String email;
	private int edad;
	private char sexo;
	private Date fechaAlta;
	private Date fechaBaja;
	
	
	
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido1, String apellido2, String dni, String email, int edad, char sexo,
			Date fechaAlta, Date fechaBaja) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.email = email;
		this.edad = edad;
		this.sexo = sexo;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}

	public Persona(String nombre, String apellido1) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	
	
}
