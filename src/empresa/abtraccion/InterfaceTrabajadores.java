package empresa.abtraccion;


import java.util.ArrayList;

import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.Trabajadores;

public interface InterfaceTrabajadores {
	
	public default Trabajadores enviarCorreo(String codigoTrabajador, String asunto, String cuerpo,Empresa empresa) {
		return null;};
	public default  void comprobarCorreoNoContestado(ArrayList<Mensajes> mensajeComprobar) {};
	public default  void comprobarCorreoNoLeido(ArrayList<Mensajes> mensajeComprobar) {};
	public default void comprobarCorreoDia() {};
	public default  void comprobarCorreoIntervalo() {}

}

