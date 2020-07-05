package empresa.utils;

import java.util.HashMap;
import java.util.Scanner;

import empresa.conexion.OperacionesBD;
import empresa.menus.MenuGeneral;
import empresa.modelo.Clientes;
import empresa.modelo.Departamento;
import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.OpreracionesTrabajadores;
import empresa.modelo.Trabajadores;
import empresa.thread.ContadorRegistrosHilos;

public class SwhitchCase {

	static Scanner sc = new Scanner(System.in);
	CargaInicial cargaInicial = new CargaInicial();
	EnvioMensajes envioMensajes = new EnvioMensajes();
	OperacionesBD opeBd = new OperacionesBD();
	OpreracionesTrabajadores optra = null;
	Departamento departamento = new Departamento();
	Trabajadores comprobarTrabajador = new Trabajadores();
	Trabajadores enviarMensajeTrabajador = new Trabajadores();
	Clientes comprobarCliente = new Clientes();
	ContadorRegistrosHilos c1 = new ContadorRegistrosHilos();
	Clientes cliente = new Clientes();
	Mensajes men = new Mensajes();
	
	String usuario, contrasenya = null;
	int opcionFinal = 0;

	public SwhitchCase() {
		super();
	}
	
	
	public void swhichTrabajadores(Trabajadores comprobarTrabajador,Empresa empresa) {
	
		System.out.println("Se ha encontrado al trabajador: " + comprobarTrabajador.getNombre() + " "
				+ comprobarTrabajador.getApellido1() + "\n" + "En el departamento de: "
				+ comprobarTrabajador.getDepartamento().toUpperCase());
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
					envioMensajes.enviarMensajeMain(empresa, men, enviarMensajeTrabajador);
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
					envioMensajes.enviarMensajeMain(empresa, men, enviarMensajeTrabajador);
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
				System.out.println("DEPARTAMENTO DE " + comprobarTrabajador.getDepartamento().toUpperCase());
				System.out.println("");
				MenuGeneral.menuPrincipal();
				MenuGeneral.menuRRHH();
				opcion3 = Integer.parseInt(sc.nextLine());
				System.out.println("");
				switch (opcion3) {
				case 1:
					envioMensajes.enviarMensajeMain(empresa, men, enviarMensajeTrabajador);
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
					envioMensajes.enviarMensajeMain(empresa, men, enviarMensajeTrabajador);
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
					envioMensajes.enviarMensajeMain(empresa, men, enviarMensajeTrabajador);
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
			break;
		}// sw1
	}

	public void swhichClientes(Clientes comprobarCliente,Empresa empresa) {
		System.out.println("Se ha encontrado al cliente: "+comprobarCliente.getUsuario());
		System.out.println("");
		switch (comprobarCliente.getTipo()) {
		case "cliente":
			int opcion6 = 0;
			do {
				System.out.println("MENU DEL " + comprobarCliente.getTipo().toUpperCase());
				System.out.println("");
				MenuGeneral.menuCliente();
				opcion6 = Integer.parseInt(sc.nextLine());
				System.out.println("");

				switch (opcion6) {
				case 1:
					break;
				case 2:
					int idArticulo;
					System.out.println("Realizar compra de articulo");
					System.out.println("Inserte el codigo del articulo que quieres comprar");
					idArticulo = Integer.parseInt(sc.nextLine());
					opeBd.mostrarCompra(idArticulo, comprobarCliente.getIdCliente());
					break;
				case 3:
					Thread t1 = new Thread(c1);
					t1.start();
					break;
				case 4:
					c1.stop();
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