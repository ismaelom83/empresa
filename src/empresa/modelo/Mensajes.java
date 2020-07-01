package empresa.modelo;

import java.util.Date;

public class Mensajes {
	
	private Date fechaEnvio;
	private Date horaEnvio;
	private String asunto;
	private String cuerpo;
	private boolean confirmacionLeido;
	private boolean confirmacionContestado;
	public Mensajes(Date fechaEnvio, Date horaEnvio, String asunto, String cuerpo, boolean confirmacionLeido,
			boolean confirmacionContestado) {
		super();
		this.fechaEnvio = fechaEnvio;
		this.horaEnvio = horaEnvio;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.confirmacionLeido = confirmacionLeido;
		this.confirmacionContestado = confirmacionContestado;
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
	public String toString() {
		return "Mensajes [fechaEnvio=" + fechaEnvio + ", horaEnvio=" + horaEnvio + ", asunto=" + asunto + ", cuerpo="
				+ cuerpo + ", confirmacionLeido=" + confirmacionLeido + ", confirmacionContestado="
				+ confirmacionContestado + "]";
	}
	
	
	
}
