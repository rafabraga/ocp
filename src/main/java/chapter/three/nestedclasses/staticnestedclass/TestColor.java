package chapter.three.nestedclasses.staticnestedclass;

public class TestColor {
	public static void main(final String[] args) {
		// since Color is a static nested class,
		// we access it using the name of the outer class, as in Shape.Color
		// note that we do not (and cannot) instantiate Shape class for using
		// Color class
		final Shape.Color white = new Shape.Color(255, 255, 255);
		System.out.println("White color has values:" + white);
	}
}
