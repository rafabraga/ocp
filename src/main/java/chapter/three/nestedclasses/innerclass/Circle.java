package chapter.three.nestedclasses.innerclass;

public class Circle {

	// define Point as an inner class within Circle class
	class Point {
		private final int xPos;
		private final int yPos;
		public static final String NAME = "John";

		// you can provide constructor for an inner class like this
		public Point(final int x, final int y) {
			this.xPos = x;
			this.yPos = y;
		}

		// the inner class is like any other class - you can override methods
		// here
		@Override
		public String toString() {
			return NAME + ", (" + this.xPos + "," + this.yPos + ")";
		}
	}

	// make use of the inner class for declaring a field
	private final Point center;
	private final int radius;

	public Circle(final int x, final int y, final int r) {
		// note how to make use of the inner class to instantiate it
		this.center = this.new Point(x, y);
		this.radius = r;
	}

	@Override
	public String toString() {
		return "mid point = " + this.center + " and radius = " + this.radius;
	}

	public static void main(final String[] s) {
		System.out.println(new Circle(10, 10, 20));
		System.out.println(new Circle(10, 10, 20).new Point(1, 0));
	}
	// other methods such as area are elided

}
