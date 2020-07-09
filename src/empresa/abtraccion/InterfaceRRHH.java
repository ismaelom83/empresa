package empresa.abtraccion;

import empresa.modelo.Empresa;
import empresa.modelo.Trabajadores;

public interface InterfaceRRHH {
	
	public default void nominaTrabajador(Trabajadores trab) {};
	public default void nominaDepartamentos() {};
	public default void gastoTotal() {};
	public default void bajaLogicaTrabajador() {};
	public default Trabajadores buscarTrabajador(String usuario,Empresa empresa) {
		return null;};
	public default void buscarDepartamento() {};
}
