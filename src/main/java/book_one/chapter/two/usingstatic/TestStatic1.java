package book_one.chapter.two.usingstatic;

public class TestStatic1 {

	private static int count; // variable to store the number of objects created
	// for every Counter object created, the default constructor will be called;
	// so, update the counter value inside the default constructor

	public TestStatic1() {
		count++;
	}

	public static void printCount() { // method to print the counter value so
										// far
		System.out.println("Number of instances created so far is: " + count);
	}

	public static void main(final String[] args) {
		final TestStatic1 anInstance = new TestStatic1();
		// note we call printCount using the class name
		// instead of instance variable name
		TestStatic1.printCount();
		final TestStatic1 anotherInstance = new TestStatic1();
		TestStatic1.printCount();
	}

}
