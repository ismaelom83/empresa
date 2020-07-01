package empresa;

import java.util.HashMap;
import java.util.Scanner;

import empresa.conexion.OperacionesBD;
import empresa.menus.MenuGeneral;
import empresa.modelo.Departamento;
import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.OpreracionesTrabajadores;
import empresa.modelo.Trabajadores;
import empresa.thread.ContadorRegistrosHilos;
import empresa.utils.CargaInicial;
import empresa.utils.EnvioMensajes;

public class App {

	static Scanner sc;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		CargaInicial cargaInicial = new CargaInicial();
		EnvioMensajes envioMensajes = new EnvioMensajes();
		OperacionesBD opeBd = new OperacionesBD();
		Empresa empresa = new Empresa("my empresa", new HashMap<String, Departamento>());
		OpreracionesTrabajadores optra = null;
		Departamento departamento = new Departamento();
		Trabajadores comprobarTrabajador = new Trabajadores();
		Trabajadores enviarMensajeTrabajador = new Trabajadores();
		ContadorRegistrosHilos c1  = new ContadorRegistrosHilos();
		Thread t1 = new Thread(c1);
		Mensajes men = null;
		sc = new Scanner(System.in);
		String usuario, contrasenya = null;
		cargaInicial.cargaInicial(empresa);
		int opcionFinal = 0;

