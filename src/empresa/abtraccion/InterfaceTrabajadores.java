package empresa.abtraccion;


import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.Trabajadores;

public interface InterfaceTrabajadores {
	
	public default  Mensajes enviarCorreo(String codigoTrabajador, String asunto, String cuerpo,Empresa empresa) {
		return null;};
	public default  void comprobarCorreoNoContestado() {};
	public default  void comprobarCorreoNoLeido() {};
	public default void comprobarCorreoDia() {};
	public default  void comprobarCorreoIntervalo() {}

}

