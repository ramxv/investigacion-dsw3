package Main;

import java.sql.*;

public class Conexion {
	public static void main(String[] args) {
		String URL = "jdbc:ucanaccess://C:\\InvestigacionUTP\\Empleados.accdb";
		try {
			Connection con = DriverManager.getConnection(URL);
			Statement statement = con.createStatement();

			System.out.println();

			String sql = "select * from empleado";
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Nombre" + "\t" + "Apellido" + "\t" + "Edad");
			while (resultSet.next()){
				System.out.println(resultSet.getString("nombre") +
				"\t" + resultSet.getString("apellido") +
				"\t\t" + resultSet.getInt("edad"));
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
