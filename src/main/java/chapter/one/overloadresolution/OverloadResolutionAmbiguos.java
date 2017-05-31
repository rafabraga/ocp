package chapter.one.overloadresolution;

public class OverloadResolutionAmbiguos {

	public static void aMethod(final long val1, final int val2) {
		System.out.println("long, int");
	}

	public static void aMethod(final int val1, final long val2) {
		System.out.println("int, long");
	}

	/**
	 * The method aMethod(long, int) is ambiguous for the type
	 * OverloadResolutionAmbiguos.
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		// aMethod(9, 10);
	}

}
