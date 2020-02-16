package book_one.chapter.twelve.select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import book_one.chapter.twelve.DbConnector;

public class DbConnect {

	public static void main(final String[] args) {

		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
			System.out.println("ID \tfName \tlName \temail \t\t\tphoneNo");
			// while (resultSet.next()) {
			// System.out.println(resultSet.getInt("id") + "\t" +
			// resultSet.getString("firstName") + "\t"
			// + resultSet.getString("lastName") + "\t" +
			// resultSet.getString("email") + "\t"
			// + resultSet.getString("phoneNo"));
			// }

			// from resultSet metadata, find out how many columns there are
			// and then read the column entries
			final int numOfColumns = resultSet.getMetaData().getColumnCount();
			while (resultSet.next()) {
				// remember that the column index starts from 1 not 0
				for (int i = 1; i <= numOfColumns; i++) {
					// since we do not know the data type of the column, we use
					// getObject()
					System.out.print(resultSet.getObject(i) + "\t");
				}
				System.out.println("");
			}

		} catch (final Exception e) {
			System.out.println("Database connection: Failed");
			e.printStackTrace();
		}
	}

}
