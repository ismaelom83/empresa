package empresa;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import empresa.conexion.OperacionesBD;
import empresa.menus.MenuGeneral;
import empresa.modelo.Clientes;
import empresa.modelo.Departamento;
import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.OperacionesDirecciones;
import empresa.modelo.OpreracionesTrabajadores;
import empresa.modelo.Trabajadores;
import empresa.thread.ContadorRegistrosHilos;
import empresa.utils.CargaInicial;
import empresa.utils.EnvioMensajes;
import empresa.utils.SwhitchCase;

public class App {

	static Scanner sc;
	private static Logger logger = LogManager.getLogger(SwhitchCase.class);
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String methodName = App.class.getSimpleName() + ".main()";
		CargaInicial cargaInicial = new CargaInicial();
		EnvioMensajes envioMensajes = new EnvioMensajes();
		OperacionesBD opeBd = new OperacionesBD();
		Empresa empresa = new Empresa("my empresa", new HashMap<String, Departamento>(),new HashMap<String, Clientes>());
		OpreracionesTrabajadores optra = null;
		Departamento departamento = new Departamento(new HashMap<String, Trabajadores>());
		Trabajadores comprobarTrabajador = new Trabajadores();
		Trabajadores enviarMensajeTrabajador = new Trabajadores();		
		ContadorRegistrosHilos c1 = new ContadorRegistrosHilos();
		Clientes comprobarCliente = new Clientes();
		Clientes cliente = new Clientes();
		OperacionesDirecciones opdic = new OperacionesDirecciones();
		Mensajes men = null;
		SwhitchCase sh = new SwhitchCase();
		sc = new Scanner(System.in);
		String usuario, contrasenya = null;
		cargaInicial.cargaInicial(empresa);
		int opcionFinal = 0;
		

		do {
	//pedimos las credenciales del login
			MenuGeneral.menuLogin();
			System.out.println("Introduce Usuario : ");

			usuario = sc.nextLine();

			System.out.println("Introduce Password: ");
			contrasenya = sc.nextLine();

			System.out.println("");
					
		
			//comprobamos el cliente que esta en la base de datos
				comprobarCliente =	opeBd.mostrarLogin(usuario,contrasenya,cliente);
				//comprobamos el trabajador que esta almacenado en local
				comprobarTrabajador = empresa.validarTrabajador(usuario, contrasenya, empresa);

			if (comprobarTrabajador != null || comprobarCliente != null) {
				
				

				//si el trabajador no es nulo mostramos el swicht case del trabajador
				if (comprobarTrabajador != null) {		
					sh.swhichTrabajadores(comprobarTrabajador,empresa);	
					
				}
				//si el trabajador no es nulo mostramos el swicht case del cliente
				if (comprobarCliente!=null) {
					sh.swhichClientes(empresa,comprobarCliente);
				}
				

				opcionFinal = 1;
			}
		} while (comprobarTrabajador == null || opcionFinal != 0);

		sc.close();

	}

}
