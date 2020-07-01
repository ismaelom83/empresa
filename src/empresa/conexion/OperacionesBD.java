package empresa.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import empresa.conexion.Conexion;;

public class OperacionesBD {
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
		System.out.println("Consultar registros:");
		String query = "select * from cliente where nombre like ?";
		PreparedStatement ps = conexion.prepareStatement(query);
		ps.setString(1, nombreCliente);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String nombre = rs.getString(2);
			String telefono = rs.getString(3);

			System.out.println("NOMBRE DEL CLENTE: " + nombre + "\t" + "NUMERO DE TELEFONO: " + telefono);
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

	public void actualizarClientes(String nombreActualizado, String nombreOriginal) throws SQLException {
		System.out.println("Actualizar Clientes:");
		String query = "UPDATE cliente SET nombre='" + nombreActualizado + "' WHERE nombre='" + nombreOriginal + "'";
		int res = st.executeUpdate(query);
		if (res == 0) {
			System.out.println("NO se ha podido actualizar");
		} else {
			System.out.println("Actualizado correctamente");
		}

	}

	public void mostrarActualizarNombre(String nombreActualizado, String nombreOriginal) {

		conexion = Conexion.getConexion();
		try {
			if (conexion != null) {

				st = conexion.createStatement();
				actualizarClientes(nombreActualizado, nombreOriginal);

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

//				st.close();
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
		String query = "SELECT count(*) FROM articulos";
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

				st.close();
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

}
