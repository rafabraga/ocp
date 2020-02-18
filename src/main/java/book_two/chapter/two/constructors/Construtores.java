package book_two.chapter.two.constructors;

/**
 * Construtores podem ter qualquer modificador de acesso.
 *
 * O construtor default eh aquele fornecido pelo compilador.
 *
 * @author usuario
 *
 */
public class Construtores {

	public Construtores() {
		System.out.println("Construtor sem argumentos");
	}

	public Construtores(final int i) {
		this.dizerOi();
		System.out.println("Construtor com argumento: " + i);
	}

	public static class ConstrutoresCheiosDeArgumentos extends Construtores {

		static int a;

		public ConstrutoresCheiosDeArgumentos() {
			super(a);
		}

	}

	public static void main(final String[] args) {
		new Construtores(2);
	}

	public void dizerOi() {
		System.out.println("OI!");
	}

}
