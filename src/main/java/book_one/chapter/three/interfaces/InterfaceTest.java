package book_one.chapter.three.interfaces;

public interface InterfaceTest {

	public abstract void pular();

	abstract void andar();

	static void abaixar() {
		System.out.println("o.o");
	}

	default void abaixar2() {
		System.out.println("o.o [2]");
	}

}
