package empresa.modelo;

import java.util.ArrayList;

import empresa.abtraccion.InterfaceDirecciones;
import empresa.abtraccion.InterfaceTrabajadores;

public class OperacionesDirecciones implements InterfaceDirecciones, InterfaceTrabajadores {
	
	
	
	private Trabajadores t;

	
	
	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}



	@Override
	public void comprobarCorreoNoContestado(ArrayList<Mensajes> mensajeComprobar) {
	}

	@Override
	public void comprobarCorreoNoLeido(ArrayList<Mensajes> mensajeComprobar) {
		// TODO Auto-generated method stub
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
	public void despedirEmpleado() {
		
		System.out.println(t.getUsuario());
	}

	@Override
	public void informeVentas() {
		// TODO Auto-generated method stub
		InterfaceDirecciones.super.informeVentas();
	}

	@Override
	public void informeCompras() {
		// TODO Auto-generated method stub
		InterfaceDirecciones.super.informeCompras();
	}

	@Override
	public void informeClientes() {
		// TODO Auto-generated method stub
		InterfaceDirecciones.super.informeClientes();
	}

	@Override
	public void informepersonal() {
		// TODO Auto-generated method stub
		InterfaceDirecciones.super.informepersonal();
	}

	@Override
	public void bajaLogicaTrabajadores() {
		// TODO Auto-generated method stub
		InterfaceDirecciones.super.bajaLogicaTrabajadores();
	}

	@Override
	public void bajaLogicaClientes() {
		// TODO Auto-generated method stub
		InterfaceDirecciones.super.bajaLogicaClientes();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
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
