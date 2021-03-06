package book_one.chapter.nine.console;

import java.io.Console;
import java.util.Arrays;

public class Login {

	public static void main(final String[] args) {
		final Console console = System.console();
		if (console != null) {
			String userName = null;
			char[] password = null;
			userName = console.readLine("Enter your username: ");
			// typed characters for password will not be displayed in the screen
			password = console.readPassword("Enter password: ");
			// password is a char[]: convert it to a String first
			// before comparing contents
			if (userName.equals("scrat") && new String(password).equals("nuts")) {
				// we're hardcoding username and password here for
				// illustration, don't do such hardcoding in pratice!
				console.printf("login successful!");
			} else {
				console.printf("wrong user name or password");
			}
			// "empty" the password since its use is over
			Arrays.fill(password, ' ');
		}
	}

}
