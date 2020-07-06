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

	public void enviarMensajeMain(Empresa empresa) {
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



		Mensajes mensaje = new Mensajes(new Date(), new Date(), asunto, cuerpo, true, false);
		tab.addMensaje(mensaje);

	}

	public void enviarMensajeJefeEmpresa(Empresa empresa) {
		sc = new Scanner(System.in);
		String asunto, cuerpo, codigoTrabajador;
		codigoTrabajador = "jefeEmpresa";
		System.out.println("Introduce mensaje");
		System.out.println("Introduce Asunto Mensaje: ");

		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		tab = optra.enviarCorreo(codigoTrabajador, asunto, cuerpo, empresa);
		Mensajes mensaje = new Mensajes(new Date(), new Date(), asunto, cuerpo, true, false);
		tab.addMensaje(mensaje);

	}
	
	public void enviarMensajeJefeDepartamento(Empresa empresa,String codigoTrabajador) {
		sc = new Scanner(System.in);
		String asunto, cuerpo;
//		codigoTrabajador = tab.isJefeOnO(codigoTrabajador);
		System.out.println("Introduce mensaje");
		System.out.println("Introduce Asunto Mensaje: ");

		asunto = sc.nextLine();

		System.out.println("Introduce Cuerpo Mensaje: ");
		cuerpo = sc.nextLine();

		tab = optra.enviarCorreo(codigoTrabajador, asunto, cuerpo, empresa);
		Mensajes mensaje = new Mensajes(new Date(), new Date(), asunto, cuerpo, true, false);
		tab.addMensaje(mensaje);

	}


}
