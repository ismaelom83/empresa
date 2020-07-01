package empresa.modelo;

import empresa.abtraccion.InterfaceCompraVenta;
import empresa.abtraccion.InterfaceCompras;
import empresa.abtraccion.InterfaceTrabajadores;

public class OperacionesCompras implements InterfaceTrabajadores,InterfaceCompras, InterfaceCompraVenta {

	private Trabajadores t;
	
	
	
	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

	@Override
	public void altaProducto() {
		// TODO Auto-generated method stub
		InterfaceCompras.super.altaProducto();
	}

	@Override
	public void bajaProducto() {
		// TODO Auto-generated method stub
		InterfaceCompras.super.bajaProducto();
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
	
	
	
}
