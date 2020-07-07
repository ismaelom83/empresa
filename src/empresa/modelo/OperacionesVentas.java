package empresa.modelo;

import java.util.ArrayList;

import empresa.abtraccion.InterfaceCompraVenta;
import empresa.abtraccion.InterfaceTrabajadores;
import empresa.abtraccion.InterfaceVentas;

public class OperacionesVentas implements InterfaceVentas, InterfaceTrabajadores, InterfaceCompraVenta {
	
	private Trabajadores t;
	
	

	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

	@Override
	public void descuento() {
		// TODO Auto-generated method stub
		InterfaceVentas.super.descuento();
	}

	@Override
	public void listarPagos() {
		// TODO Auto-generated method stub
		InterfaceVentas.super.listarPagos();
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

	@Override
	public void imprimirFichaProducto() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.imprimirFichaProducto();
	}

	@Override
	public void buscarProducto() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.buscarProducto();
	}

	@Override
	public void modificarProducto() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.modificarProducto();
	}

	@Override
	public void informeArticuloMasComprado() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.informeArticuloMasComprado();
	}

	@Override
	public void informeArticuloMenosComprado() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.informeArticuloMenosComprado();
	}

	@Override
	public void informeArticuloMasCompradoIntervalo() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.informeArticuloMasCompradoIntervalo();
	}

	@Override
	public void informeArticuloMenosCompradoIntervalo() {
		// TODO Auto-generated method stub
		InterfaceCompraVenta.super.informeArticuloMenosCompradoIntervalo();
	}



	

	@Override
	public void comprobarCorreoNoContestado(ArrayList<Mensajes> mensajeComprobar) {
		// TODO Auto-generated method stub
	
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
	
	

}
