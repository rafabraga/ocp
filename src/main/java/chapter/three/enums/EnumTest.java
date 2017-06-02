package chapter.three.enums;

public class EnumTest {

	public static void main(final String[] args) {
		final PrinterType printerType = PrinterType.LASER;

		System.out.println(printerType.name());
		System.out.println(PrinterType.valueOf("LASER"));
	}

}
