package chapter.four.generics.creatingandusing;

class BoxPrinterTest {

	public static void main(final String[] args) {
		final BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
		System.out.println(value1);
		final BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
		System.out.println(value2);
	}

}
