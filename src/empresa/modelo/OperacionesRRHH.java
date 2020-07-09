package empresa.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import empresa.abtraccion.InterfaceRRHH;
import empresa.abtraccion.InterfaceTrabajadores;

public class OperacionesRRHH implements InterfaceTrabajadores, InterfaceRRHH {

	Trabajadores trabajadores = new Trabajadores();
	Departamento departamentos = new Departamento();
	Empresa empresa = new Empresa();

	HashMap<String, Trabajadores> trabajador = new HashMap<>();
	Map<String, Departamento> departamento = new HashMap<>();

	private Trabajadores t;

	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

	@Override
	public void nominaTrabajador(Trabajadores operacionesTrabajadores) {
		System.out.println("LA NOMINA DEL TRABAJADOR " + operacionesTrabajadores.getNombre() + " "
				+ operacionesTrabajadores.getApellido1() + " es " + operacionesTrabajadores.getSalario() + "€");
	}

	@Override
	public void nominaDepartamentos() {
		// TODO Auto-generated method stub
		InterfaceRRHH.super.nominaDepartamentos();
	}

	@Override
	public void gastoTotal() {
		// TODO Auto-generated method stub
		InterfaceRRHH.super.gastoTotal();
	}



	@Override
	public void bajaLogicaTrabajador() {
		// TODO Auto-generated method stub
		InterfaceRRHH.super.bajaLogicaTrabajador();
	}

	public Trabajadores buscarTrabajador(String usuario, Empresa empresa) {
		String claveDepartamento;
		Iterator<String> departamentos = empresa.getDepartamento().keySet().iterator();
		while (departamentos.hasNext()) {
			claveDepartamento = departamentos.next();
			Departamento d = empresa.getDepartamento().get(claveDepartamento);
			String clave;
			Iterator<String> trabajadores = d.getTrabajador().keySet().iterator();
			while (trabajadores.hasNext()) {
				clave = trabajadores.next();
				if (clave.equals(usuario)) {
					Trabajadores t = d.getTrabajador().get(clave);
					return t;
				}
			}
		}

		return null;

	}

	@Override
	public void buscarDepartamento() {
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

	public void altaTrabajador(Trabajadores t,String key) {
		trabajador.put(key,t);
	}

	@Override
	public void comprobarCorreoIntervalo() {
		// TODO Auto-generated method stub
		InterfaceTrabajadores.super.comprobarCorreoIntervalo();
	}

}
