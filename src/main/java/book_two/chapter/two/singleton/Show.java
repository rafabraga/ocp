package book_two.chapter.two.singleton;

public class Show {

	private static Show INSTANCE;

	private Show() {

	}

	public static Show getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Show();
		}
		return INSTANCE;
	}

}
