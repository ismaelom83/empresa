package empresa.modelo;

import java.util.Date;

public class Mensajes {
	
	private Date fechaEnvio;
	private Date horaEnvio;
	private String asunto;
	private String cuerpo;
	private boolean confirmacionLeido;
	private boolean confirmacionContestado;
	private String usuarioEnvio;
	
	public Mensajes(Date fechaEnvio, Date horaEnvio, String asunto, String cuerpo, boolean confirmacionLeido,
			boolean confirmacionContestado,String usuarioEnvio) {
		super();
		this.fechaEnvio = fechaEnvio;
		this.horaEnvio = horaEnvio;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.confirmacionLeido = confirmacionLeido;
		this.confirmacionContestado = confirmacionContestado;
		this.usuarioEnvio = usuarioEnvio;
	}
	
	
	
	public Mensajes(String asunto, String cuerpo) {
		this.asunto = asunto;
		this.cuerpo = cuerpo;
	}



	public Mensajes() {
		super();
	}



	public Mensajes(String cuerpo) {
		super();
		this.cuerpo = cuerpo;
	}


	

	public String getUsuarioEnvio() {
		return usuarioEnvio;
	}



	public void setUsuarioEnvio(String usuarioEnvio) {
		this.usuarioEnvio = usuarioEnvio;
	}



	public Date getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public Date getHoraEnvio() {
		return horaEnvio;
	}
	public void setHoraEnvio(Date horaEnvio) {
		this.horaEnvio = horaEnvio;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public boolean isConfirmacionLeido() {
		return confirmacionLeido;
	}
	public void setConfirmacionLeido(boolean confirmacionLeido) {
		this.confirmacionLeido = confirmacionLeido;
	}
	public boolean isConfirmacionContestado() {
		return confirmacionContestado;
	}
	public void setConfirmacionContestado(boolean confirmacionContestado) {
		this.confirmacionContestado = confirmacionContestado;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asunto == null) ? 0 : asunto.hashCode());
		result = prime * result + (confirmacionContestado ? 1231 : 1237);
		result = prime * result + (confirmacionLeido ? 1231 : 1237);
		result = prime * result + ((cuerpo == null) ? 0 : cuerpo.hashCode());
		result = prime * result + ((fechaEnvio == null) ? 0 : fechaEnvio.hashCode());
		result = prime * result + ((horaEnvio == null) ? 0 : horaEnvio.hashCode());
		result = prime * result + ((usuarioEnvio == null) ? 0 : usuarioEnvio.hashCode());
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
		Mensajes other = (Mensajes) obj;
		if (asunto == null) {
			if (other.asunto != null)
				return false;
		} else if (!asunto.equals(other.asunto))
			return false;
		if (confirmacionContestado != other.confirmacionContestado)
			return false;
		if (confirmacionLeido != other.confirmacionLeido)
			return false;
		if (cuerpo == null) {
			if (other.cuerpo != null)
				return false;
		} else if (!cuerpo.equals(other.cuerpo))
			return false;
		if (fechaEnvio == null) {
			if (other.fechaEnvio != null)
				return false;
		} else if (!fechaEnvio.equals(other.fechaEnvio))
			return false;
		if (horaEnvio == null) {
			if (other.horaEnvio != null)
				return false;
		} else if (!horaEnvio.equals(other.horaEnvio))
			return false;
		if (usuarioEnvio == null) {
			if (other.usuarioEnvio != null)
				return false;
		} else if (!usuarioEnvio.equals(other.usuarioEnvio))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Mensajes [fechaEnvio=" + fechaEnvio + ", horaEnvio=" + horaEnvio + ", asunto=" + asunto + ", cuerpo="
				+ cuerpo + ", confirmacionLeido=" + confirmacionLeido + ", confirmacionContestado="
				+ confirmacionContestado + ", usuarioEnvio=" + usuarioEnvio + "]";
	}




	
	
	
}
