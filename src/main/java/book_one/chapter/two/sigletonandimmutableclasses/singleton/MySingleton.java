package book_one.chapter.two.sigletonandimmutableclasses.singleton;

public class MySingleton {

	private static MySingleton myInstance;

	private MySingleton() {

	}

	public static synchronized MySingleton getInstance() {
		if (myInstance == null) {
			myInstance = new MySingleton();
		}
		return myInstance;
	}

}
