package chapter.two.usingstatic;

public class TestStatic2 {

	private static int count; // variable to store the number of objects created
	// for every Counter object created, the default constructor will be called;
	// so, update the counter value inside the default constructor

	static {
		count = 1;
	}

	public TestStatic2() {
		count++;
	}

	public static void printCount() { // method to print the counter value so
										// far
		System.out.println("Number of instances created so far is: " + count);
	}

	public static void main(final String[] args) {
		final TestStatic2 anInstance = new TestStatic2();
		// note we call printCount using the class name
		// instead of instance variable name
		TestStatic2.printCount();
		final TestStatic2 anotherInstance = new TestStatic2();
		TestStatic2.printCount();
	}

}
