package book_two.chapter.two.constructors;

/**
 * Construtores podem ter qualquer modificador de acesso.
 *
 * O construtor default eh aquele fornecido pelo compilador.
 *
 * O construtor default tem o mesmo modifificador de acesso da classe.
 *
 * O compilador acrescenta um super() na primeira linha dos construtores que nao
 * possuirem super() ou this().
 *
 * Construtores não são herdados.
 *
 * Construtores não podem ser sobrescritos (até porque apenas métodos de
 * instância podem).
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

		public ConstrutoresCheiosDeArgumentos(final int i) {
			super(a);
		}

	}

	public static class ConstrutoresRebeldes extends ConstrutoresCheiosDeArgumentos {

		/**
		 * Sou obrigado a criar um construtor assim porque a classe pai nao tem um
		 * construtor default.
		 */
		public ConstrutoresRebeldes() {
			// Só da pra chamar metodos static
			super(metodoRebelde());

		}

		public static int metodoRebelde() {
			return 1;
		}

		public int metodoMuitoRebelde() {
			return 1;
		}

	}

	public static void main(final String[] args) {
		new Construtores(2);
	}

	public void dizerOi() {
		System.out.println("OI!");
	}

}
