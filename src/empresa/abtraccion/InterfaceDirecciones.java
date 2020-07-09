package empresa.abtraccion;

import java.util.HashMap;

import empresa.modelo.Empresa;
import empresa.modelo.Trabajadores;

public interface InterfaceDirecciones {
	
	public default HashMap<String, Trabajadores>despedirEmpleado(String usuario, Empresa empresa) {
		return null;};
	public default void informeVentas() {};
	public default void informeCompras() {};
	public default void informeClientes() {};
	public default void informepersonal() {};
	public default void bajaLogicaTrabajadores() {};
	public default void bajaLogicaClientes() {};
	public default void subirSueldo(Trabajadores t,float salario) {};	
}
