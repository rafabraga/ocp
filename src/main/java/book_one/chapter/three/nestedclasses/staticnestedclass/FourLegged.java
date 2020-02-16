package book_one.chapter.three.nestedclasses.staticnestedclass;

public class FourLegged {

	String walk = "walk,";

	static class BabyRhino extends FourLegged {
		String walk = "toddle,";
	}

	public static void main(final String[] args) {
		final FourLegged f = new BabyRhino();
		final BabyRhino b = new BabyRhino();
		System.out.println(f.walk);
		System.out.println(b.walk);
	}
}