package empresa.modelo;

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

	@Override
	public Mensajes enviarCorreo(String codigoTrabajador, String asunto, String cuerpo,Empresa empresa) {
		boolean b = false;
		Mensajes m = new Mensajes(new Date(),new Date(),asunto,cuerpo,true,false);
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
					System.out.println("Mensaje construido y enviado al usuario: "+codigoTrabajador);
				
					return m;
				}
			}
		}
		if (!b) {
			System.out.println("No existe el usuario: "+codigoTrabajador);
		}
		
		
		return null;
		
	}

	@Override
	public void comprobarCorreoNoContestado() {
		// TODO Auto-generated method stub
		InterfaceTrabajadores.super.comprobarCorreoNoContestado();
	}

	@Override
	public void comprobarCorreoNoLeido() {
		// TODO Auto-generated method stub
		InterfaceTrabajadores.super.comprobarCorreoNoLeido();
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
