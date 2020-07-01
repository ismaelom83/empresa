package empresa.abtraccion;





public interface InterfaceRRHH {
	
	public default void nominaTrabajador() {};
	public default void nominaDepartamentos() {};
	public default void gastoTotal() {};
	public default boolean altaTrabajador(String nombre, String apellido,float salario,String contrasenya,boolean jefeONo) {
		return false;};
	public default void bajaLogicaTrabajador() {};
	public default void buscarTrabajador() {};
	public default void buscarDepartamento() {};
}
