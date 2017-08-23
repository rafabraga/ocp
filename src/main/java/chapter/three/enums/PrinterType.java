package chapter.three.enums;

public enum PrinterType {

	DOTMATRIX(5), INKJET(10), LASER(50);

	private int pagePrintCapacity;

	private PrinterType(final int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return this.pagePrintCapacity;
	}

}
