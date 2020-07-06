package empresa.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trabajadores extends Persona {

	private float salario;
	private List<Mensajes> mensaje = new ArrayList<>();
	private String contrasenya;
	private boolean jefeOnO;
	private String tipo;
	private String codigo;
	private String usuario;
	private String departamento;

	public Trabajadores() {
		super();
	}

	public Trabajadores(String nombre, String apellido1, float salario, String contrasenya, boolean jefeOnO,
			String tipo, String codigo, String usuario,String departamento) {
		super(nombre, apellido1);
		this.salario = salario;
		this.contrasenya = contrasenya;
		this.jefeOnO = jefeOnO;
		this.tipo = tipo;
		this.codigo = codigo;
		this.usuario = usuario;
		this.departamento=departamento;
	}

	public Trabajadores(String nombre, String apellido1, float salario, List<Mensajes> mensaje, String contrasenya,
			boolean jefeOnO, String tipo, String codigo, String usuario,String departamento) {
		super(nombre, apellido1);
		this.salario = salario;
		mensaje = new ArrayList<>();
		this.contrasenya = contrasenya;
		this.jefeOnO = jefeOnO;
		this.tipo = tipo;
		this.codigo = codigo;
		this.usuario = usuario;
		this.departamento=departamento;
	}
	
	

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isJefeOnO() {
		return jefeOnO;
	}

	public void setJefeOnO(boolean jefeOnO) {
		this.jefeOnO = jefeOnO;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public List<Mensajes> getMensaje() {
		return mensaje;
	}

	public void setMensaje(List<Mensajes> mensaje) {
		this.mensaje = mensaje;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	
	@Override
	public String toString() {
		return "Trabajadores [salario=" + salario + ", mensaje=" + mensaje + ", contrasenya=" + contrasenya
				+ ", jefeOnO=" + jefeOnO + ", tipo=" + tipo + ", codigo=" + codigo + ", usuario=" + usuario
				+ ", departamento=" + departamento + ", getNombre()=" + getNombre() + ", getApellido1()="
				+ getApellido1() + "]";
	}

	public void comprobarMensajes() {
		Iterator<Mensajes> it = mensaje.iterator();
		while(it.hasNext())
			  System.out.println(it.next());
	}
	

	public void addMensaje(Mensajes m) {
		mensaje.add(m);
	}

}
