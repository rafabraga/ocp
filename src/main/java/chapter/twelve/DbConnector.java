package chapter.twelve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

	public static Connection connectToDb() throws SQLException {
		// URL points to JDBC protocol: mysql subprotocol;
		// localhost is the address of the server where we installed our
		// DBMS (i.e. on local machine) and 3306 is the port on which
		// we need to contact our DBMS
		final String url = "jdbc:postgresql://localhost/";
		// we are connecting to the addressBook database we created earlier
		final String database = "addressBook";
		// we login as "root" user with password "mysql123"
		final String userName = "postgres";
		final String password = "postgres";
		return DriverManager.getConnection(url + database, userName, password);
	}

}