		do {

			MenuGeneral.menuLogin();
			System.out.println("Introduce Usuario: ");

			usuario = sc.nextLine();

			System.out.println("Introduce Password: ");
			contrasenya = sc.nextLine();

			System.out.println("");

			comprobarTrabajador = empresa.validarTrabajador(usuario, contrasenya, empresa);

			if (comprobarTrabajador != null) {

				System.out.println("Se ha encontrado al trabajador: " + comprobarTrabajador.getUsuario()
						+ "\n" + "En el departamento de: " + comprobarTrabajador.getDepartamento().toUpperCase());
				System.out.println("");
				switch (comprobarTrabajador.getDepartamento()) {
				case "ventas":
					int opcion = 0;

					do {
						System.out.println("DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase());
						System.out.println("");
						MenuGeneral.menuPrincipal();
						MenuGeneral.menuVentas();
						opcion = Integer.parseInt(sc.nextLine());
						System.out.println("");
						switch (opcion) {
						case 1:
							envioMensajes.enviarMensajeMain(empresa, men,enviarMensajeTrabajador);
							break;
						case 2:
							System.out.println("Mensajes no contestados: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 3:
							System.out.println("Mensajes no Leidos: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 7:
							envioMensajes.enviarMensajeJefeEmpresa(empresa, men, enviarMensajeTrabajador);
							break;
						case 10:
							opeBd.mostrarBuscarTodosArticulos();
							break;
						case 11:

							int id2;
							System.out.println("Busqueda de articulos");
							System.out.println("Introduce el id del aticulo a buscar: ");
							id2 = Integer.parseInt(sc.nextLine());
							System.out.println("");

							opeBd.mostrarBuscarArticulos(id2);

							break;
					
						case 0:
							System.out.println("HAS VUELTO AL LOGIN!");
							System.out.println("");
							break;
						default:
							break;
						}

					} while (opcion != 0);
					break;
				case "compras":
					int opcion2 = 0;
					do {
						System.out.println("DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase());
						System.out.println("");
						MenuGeneral.menuPrincipal();
						MenuGeneral.menuCompras();
						opcion2 = Integer.parseInt(sc.nextLine());
						System.out.println("");
						switch (opcion2) {
						case 1:
							envioMensajes.enviarMensajeMain(empresa, men,enviarMensajeTrabajador);
							break;
						case 2:
							System.out.println("Mensajes no contestados: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 3:
							System.out.println("Mensajes no Leidos: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
							case 7:
								envioMensajes.enviarMensajeJefeEmpresa(empresa, men, enviarMensajeTrabajador);
								break;
						case 8:
							String nombre = null;
							float precio;
							System.out.println("Introduce nombre del articulo: ");
							nombre = sc.nextLine();

							System.out.println("Introduce precio del articulo: ");
							precio = Float.parseFloat(sc.nextLine());
							System.out.println("");

							opeBd.mostrarInsertarArticulos(nombre, precio);

							break;
						case 9:

							int id;

							System.out.println("Borrado de articulos");
							System.out.println("Introduce el id del aticulo a borrar: ");
							id = Integer.parseInt(sc.nextLine());
							System.out.println("");

							opeBd.mostrarBorraArticulos(id);

							break;
						case 10:
							opeBd.mostrarBuscarTodosArticulos();
							break;
						case 11:

							int id2;

							System.out.println("Busqueda de articulos");
							System.out.println("Introduce el id del aticulo a buscar: ");
							id2 = Integer.parseInt(sc.nextLine());
							System.out.println("");

							opeBd.mostrarBuscarArticulos(id2);

							break;
						case 17:
							t1.start();
							break;
						case 18:
							c1.stop();
							break;
						case 0:
							System.out.println("HAS VUELTO AL LOGIN!");
							System.out.println("");
							break;
						default:
							break;
						}

					} while (opcion2 != 0);
					break;
				case "RRHH":
					int opcion3 = 0;
					do {
						System.out.println("DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase());
						System.out.println("");
						MenuGeneral.menuPrincipal();
						MenuGeneral.menuRRHH();
						opcion3 = Integer.parseInt(sc.nextLine());
						System.out.println("");
						switch (opcion3) {
						case 1:
							envioMensajes.enviarMensajeMain(empresa, men,enviarMensajeTrabajador);
							break;
						case 2:
							System.out.println("Mensajes no contestados: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 3:
							System.out.println("Mensajes no Leidos: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 7:
							envioMensajes.enviarMensajeJefeEmpresa(empresa, men, enviarMensajeTrabajador);
							break;
						case 0:
							System.out.println("HAS VUELTO AL LOGIN!");
							System.out.println("");
							break;
						default:
							break;
						}

					} while (opcion3 != 0);
					break;
				case "direccion":
					int opcion4 = 0;
					do {
						System.out.println("DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase());
						System.out.println("");
						MenuGeneral.menuPrincipal();
						MenuGeneral.menuDireccion();
						opcion4 = Integer.parseInt(sc.nextLine());
						System.out.println("");
						switch (opcion4) {
						case 1:
							envioMensajes.enviarMensajeMain(empresa, men,enviarMensajeTrabajador);
							break;
						case 2:
							System.out.println("Mensajes no contestados: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 3:
							System.out.println("Mensajes no Leidos: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 0:
							System.out.println("HAS VUELTO AL LOGIN!");
							System.out.println("");
							break;
						default:
							break;
						}

					} while (opcion4 != 0);
					break;
				case "atencionCliente":
					int opcion5 = 0;
					do {
						System.out.println("DEPARTAMENTO DE " + comprobarTrabajador.getTipo().toUpperCase());
						System.out.println("");
						MenuGeneral.menuPrincipal();
						MenuGeneral.menuAtencionCliente();
						opcion5 = Integer.parseInt(sc.nextLine());
						System.out.println("");
						switch (opcion5) {
						case 1:
							envioMensajes.enviarMensajeMain(empresa, men,enviarMensajeTrabajador);
							break;
						case 2:
							System.out.println("Mensajes no contestados: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 3:
							System.out.println("Mensajes no Leidos: ");
							System.out.println(enviarMensajeTrabajador.getMensaje());
							break;
						case 8:
							String nombre1, nombre2 = null;
							System.out.println("Introduce el nombre del cliente que quieres actualizar");
							nombre1 = sc.nextLine();

							System.out.println("Introduce el nuevo nombre para el cliente");
							nombre2 = sc.nextLine();

							opeBd.mostrarActualizarNombre(nombre2, nombre1);

							break;
						case 9:
							opeBd.mostrarConsultar();
							break;
						case 10:
							String nombre;
							System.out.println("Busqueda de cliente por nombre");
							System.out.println("Introduce nombre");
							nombre = sc.nextLine();
							opeBd.mostrarConsultarNombre(nombre);
							break;
						case 7:
							envioMensajes.enviarMensajeJefeEmpresa(empresa, men, enviarMensajeTrabajador);
							break;
						case 0:
							System.out.println("HAS VUELTO AL LOGIN!");
							System.out.println("");
							break;
						}

					} while (opcion5 != 0);
				}

				opcionFinal = 1;
			}
		} while (comprobarTrabajador == null || opcionFinal != 0);

		sc.close();

	}

}
