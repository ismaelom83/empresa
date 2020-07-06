package empresa.modelo;

import java.util.HashMap;

import empresa.abtraccion.InterfaceAtencionCliente;
import empresa.abtraccion.InterfaceTrabajadores;

public class OperacionesAtencionCliente implements InterfaceTrabajadores, InterfaceAtencionCliente{
	
	Empresa empresa = new Empresa();
	private HashMap<String, Clientes> clientes = new HashMap<>();
	Clientes c = new Clientes();

	private Trabajadores t;

	
	
	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

//	@Override
//	public Clientes modificarCliente(String usuario, Empresa empresa,String password) {
//		
//		clientes =	empresa.getClientes();
//	
//		
//		if (clientes.containsKey(usuario)) {
//			Clientes c =  empresa.getClientes().get(usuario);
//			System.out.println("Password del cliente actualizada");
//			c.setPassword(password);
//	return c;
//		}else {
//			System.out.println("El cliente: "+usuario+" no existe");
//		}
//		return null;
//	}

//	public void buscarCliente(String usuario, Empresa empresa) {
//		
//	clientes =	empresa.getClientes();
//		if (clientes.containsKey(usuario)) {
//			Clientes c1 = empresa.getClientes().get(usuario);
//			System.out.println("Cliente encontrado");
//			System.out.println("Saldo: "+c1.getSaldo()+"\n"+"PuntosAcumulados: "+c1.getPuntosAcumulados()+"\n"+"Usuario: "+c1.getUsuario()+"\n"+"Categoria Cliente: "+c1.getCategoria()+"\n"+"Id cliente: "+c1.getIdCliente()+"\n");
//			 
//		}else {
//			System.out.println("El cliente: "+usuario+" no existe");
//		}
//	}

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
