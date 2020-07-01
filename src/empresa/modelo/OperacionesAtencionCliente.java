package empresa.modelo;

import empresa.abtraccion.InterfaceAtencionCliente;
import empresa.abtraccion.InterfaceTrabajadores;

public class OperacionesAtencionCliente implements InterfaceTrabajadores, InterfaceAtencionCliente{

	private Trabajadores t;

	
	
	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

	@Override
	public void modificarCliente() {
		// TODO Auto-generated method stub
		InterfaceAtencionCliente.super.modificarCliente();
	}

	@Override
	public void imprimirFichaCliente() {
		// TODO Auto-generated method stub
		InterfaceAtencionCliente.super.imprimirFichaCliente();
	}

	@Override
	public void buscarCliente() {
		// TODO Auto-generated method stub
		InterfaceAtencionCliente.super.buscarCliente();
	}

	@Override
	public void enviarPromocion() {
		// TODO Auto-generated method stub
		InterfaceAtencionCliente.super.enviarPromocion();
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
	
	
	
}
