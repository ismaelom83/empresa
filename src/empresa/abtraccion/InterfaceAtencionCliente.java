package empresa.abtraccion;

import empresa.modelo.Clientes;
import empresa.modelo.Empresa;

public interface InterfaceAtencionCliente {
	
public default Clientes modificarCliente(String usuario, Empresa empresa,String passwor) {
	return null;};
public default void imprimirFichaCliente() {};
public default void buscarCliente() {};
public default void enviarPromocion() {};

	
}
