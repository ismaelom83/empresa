package empresa.utils;


import java.util.Scanner;

import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.Trabajadores;

public class EnvioMensajes {
	static Scanner sc;
	public  void enviarMensajeMain(Empresa empresa,Mensajes men,Trabajadores enviarMensajeTrabajador) {
		sc = new Scanner(System.in);
		
		
		String asunto, cuerpo, codigoTrabajador;
		System.out.println("Introduce mensaje");
		System.out.println("Introduce destinatario mensaje: ");

		codigoTrabajador = sc.nextLine();

		System.out.println("Introduce Asunto Mensaje: ");

		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		men = empresa.enviarCorreo(codigoTrabajador, asunto, cuerpo, empresa);

		System.out.println(men);

		enviarMensajeTrabajador.addMensaje(men);
	}
	
	public  void enviarMensajeJefeEmpresa(Empresa empresa,Mensajes men,Trabajadores enviarMensajeTrabajador) {
		sc = new Scanner(System.in); 
		String asunto, cuerpo, codigoTrabajador;
		codigoTrabajador = "jefeEmpresa";
		System.out.println("Introduce mensaje");
		System.out.println("Introduce Asunto Mensaje: ");
		
		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		men = empresa.enviarCorreo(codigoTrabajador, asunto, cuerpo, empresa);

		System.out.println(men);

		enviarMensajeTrabajador.addMensaje(men);
	}
	

}
