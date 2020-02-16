package book_one.chapter.three.nestedclasses.localinnerclass;

import book_one.chapter.three.nestedclasses.staticnestedclass.Shape;

class StatusReporter {
	// important to note that the argument "color" is declared final
	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		// local class DescriptiveColor that extends Shape.Color class
		class DescriptiveColor extends Shape.Color {
			public static final String NAME = "John";

			@Override
			public String toString() {
				// Local variable color defined in an enclosing scope must be
				// final or effectively final
				// color = new Shape.Color();
				return NAME + ", you selected a color with RGB values" + color;
			}
		}
		return new DescriptiveColor();
	}

	public static void main(final String[] args) {
		final Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
