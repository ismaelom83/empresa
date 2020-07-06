package empresa.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import empresa.conexion.Conexion;
import empresa.modelo.CategoriaCliente;
import empresa.modelo.Clientes;
import empresa.utils.SwhitchCase;;

public class OperacionesBD {

	private static Logger logger = LogManager.getLogger(SwhitchCase.class);
	String methodName = SwhitchCase.class.getSimpleName() + ".OperacionesBD()";

	private static Statement st;
	private java.sql.Connection conexion;

	public void consultar() throws SQLException {
		System.out.println("Consultar registros:");
		String query = "SELECT * FROM cliente";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String nombre = rs.getString(2);
			String telefono = rs.getString(3);

			System.out.println(nombre + "\t" + telefono);
		}
		rs.close();
	}

	public void mostrarConsultar() {
		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				consultar();

				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void consultar2(String nombreCliente) throws SQLException {
		String query = "select * from clientes where usuario like ?";
		PreparedStatement ps = conexion.prepareStatement(query);
		ps.setString(1, nombreCliente);

		ResultSet rs = ps.executeQuery();		
			while (rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				int puntos = rs.getInt(4);
				float saldo = rs.getFloat(5);
				String categoria = rs.getString(6);
				System.out.println("NOMBRE DE USUARIO DEL CLENTE: " + nombre + "\n" + "PUNTOS ACUMULADOS DISPONIBLES: " +
				puntos+"\n"+"SALDO DISPONIBLE: "+saldo+"\n"+"CATEGORIA CLIENTE: "+categoria+"\n"+"ID del cliente: "+id);
			}

		rs.close();
		ps.close();
	}

	public void mostrarConsultarNombre(String nombreCliente) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				consultar2(nombreCliente);

				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void actualizarClientes(String passwordNueva, String nombreOriginal) throws SQLException {
		String query = "UPDATE clientes SET password='" + passwordNueva + "' WHERE usuario='" + nombreOriginal + "'";
		int res = st.executeUpdate(query);
		if (res == 0) {
			System.out.println("NO se ha podido actualizar");
		} else {
			System.out.println("Actualizado correctamente");
		}

	}

	public void mostrarActualizarNombre(String passwordNueva, String nombreOriginal) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				actualizarClientes(passwordNueva, nombreOriginal);

				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void insertarArticulos(String nombre, float precio) throws SQLException {

		System.out.println("Insertar articulos:");
		PreparedStatement ps = conexion.prepareStatement("INSERT INTO articulos  (nombre,precio) " + "VALUES (?, ?)");

		ps.setString(1, nombre);
		ps.setFloat(2, precio);

		int resultado = ps.executeUpdate();
		System.out.println("se ha insertado correctamente");
		if (resultado == 0) {
			System.out.println("NO se ha podido insertar");
		}
		// conexion.commit();

		ps.close();
	}

	public void mostrarInsertarArticulos(String nombre, float precio) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				insertarArticulos(nombre, precio);

				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void borrarArticulos(int id) throws SQLException {
		System.out.println("Borrar articulo:");
		String query = "DELETE FROM articulos WHERE idArticulo='" + id + "'";
		int res = st.executeUpdate(query);
		if (res == 0) {
			System.out.println("NO existe el id");
			System.out.println("NO se ha podido borrar");
		} else {
			System.out.println("El articulo con id: " + id + " Se ha borrado");
		}
	}

	public void mostrarBorraArticulos(int id) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				borrarArticulos(id);
				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void buscarArticulo(int id) throws SQLException {
		System.out.println("Consultar articulos:");
		String query = "select * from articulos where idArticulo = ?";
		PreparedStatement ps = conexion.prepareStatement(query);
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String nombre = rs.getString(2);
			float precio = rs.getFloat(3);

			System.out.println("NOMBRE DEL PRODUCTO: " + nombre + "\t" + "PRECIO DEL PRODUCTO: " + precio + " €");
		}
		if (rs != null) {
			System.out.println("NO existe el articulo");

		}
		rs.close();
		ps.close();
	}

	public void mostrarBuscarArticulos(int id) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				buscarArticulo(id);
				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void consultarTodosArticulos() throws SQLException {
		System.out.println("Consultar todos los articulos:");
		String query = "SELECT * FROM articulos";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String nombre = rs.getString(2);
			float precio = rs.getFloat(3);

			System.out.println("NOMBRE DEL ARTICULO: " + nombre + "\t" + " PRECIO DEL ARTICULO: " + precio + " €");
		}
		rs.close();
	}

	public void mostrarBuscarTodosArticulos() {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				consultarTodosArticulos();
				st.close();
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public int consultarInsecionHilos() throws SQLException {
		int n = 0;
		String query = "SELECT count(*) FROM compras";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			n = rs.getInt(1);
		}

		return n;
	}

	public int mostrarHilos() {

		int n = 0;

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				n = consultarInsecionHilos();

			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return n;
	}

	public void realizarCompra(int idArticulo, int idCliente) throws SQLException {
		PreparedStatement ps = conexion
				.prepareStatement("INSERT INTO compras  (idArticulo,idCliente) " + "VALUES (?, ?)");

		ps.setInt(1, idArticulo);
		ps.setInt(2, idCliente);

		int resultado = ps.executeUpdate();
		logger.info(String.format("Se ha comprado el articulo.", methodName));
		if (resultado == 0) {
			System.out.println("NO se ha podido comprar");
		}
//		 conexion.commit();

		ps.close();
	}

	public void mostrarCompra(int idArticulo, int idCliente) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				try {
					realizarCompra(idArticulo, idCliente);
				} catch (MySQLIntegrityConstraintViolationException ex) {
					System.out.println("El articulo "+idArticulo+" no existe");
				}

			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

	}

	public Clientes loGin(String nombreCliente, String password,Clientes c) throws SQLException {
		String usuario = null;
		String password2 = null;
		String query = "select * from clientes where usuario like ? and password like ?";
		PreparedStatement ps = conexion.prepareStatement(query);
		ps.setString(1, nombreCliente);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			//recorremos los datos usuario y password
			usuario = rs.getString(2);
			password2 = rs.getString(3);
			//guardo los datos de la mi base de datos cliente en un objeto de la clase cliente
			//para poder trabajar con los datos mejor.
			c.setIdCliente(rs.getInt(1));
			c.setUsuario(rs.getString(2));
			c.setPassword(rs.getString(3));
			c.setPuntosAcumulados(rs.getInt(4));
			c.setSaldo(rs.getFloat(5));
			c.setCategoria(rs.getString(6));
			c.setTipo(rs.getString(7));		
		}

		//comprobacion de los campos usuario y passsword para hacer el login
		if (nombreCliente.equals(usuario) && password.equals(password2)) {
			return c;
		}

		rs.close();
		ps.close();
		return null;
	}

	public Clientes mostrarLogin(String usuario, String password,Clientes cliente) {
		
		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();

				cliente = loGin(usuario, password,cliente);

				st.close();
//				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (conexion != null) {
				try {
					conexion.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return cliente;

	}

}
