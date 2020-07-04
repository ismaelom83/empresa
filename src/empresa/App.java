package empresa;

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
import empresa.utils.CargaInicial;
import empresa.utils.EnvioMensajes;
import empresa.utils.SwhitchCase;

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
		Clientes comprobarCliente = new Clientes();
		ContadorRegistrosHilos c1 = new ContadorRegistrosHilos();
		Clientes cliente = new Clientes();
		Mensajes men = null;
		SwhitchCase sh = new SwhitchCase();
		sc = new Scanner(System.in);
		String usuario, contrasenya = null;
		cargaInicial.cargaInicial(empresa);
		int opcionFinal = 0;

		do {

			MenuGeneral.menuLogin();
			System.out.println("Introduce Usuario : ");

			usuario = sc.nextLine();

			System.out.println("Introduce Password: ");
			contrasenya = sc.nextLine();

			System.out.println("");
			
			comprobarCliente = empresa.validarClientes(usuario, contrasenya);
			comprobarTrabajador = empresa.validarTrabajador(usuario, contrasenya, empresa);

			if (comprobarTrabajador != null || comprobarCliente != null) {
				

				if (comprobarTrabajador != null) {
					
					sh.swhichTrabajadores(comprobarTrabajador);
				}
				if (comprobarCliente!=null) {
					sh.swhichClientes(comprobarCliente);
				}
				

				opcionFinal = 1;
			}
		} while (comprobarTrabajador == null || opcionFinal != 0);

		sc.close();

	}

}
