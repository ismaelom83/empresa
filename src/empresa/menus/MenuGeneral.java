package empresa.menus;

public  class MenuGeneral {
	
	public static void menuPrincipal() {
		System.out.println("0. VOLVER AL LOGIN");
		System.out.println("1. Enviar correo a un compañero");
		System.out.println("2. Correo no Contestado");
		System.out.println("3. Correo no leido");
		System.out.println("4. Comprobar correo dia determinado");
		System.out.println("5. Comprobar correo entre fechas");
		System.out.println("6. Enviar correo al jefe de departamento");
		System.out.println("7. Enviar correo al jefe");
	};
	
	public static void menuLogin() {
		System.out.println("BIENVENIDO A La gestion de empresa");
		System.out.println("==================================\n");
		System.out.println("LOGIN DE USUARIO");
		System.out.println("==================================\n");
	};
	
	public static void menuRRHH() {
		System.out.println("8. Imprimir nomina trabajador");
		System.out.println("9. Imprimir nominas por departamento");
		System.out.println("10. Imprimir informe de gasto total");
		System.out.println("11. Dar de alta trabajador");
		System.out.println("12. Dar de baja logica trabajador");
		System.out.println("13. Buscar Trabajador");
	};
	
	
	public static void menuVentas() {
		
		System.out.println("8. Aplicar descuento a un articulo");
		System.out.println("9. Listar pagos");
		System.out.println("10. Imprimir todos los articulos");
		System.out.println("11. Buscar un articulo");
		System.out.println("12. Modificar un articulo");
		System.out.println("13. Informe de artículo más comprado");
		System.out.println("14. Informe de artículo menos comprado");
		System.out.println("15. Informe de artículo más comprado entre fechas");
		System.out.println("16. Informe de artículo menos comprado entre fechas");
	};
	
	public static void menuCompras() {
		System.out.println("8. Dar de alta articulo.");
		System.out.println("9. Dar de baja articulo");
		System.out.println("10. Imprimir todos los articulos");
		System.out.println("11. Buscar un articulo");
		System.out.println("12. Modificar un articulo");
		System.out.println("13. Informe de artículo más comprado");
		System.out.println("14. Informe de artículo menos comprado");
		System.out.println("15. Informe de artículo más comprado entre fechas");
		System.out.println("16. Informe de artículo menos comprado entre fechas");
		System.out.println("17. Hilos de comprobacion tabla articulos");
		System.out.println("18. Stop hilo de comprobacion");
	};
	
	public static void menuAtencionCliente() {
		System.out.println("8. Modificar cliente.");
		System.out.println("9. Imprimir ficha de todos los cliente");
		System.out.println("10. Buscar cliente");
		System.out.println("11. Enviar promoción a un cliente");
		System.out.println("12. Enviar promoción a todos los clientes");
	};
	
	public static void menuDireccion() {
		System.out.println("8. Despedir empleado");
		System.out.println("9. Informe de Ventas");
		System.out.println("10. Informe de Compras");
		System.out.println("11. Informe de Clientes");
		System.out.println("12. Informa de Personal");
		System.out.println("13. Revisar todas las bajas de lógicas de trabajadores");
		System.out.println("14. Revisar todas las bajas de lógicas de trabajadores por departamento");
		System.out.println("15. Revisar todas las bajas lógicas de clientes");
		System.out.println("16. Revisar todas las bajas lógicas de clientes por departamento");
		System.out.println("17. Subir salario");
	};
}
