package empresa.abtraccion;

public interface InterfaceCompraVenta {
	
	public default void imprimirFichaProducto() {};
	public default void buscarProducto() {};
	public default void modificarProducto() {};
	public default void informeArticuloMasComprado() {};
	public default void informeArticuloMenosComprado() {};
	public default void informeArticuloMasCompradoIntervalo() {};
	public default void informeArticuloMenosCompradoIntervalo() {};
}
