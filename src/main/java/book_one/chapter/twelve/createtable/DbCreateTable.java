package book_one.chapter.twelve.createtable;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import book_one.chapter.twelve.DbConnector;

public class DbCreateTable {

	public static void main(final String[] args) {
		try (Connection connection = DbConnector.connectToDb(); Statement statement = connection.createStatement()) {
			// use CREATE TABLE SQL statement to
			// create table familyGroup
			statement.executeUpdate(
					"CREATE TABLE familyGroup (id int not null, nickName varchar(30) not null, primary key(id));");
			System.out.println("Table created successfully");
		} catch (final SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}

}
