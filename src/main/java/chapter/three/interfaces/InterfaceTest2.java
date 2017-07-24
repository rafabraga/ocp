package chapter.three.interfaces;

@FunctionalInterface
public interface InterfaceTest2 { // extends InterfaceTest {

	// @Override
	// public abstract void pular();

	abstract void andar();

	static void abaixar() {
		System.out.println("o.o");
	}

	// @Override
	default void abaixar2() {
		System.out.println("o.o [2]");
	}

}
