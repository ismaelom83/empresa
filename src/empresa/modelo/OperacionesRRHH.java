package empresa.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import empresa.abtraccion.InterfaceRRHH;
import empresa.abtraccion.InterfaceTrabajadores;

public class OperacionesRRHH implements InterfaceTrabajadores, InterfaceRRHH {

	Trabajadores trabajadores = new Trabajadores();
	Departamento departamentos = new Departamento();
	Empresa empresa = new Empresa();

	 List<Trabajadores> trabajador = new ArrayList<>();
	 Map<String, Departamento> departamento = new HashMap<>();

	private Trabajadores t;

	public Trabajadores getT() {
		return t;
	}

	public void setT(Trabajadores t) {
		this.t = t;
	}

	@Override
	public void nominaTrabajador() {
		// TODO Auto-generated method stub
		InterfaceRRHH.super.nominaTrabajador();
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

//	@Override
//	public boolean altaTrabajador(String nombre, String apellido, float salario, String contrasenya, boolean jefeONo) {
//
//		boolean correcto = false;
//
//		if (true) {
//
//			trabajador.add(new Trabajadores(nombre, apellido, salario, contrasenya, jefeONo));
//
//			correcto = true;
//
//		}
//		return correcto;
//	}

	@Override
	public void bajaLogicaTrabajador() {
		// TODO Auto-generated method stub
		InterfaceRRHH.super.bajaLogicaTrabajador();
	}

	@Override
	public void buscarTrabajador() {
		System.out.println("");
		for (Trabajadores trabajadores : trabajador) {
			System.out.println(trabajadores);
		}

	}

	@Override
	public void buscarDepartamento() {
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
	
	public void altaTrabajador(Trabajadores t) {
		trabajador.add(t);
	}

	@Override
	public void comprobarCorreoIntervalo() {
		// TODO Auto-generated method stub
		InterfaceTrabajadores.super.comprobarCorreoIntervalo();
	}
//
//	public static void crearTrabajadores() {
//		trabajador.add(new Trabajadores("Ismael", "Heras", 1000, new ArrayList<Mensajes>(), "1111", true));
//		trabajador.add(new Trabajadores("Jose", "Salvador", 1050, new ArrayList<Mensajes>(), "2222", false));
//		trabajador.add(new Trabajadores("Pedro", "Rodriguez", 2000, new ArrayList<Mensajes>(), "3333", false));
//		trabajador.add(new Trabajadores("Raul", "Gonzalez", 3000, new ArrayList<Mensajes>(), "4444", true));
//
//	}

}
