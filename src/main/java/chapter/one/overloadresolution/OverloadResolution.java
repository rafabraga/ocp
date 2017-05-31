package chapter.one.overloadresolution;

public class OverloadResolution {

	public static void aMethod(final int val) {
		System.out.println("int");
	}

	public static void aMethod(final short val) {
		System.out.println("short");
	}

	public static void aMethod(final Object val) {
		System.out.println("object");
	}

	public static void aMethod(final String val) {
		System.out.println("String");
	}

	public static void main(final String[] args) {
		final byte b = 9;
		aMethod(b);
		aMethod(9);
		final Integer i = 9;
		aMethod(i);
		aMethod("9");
	}

}
