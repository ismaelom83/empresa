package empresa.modelo;

import java.util.Date;

public class Clientes extends Persona {
	
	private int puntosAcumulados;
	private float saldo;
	private String usuario;
	private String password;
	private String tipo;
	private int idCliente;
	private CategoriaCliente categoria;
	
	public Clientes() {
	}



	public Clientes(String nombre, String apellido1, String apellido2, String dni, String email, int edad, char sexo,
			Date fechaAlta, Date fechaBaja, int puntosAcumulados, float saldo, String usuario, String password,
			String tipo, int idCliente,CategoriaCliente categoria) {
		super(nombre, apellido1, apellido2, dni, email, edad, sexo, fechaAlta, fechaBaja);
		this.puntosAcumulados = puntosAcumulados;
		this.saldo = saldo;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
		this.idCliente = idCliente;
		this.categoria = categoria;
	}

	


	public Clientes(int puntosAcumulados, float saldo, String usuario, String password, String tipo, int idCliente,CategoriaCliente categoria) {
		super();
		this.puntosAcumulados = puntosAcumulados;
		this.saldo = saldo;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
		this.idCliente = idCliente;
		this.categoria = categoria;
	}



	public CategoriaCliente getCategoria() {
		return categoria;
	}



	public void setCategoria(CategoriaCliente categoria) {
		this.categoria = categoria;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(int puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + idCliente;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + puntosAcumulados;
		result = prime * result + Float.floatToIntBits(saldo);
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		if (categoria != other.categoria)
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (puntosAcumulados != other.puntosAcumulados)
			return false;
		if (Float.floatToIntBits(saldo) != Float.floatToIntBits(other.saldo))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Clientes [puntosAcumulados=" + puntosAcumulados + ", saldo=" + saldo + ", usuario=" + usuario
				+ ", password=" + password + ", tipo=" + tipo + ", idCliente=" + idCliente + ", categoria=" + categoria
				+ "]";
	}



	public void setCategoria(String string) {
		// TODO Auto-generated method stub
		
	}







	
	
	
	

}
