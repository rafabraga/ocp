package book_one.chapter.twelve.select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import book_one.chapter.twelve.DbConnector;

public class DbQuery4 {

	public static void main(final String[] args) {
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultset = statement
						.executeQuery("SELECT firstName, email FROM contact WHERE firstName='Rafael'")) {
			System.out.println("fName \temail");
			while (resultset.next()) {
				System.out.println(resultset.getString("firstName") + "\t" + resultset.getString("email"));
			}
		} catch (final SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
