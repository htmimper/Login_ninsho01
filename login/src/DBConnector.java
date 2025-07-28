packagecom.diworksdev.login.util;
 import java.sql.Connection;
 importjava.sql.DriverManager;
 import java.sql.SQLException;
 public class DBConnector {
	 private static String driverName = "com.mysql.jdbc.Driver";
	 private static String url = "jdbc:mysql://localhost/logindb_hayakawa";
	 
	 private static String user = "root";
	 接続先のデータベース名を指定します。
	 private static String password = "mysql";
	 
	 public Connection getConnection() {
		 Connection con = null;
		 try {
			 Class.forName(driverName);
			 con = (Connection) DriverManager.getConnection(url,user,password);
		 } catch(ClassNotFoundException e)
		 { e.printStackTrace();
		 } catch(SQLException e) { e.printStackTrace();
		 }
		 
		 returncon;
		 }
	 }