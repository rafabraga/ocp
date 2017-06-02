package chapter.three.nestedclasses.staticnestedclass;

public class Shape {

	public static class Color {
		int m_red, m_green, m_blue;

		public Color() {
			// call the other overloaded Color constructor by passing default
			// values
			this(0, 0, 0);
		}

		public Color(final int red, final int green, final int blue) {
			this.m_red = red;
			this.m_green = green;
			this.m_blue = blue;
		}

		@Override
		public String toString() {
			return " red = " + this.m_red + " green = " + this.m_green + " blue = " + this.m_blue;
		}
	}

}
