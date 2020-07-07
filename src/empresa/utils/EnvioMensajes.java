package empresa.utils;

import java.util.Date;
import java.util.Scanner;

import empresa.modelo.Empresa;
import empresa.modelo.Mensajes;
import empresa.modelo.OpreracionesTrabajadores;
import empresa.modelo.Trabajadores;

public class EnvioMensajes {

	static Scanner sc;

	OpreracionesTrabajadores optra = new OpreracionesTrabajadores();
	Trabajadores tab = new Trabajadores();

	public void enviarMensajeMain(Empresa empresa,String usuarioEnvio) {
		sc = new Scanner(System.in);

		String asunto, cuerpo, codigoTrabajador;
		System.out.println("Introduce mensaje");
		System.out.println("Introduce destinatario mensaje: ");

		codigoTrabajador = sc.nextLine();

		System.out.println("Introduce Asunto Mensaje: ");

		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		tab = optra.enviarCorreo(codigoTrabajador, empresa);



		Mensajes mensaje = new Mensajes(new Date(), new Date(), asunto, cuerpo, false, false,usuarioEnvio);
		if (tab!=null) {
			tab.addMensaje(mensaje);
		}

	}

	public void enviarMensajeJefeEmpresa(Empresa empresa,String usuarioEnvio) {
		sc = new Scanner(System.in);
		String asunto, cuerpo, codigoTrabajador;
		codigoTrabajador = "jefeEmpresa";
		System.out.println("Introduce mensaje");
		System.out.println("Introduce Asunto Mensaje: ");

		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		tab = optra.enviarCorreo(codigoTrabajador, empresa);
		Mensajes mensaje = new Mensajes(new Date(), new Date(), asunto, cuerpo, false, false,usuarioEnvio);
		System.out.println(mensaje);
		tab.addMensaje(mensaje);

	}
	
	public void enviarMensajeJefeDepartamento(Empresa empresa,String codigoTrabajador,String usuarioEnvio) {
		sc = new Scanner(System.in);
		String asunto, cuerpo;
		System.out.println("Introduce mensaje");
		System.out.println("Introduce Asunto Mensaje: ");

		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		tab = optra.enviarCorreo(codigoTrabajador, empresa);
		Mensajes mensaje = new Mensajes(new Date(), new Date(), asunto, cuerpo, false, false,usuarioEnvio);
		tab.addMensaje(mensaje);

	}


}
