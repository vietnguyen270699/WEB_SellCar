package cndb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	public static Connection createConnection() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/quanlyxe";
		String user = "root";
		String password = "123456789";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public  void thucThiSQL(String sql) throws Exception{
		Connection connect = createConnection();
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet chonDuLieu(String sql) throws Exception{
		Connection connect = createConnection();
		Statement stmt = connect.createStatement();
		ResultSet rs=	stmt.executeQuery(sql);
		return rs;
	}
	

	public PreparedStatement dungStament(String sql) throws SQLException, Exception{
		return createConnection().prepareStatement(sql);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(new ConnectDatabase().createConnection());
	}
}
