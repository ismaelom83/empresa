package empresa.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import empresa.conexion.OperacionesBD;
import empresa.menus.MenuGeneral;
import empresa.modelo.Clientes;
import empresa.modelo.Departamento;
import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.OperacionesAtencionCliente;
import empresa.modelo.OperacionesRRHH;
import empresa.modelo.OpreracionesTrabajadores;
import empresa.modelo.Trabajadores;
import empresa.thread.ContadorRegistrosHilos;
import empresa.thread.PruebaSynzcronize;

public class SwhitchCase {

	private static Logger logger = LogManager.getLogger(SwhitchCase.class);
	String methodName = SwhitchCase.class.getSimpleName() + ".SwhitchCase()";
	static Scanner sc = new Scanner(System.in);
	CargaInicial cargaInicial = new CargaInicial();
	EnvioMensajes envioMensajes = new EnvioMensajes();
	OperacionesBD opeBd = new OperacionesBD();
	OpreracionesTrabajadores optra = new OpreracionesTrabajadores();
	Departamento departamento = new Departamento();
	Trabajadores comprobarTrabajador = new Trabajadores();
	Trabajadores operacionesTrabajadores = new Trabajadores();
	Clientes comprobarCliente = new Clientes();
	ContadorRegistrosHilos c1 = new ContadorRegistrosHilos();
	OperacionesAtencionCliente operacionesAT = new OperacionesAtencionCliente();
	OperacionesRRHH opRH = new OperacionesRRHH();
	Clientes cliente = new Clientes();
	Mensajes men = new Mensajes();
	ArrayList<Mensajes> mensajeComprobar = new ArrayList<>();

	String usuario, contrasenya = null;
	int opcionFinal = 0;

