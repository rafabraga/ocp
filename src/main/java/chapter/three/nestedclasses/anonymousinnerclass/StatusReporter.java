package chapter.three.nestedclasses.anonymousinnerclass;

import chapter.three.nestedclasses.staticnestedclass.Shape;

class StatusReporter {
	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		// note the use of anonymous inner classes here
		// -- specifically, there is no name for the class and we construct
		// and use the class "on the fly" in the return statement!
		return new Shape.Color() {
			@Override
			public String toString() {
				return "You selected a color with RGB values" + color;
			}
		};
	}

	public static void main(final String[] args) {
		final Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
