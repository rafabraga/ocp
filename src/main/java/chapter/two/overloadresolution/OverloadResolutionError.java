package chapter.two.overloadresolution;

public class OverloadResolutionError {

	public static void aMethod(final byte val) {
		System.out.println("byte");
	}

	public static void aMethod(final short val) {
		System.out.println("short");
	}

	/**
	 * OverloadingError.java:6: error: no suitable method found for aMethod(int)
	 * aMethod(9); ^ method OverloadingError.aMethod(byte) is not applicable
	 * (argument mismatch; possible lossy conversion from int to byte) method
	 * OverloadingError.aMethod(short) is not applicable (argument mismatch;
	 * possible lossy conversion from int to short)
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		// aMethod(9);
	}

}