	public SwhitchCase() {
		super();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void swhichTrabajadores(Trabajadores comprobarTrabajador, Empresa empresa) {

		System.out.println("Se ha encontrado al trabajador: " + comprobarTrabajador.getNombre() + " "
				+ comprobarTrabajador.getApellido1() + "\n" + "En el departamento de: "
				+ comprobarTrabajador.getDepartamento().toUpperCase() + "\n" + "Tipo trabajador: "
				+ comprobarTrabajador.getTipo() + "\n");
		switch (comprobarTrabajador.getDepartamento()) {
		case "ventas":
			int opcion = 0;

			do {
				System.out.println("");
				System.out.println("*********** DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase()
						+ " **************");
				System.out.println("");
				MenuGeneral.menuPrincipal();
				MenuGeneral.menuVentas();
				opcion = Integer.parseInt(sc.nextLine());
				System.out.println("");
				switch (opcion) {
				case 1:
					envioMensajes.enviarMensajeMain(empresa, comprobarTrabajador.getUsuario());
					break;
				case 2:
					System.out.println("Mensajes no contestados: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoContestado(mensajeComprobar);
					break;
				case 3:
					System.out.println("Mensajes no Leidos: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoLeido(mensajeComprobar);
					comprobarTrabajador.setearNoLeidos(mensajeComprobar);
					break;
				case 6:
					String codigoTrabajador = "jefeVentas";
					envioMensajes.enviarMensajeJefeDepartamento(empresa, codigoTrabajador,
							comprobarTrabajador.getUsuario());
					break;
				case 7:
					envioMensajes.enviarMensajeJefeEmpresa(empresa, comprobarTrabajador.getUsuario());
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
				System.out.println("");
				System.out.println("*********** DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase()
						+ " **************");
				System.out.println("");
				MenuGeneral.menuPrincipal();
				MenuGeneral.menuCompras();
				opcion2 = Integer.parseInt(sc.nextLine());
				System.out.println("");
				switch (opcion2) {
				case 1:
					envioMensajes.enviarMensajeMain(empresa, comprobarTrabajador.getUsuario());
					break;
				case 2:
					System.out.println("Mensajes no contestados: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoContestado(mensajeComprobar);
					break;
				case 3:
					System.out.println("Mensajes no Leidos: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoLeido(mensajeComprobar);
					comprobarTrabajador.setearNoLeidos(mensajeComprobar);
					break;
				case 6:
					String codigoTrabajador = "jefeCompras";
					envioMensajes.enviarMensajeJefeDepartamento(empresa, codigoTrabajador,
							comprobarTrabajador.getUsuario());
					break;
				case 7:
					envioMensajes.enviarMensajeJefeEmpresa(empresa, comprobarTrabajador.getUsuario());
					break;
				case 8:
					String nombre = null;
					float precio;
					System.out.println("Introduce nombre del articulo: ");
					nombre = sc.nextLine();

					System.out.println("Introduce precio del articulo: ");
					precio = Float.parseFloat(sc.nextLine());
					System.out.println("");
					try {
						final PruebaSynzcronize p = new PruebaSynzcronize();

						new Thread() {
							@Override
							public void run() {
								try {
									p.insertarSincronizado();
								} catch (InterruptedException ex) {
									Logger.getLogger(SwhitchCase.class.getName()).log(null, ex);
								}
							}
						}.start();

						Thread.sleep(2000);

						new Thread() {
							@Override
							public void run() {
								try {
									p.mostrarSinc();
								} catch (InterruptedException ex) {
									Logger.getLogger(SwhitchCase.class.getName()).log(null, ex);
								}
							}
						}.start();
					} catch (InterruptedException ex) {
						Logger.getLogger(SwhitchCase.class.getName()).log(null, ex);
					}
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
					break;
				case 18:
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
				System.out.println("");
				System.out.println("*********** DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase()
						+ " **************");
				System.out.println("");
				MenuGeneral.menuPrincipal();
				MenuGeneral.menuRRHH();
				opcion3 = Integer.parseInt(sc.nextLine());
				System.out.println("");
				switch (opcion3) {
				case 1:
					envioMensajes.enviarMensajeMain(empresa, comprobarTrabajador.getUsuario());
					break;
				case 2:
					System.out.println("Mensajes no contestados: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoContestado(mensajeComprobar);
					break;
				case 3:
					System.out.println("Mensajes no Leidos: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoLeido(mensajeComprobar);
					comprobarTrabajador.setearNoLeidos(mensajeComprobar);
					break;
				case 6:
					String codigoTrabajador = "jefeRRHH";
					envioMensajes.enviarMensajeJefeDepartamento(empresa, codigoTrabajador,
							comprobarTrabajador.getUsuario());
					break;
				case 7:
					envioMensajes.enviarMensajeJefeEmpresa(empresa, comprobarTrabajador.getUsuario());
					break;
				case 8:
					String trabajadorNominas;
					System.out.println("Introduce el nombre de usuario del trabajador que quieres buscar");
					trabajadorNominas = sc.nextLine();
					operacionesTrabajadores = opRH.buscarTrabajador(trabajadorNominas, empresa);
					if (operacionesTrabajadores != null) {
						opRH.nominaTrabajador(operacionesTrabajadores);
					} else {
						System.out.println("El trabajador " + trabajadorNominas + " no existe");
					}

					break;
				case 13:
					String trabajador5 = null;
					System.out.println("Introduce el nombre de usuario del trabajador que quieres buscar");
					trabajador5 = sc.nextLine();

					operacionesTrabajadores = opRH.buscarTrabajador(trabajador5, empresa);

					if (operacionesTrabajadores != null) {
						System.out.println("******* FICHA TRABAJADOR *********");
						System.out.println("");
						System.out.println("NOMBRE: " + operacionesTrabajadores.getNombre() + "\n" + "APELLIDO: "
								+ operacionesTrabajadores.getApellido1() + "\n" + "ES DE TIPO: "
								+ operacionesTrabajadores.getTipo() + "\n" + "ES JEFE? "
								+ operacionesTrabajadores.isJefeOnO() + "\n" + "SU CODIGO ES: "
								+ operacionesTrabajadores.getCodigo() + "\n" + "PERTENECE AL DEPARTAMENTO DE: "
								+ operacionesTrabajadores.getDepartamento() + "\n");
					} else {
						System.out.println("El trabajador " + trabajador5 + " no existe");
					}

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
				System.out.println("");
				System.out.println("*********** DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase()
						+ " **************");
				System.out.println("");
				MenuGeneral.menuPrincipal();
				MenuGeneral.menuDireccion();
				opcion4 = Integer.parseInt(sc.nextLine());
				System.out.println("");
				switch (opcion4) {
				case 1:
					envioMensajes.enviarMensajeMain(empresa, comprobarTrabajador.getUsuario());
					break;
				case 2:
					System.out.println("Mensajes no contestados: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoContestado(mensajeComprobar);
					break;
				case 3:
					System.out.println("Mensajes no Leidos: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoLeido(mensajeComprobar);
					comprobarTrabajador.setearNoLeidos(mensajeComprobar);
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
				System.out.println("");
				System.out.println("*********** DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase()
						+ " **************");
				System.out.println("");
				MenuGeneral.menuPrincipal();
				MenuGeneral.menuAtencionCliente();
				opcion5 = Integer.parseInt(sc.nextLine());
				System.out.println("");
				switch (opcion5) {
				case 1:
					envioMensajes.enviarMensajeMain(empresa, comprobarTrabajador.getUsuario());
					break;
				case 2:
					System.out.println("Mensajes no contestados: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoContestado(mensajeComprobar);
					break;
				case 3:
					System.out.println("Mensajes no Leidos: ");
					System.out.println("");
					mensajeComprobar = comprobarTrabajador.comprobarMensajes(comprobarTrabajador);
					optra.comprobarCorreoNoLeido(mensajeComprobar);
					comprobarTrabajador.setearNoLeidos(mensajeComprobar);
					break;
				case 8:
					String nombre1, password;

					System.out.println("Introduce el nombre de usuario del cliente que quieres actualizar");
					nombre1 = sc.nextLine();

					System.out.println("Introduce la nueva password para el cliente");
					password = sc.nextLine();

					opeBd.mostrarActualizarNombre(password, nombre1);

					break;
				case 9:
					String nombreCliente;
					System.out.println("Imprimir ficha cliente");
					System.out.println("Introduce cliente a buscar por su usuario: ");
					nombreCliente = sc.nextLine();
					System.out.println("*********FICHA DEL CLIENTE***************");
					System.out.println("");
					opeBd.mostrarConsultarNombre(nombreCliente);
					break;
//				case 10:
//					String nombreCliente2;
//					System.out.println("Modificar Cliente: ");
//					System.out.println("Introduce el nombre de usuario del cliente: ");
//					nombreCliente2 = sc.nextLine();
//					operacionesAT.modificarCliente(nombreCliente2, empresa);
//					break;
				case 7:
					envioMensajes.enviarMensajeJefeEmpresa(empresa, comprobarTrabajador.getUsuario());
					break;
				case 0:
					System.out.println("HAS VUELTO AL LOGIN!");
					System.out.println("");
					break;
				}

			} while (opcion5 != 0);
			break;
		}// sw1
	}

	public void swhichClientes(Empresa empresa, Clientes comprobarClientes) {
		System.out.println("");
		System.out.println("Bienvenido Cliente: " + comprobarClientes.getUsuario() + "\n" + "Tienes un saldo de: "
				+ comprobarClientes.getSaldo() + "€" + "\n");
		switch (comprobarClientes.getTipo()) {
		case "cliente":
			int opcion6 = 0;
			do {
				System.out.println("");
				System.out.println("******* MENU DEL CLIENTE ***************");
				System.out.println("");
				MenuGeneral.menuCliente();
				opcion6 = Integer.parseInt(sc.nextLine());
				System.out.println("");

				switch (opcion6) {
				case 1:
					System.out.println("*********FICHA DEL CLIENTE***************");
					System.out.println("");
					opeBd.mostrarConsultarNombre(comprobarClientes.getUsuario());

					System.out.println("");

					break;
				case 2:
					int idArticulo;
					System.out.println("Realizar compra de articulo");
					System.out.println("Inserte el codigo del articulo que quieres comprar");
					idArticulo = Integer.parseInt(sc.nextLine());
					opeBd.mostrarCompra(idArticulo, comprobarClientes.getIdCliente());

					break;
				case 3:
					Thread t1 = new Thread(c1);
					t1.start();
					logger.info(String.format("hilo en marcha.", methodName));
					break;
				case 4:
					c1.stop();
					logger.info(String.format("Hilo parado.", methodName));
					break;
				default:
					break;
				}

			} while (opcion6 != 0);

		default:
			break;
		}
	}

}