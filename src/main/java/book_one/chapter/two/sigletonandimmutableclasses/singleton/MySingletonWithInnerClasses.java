package book_one.chapter.two.sigletonandimmutableclasses.singleton;

public class MySingletonWithInnerClasses {

	private MySingletonWithInnerClasses() {

	}

	public static class MySingletonHolder {
		public static MySingletonWithInnerClasses myInstance = new MySingletonWithInnerClasses();
	}

	public static MySingletonWithInnerClasses getInstance() {
		return MySingletonHolder.myInstance;
	}

}
