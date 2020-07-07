package empresa.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import empresa.abtraccion.InterfaceTrabajadores;

public class OpreracionesTrabajadores implements InterfaceTrabajadores {

	private Trabajadores t;

	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

	public Trabajadores enviarCorreo(String codigoTrabajador, Empresa empresa) {
		boolean b = false;

		String claveDepartamento;
		Iterator<String> departamentos = empresa.getDepartamento().keySet().iterator();
		while (departamentos.hasNext()) {
			claveDepartamento = departamentos.next();
			Departamento d = empresa.getDepartamento().get(claveDepartamento);
			String clave;
			Iterator<String> trabajadores = d.getTrabajador().keySet().iterator();
			while (trabajadores.hasNext()) {
				clave = trabajadores.next();
				if (clave.equals(codigoTrabajador)) {
					System.out.println("se ha encontrado el trabajador");
					b = true;
					System.out.println("Mensaje construido y enviado al usuario: " + codigoTrabajador);
					Trabajadores t = d.getTrabajador().get(clave);
					return t;
				}
			}
		}
		if (!b) {
			System.out.println("No existe el usuario: " + codigoTrabajador);
		}

		return null;

	}

	@Override
	public void comprobarCorreoNoContestado(ArrayList<Mensajes> mensajeComprobar) {
		for (Mensajes m : mensajeComprobar) {
			if (m.isConfirmacionContestado() == false) {
				System.out.println(
						"El usuario que te manda el correo es: " + m.getUsuarioEnvio() + "\n" + "Fecha de envio:"
								+ m.getFechaEnvio() + "\n" + "Asunto: " + m.getAsunto() + "\n" + "Cuerpo del mensaje:"
								+ m.getCuerpo() + "\n" + "Este mensaje esta leido? " + m.isConfirmacionLeido() + "\n"
								+ "Este mensaje Esta contestado? " + m.isConfirmacionContestado() + "\n");
				System.out.println("");
				System.out.println("------------------------------------------------------------");
			} else {
				System.out.println("Los mensajes han sido contestados");
			}
		}
	}

	@Override
	public void comprobarCorreoNoLeido(ArrayList<Mensajes> mensajeComprobar) {
		for (Mensajes m : mensajeComprobar) {
			if (m.isConfirmacionLeido() == false) {
				System.out.println(
						"El usuario que te manda el correo es: " + m.getUsuarioEnvio() + "\n" + "Fecha de envio:"
								+ m.getFechaEnvio() + "\n" + "Asunto: " + m.getAsunto() + "\n" + "Cuerpo del mensaje:"
								+ m.getCuerpo() + "\n" + "Este mensaje esta leido? " + m.isConfirmacionLeido() + "\n"
								+ "Este mensaje Esta contestado? " + m.isConfirmacionContestado() + "\n");
				System.out.println("");
				System.out.println("------------------------------------------------------------");
			} else {
				System.out.println("Los mensajes han sido leidos");
			}
		}
	}

	@Override
	public void comprobarCorreoDia() {
		// TODO Auto-generated method stub
		InterfaceTrabajadores.super.comprobarCorreoDia();
	}

	@Override
	public void comprobarCorreoIntervalo() {
		// TODO Auto-generated method stub
		InterfaceTrabajadores.super.comprobarCorreoIntervalo();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
