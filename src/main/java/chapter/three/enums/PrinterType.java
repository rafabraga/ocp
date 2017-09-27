package chapter.three.enums;

import java.util.Arrays;

public enum PrinterType {

    DOTMATRIX(5), INKJET(10), LASER(50);

    private int pagePrintCapacity;

    private PrinterType(final int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPrintPageCapacity() {
        return this.pagePrintCapacity;
    }

    public static void imprimir() {
        Arrays.asList(PrinterType.values()).forEach(System.out::println);
    }

}
