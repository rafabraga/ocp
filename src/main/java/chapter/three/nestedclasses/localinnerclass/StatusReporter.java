package chapter.three.nestedclasses.localinnerclass;

import chapter.three.nestedclasses.staticnestedclass.Shape;

class StatusReporter {
	// important to note that the argument "color" is declared final
	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		// local class DescriptiveColor that extends Shape.Color class
		class DescriptiveColor extends Shape.Color {
			@Override
			public String toString() {
				// Local variable color defined in an enclosing scope must be
				// final or effectively final
				// color = new Shape.Color();
				return "You selected a color with RGB values" + color;
			}
		}
		return new DescriptiveColor();
	}

	public static void main(final String[] args) {
		final Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
