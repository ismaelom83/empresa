package empresa.utils;

import empresa.modelo.Clientes;
import empresa.modelo.Departamento;
import empresa.modelo.Empresa;
import empresa.modelo.Trabajadores;

public class CargaInicial {
	
	public  void cargaInicial(Empresa empresa) {
		
		Clientes cliente1 = new Clientes(0,1000,"c1","paso","cliente");
		Clientes cliente2 = new Clientes(4,1300,"c2","paso","cliente");
		Clientes cliente3 = new Clientes(6,900,"c3","paso","cliente");
		Clientes cliente4 = new Clientes(0,2000,"c4","paso","cliente");
		
	empresa.addCliente("c1", cliente1);
	empresa.addCliente("c2", cliente2);
	empresa.addCliente("c3", cliente3);
	empresa.addCliente("c4", cliente4);
		
		Departamento departamentoCompras = new Departamento(Departamento.DEPARTAMENTO_COMPRAS, "1");
		Departamento departamentoVentas = new Departamento(Departamento.DEPARTAMENTO_VENTAS, "2");
		Departamento departamentoRRHH = new Departamento(Departamento.DEPARTAMENTO_RRHH, "3");
		Departamento departamentoDireccion = new Departamento(Departamento.DEPARTAMENTO_DIRECCION, "4");
		Departamento departamentoAtencionCliente = new Departamento(Departamento.DEPARTAMENTO_ATENCION_CLIENTE, "5");

		empresa.addDepartamento("1", departamentoCompras);
		empresa.addDepartamento("2", departamentoVentas);
		empresa.addDepartamento("3", departamentoRRHH);
		empresa.addDepartamento("4", departamentoDireccion);
		empresa.addDepartamento("5", departamentoAtencionCliente);

		Trabajadores trabajador1 = new Trabajadores("Jose", "Salvador", 1050, "paso", false, "compras", "1",
				"t1c","compras");
		Trabajadores trabajador6 = new Trabajadores("pepe", "sanchez", 1055, "paso", false, "compras", "6",
				"t2c","compras");
		Trabajadores trabajador7 = new Trabajadores("juan", "sanchez", 1255, "paso", false, "administrativo", "7",
				"adminCompras","compras");
		Trabajadores trabajador8 = new Trabajadores("marta", "sanchez", 1555, "paso", true, "jefeCompras", "8",
				"jefeCompras","compras");
		Trabajadores trabajador2 = new Trabajadores("ismael", "heras", 1100, "paso", false, "ventas", "2",
				"t1v","ventas");
		Trabajadores trabajador9 = new Trabajadores("juana", "heras", 1200, "paso", false, "ventas", "9",
				"t2v","ventas");
		Trabajadores trabajador10 = new Trabajadores("luisa", "perez", 1300, "paso", false, "administrativo", "10",
				"adminVentas","ventas");
		Trabajadores trabajador11 = new Trabajadores("jose", "perez", 1700, "paso", true, "jefeVentas", "11",
				"jefeVentas","ventas");
		Trabajadores trabajador3 = new Trabajadores("manuel", "perez", 2000, "paso", false, "administrativo", "3", "t1rh","RRHH");
		Trabajadores trabajador12 = new Trabajadores("julia", "perez", 2100, "paso", false, "administrativo", "12", "t2rh","RRHH");
		Trabajadores trabajador13 = new Trabajadores("mario", "hernandez", 2500, "paso", true, "jefeRRHH", "13", "jefeRRHH","RRHH");
		Trabajadores trabajador4 = new Trabajadores("marta", "sanchez", 3000, "paso", true, "jefeEmpresa", "4",
				"jefeEmpresa","direccion");
		Trabajadores trabajador5 = new Trabajadores("natalia", "Salvador", 1000, "paso", false, "atencionCliente",
				"5", "t5","atencionCliente");
		Trabajadores trabajador14 = new Trabajadores("javier", "sanchez", 1200, "paso", false, "atencionCliente",
				"14", "t1a","atencionCliente");

		departamentoCompras.altaTrabajador(trabajador1.getUsuario(), trabajador1);
		departamentoCompras.altaTrabajador(trabajador6.getUsuario(), trabajador6);
		departamentoCompras.altaTrabajador(trabajador7.getUsuario(), trabajador7);
		departamentoCompras.altaTrabajador(trabajador8.getUsuario(), trabajador8);
		departamentoVentas.altaTrabajador(trabajador9.getUsuario(), trabajador9);
		departamentoVentas.altaTrabajador(trabajador10.getUsuario(), trabajador10);
		departamentoVentas.altaTrabajador(trabajador11.getUsuario(), trabajador11);
		departamentoVentas.altaTrabajador(trabajador2.getUsuario(), trabajador2);
		departamentoRRHH.altaTrabajador(trabajador3.getUsuario(), trabajador3);
		departamentoRRHH.altaTrabajador(trabajador12.getUsuario(), trabajador12);
		departamentoRRHH.altaTrabajador(trabajador13.getUsuario(), trabajador13);
		departamentoDireccion.altaTrabajador(trabajador4.getUsuario(), trabajador4);
		departamentoAtencionCliente.altaTrabajador(trabajador5.getUsuario(), trabajador5);
		departamentoAtencionCliente.altaTrabajador(trabajador14.getUsuario(), trabajador14);
		
	}

}
