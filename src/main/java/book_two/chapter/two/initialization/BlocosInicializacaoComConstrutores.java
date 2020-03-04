package book_two.chapter.two.initialization;

public class BlocosInicializacaoComConstrutores {

	public static class Bird {

		{
			System.out.println(" b1");
		}

		public Bird() {
			System.out.println(" b2");
		}

	}

	public static class Raptor extends Bird {

		static {
			System.out.println(" r1");
		}

		public Raptor() {
			System.out.println(" r2");
		}

		{
			System.out.println(" r3");
		}

		static {
			System.out.println(" r4");
		}
	}

	public static class Hawk extends Raptor {

		public static void main(final String[] args) {
			System.out.println(" pre");
			new Hawk();
			System.out.println(" hawk");
		}
	}

}
