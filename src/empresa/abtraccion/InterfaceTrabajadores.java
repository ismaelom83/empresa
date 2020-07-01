package empresa.abtraccion;


import empresa.modelo.Trabajadores;

public interface InterfaceTrabajadores {
	
	public default  Trabajadores enviarCorreo(String codigoTrabajador, String asunto, String cuerpo) {
		return null;};
	public default  void comprobarCorreoNoContestado() {};
	public default  void comprobarCorreoNoLeido() {};
	public default void comprobarCorreoDia() {};
	public default  void comprobarCorreoIntervalo() {};
}

