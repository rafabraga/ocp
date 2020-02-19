package book_two.chapter.two.initialization;

public class BlocosInicializacao {

	public static class BlocosInicializacaoInner extends BlocosInicializacao {

		public BlocosInicializacaoInner() {
			System.out.println("Construtor sem argumentos inner.");
		}

		{
			System.out.println("Bloco de inicialização de instância 1 inner.");
		}

		static {
			System.out.println("Bloco de inicialização static 1 inner.");
		}

		{
			System.out.println("Bloco de inicialização de instância 2 inner.");
		}

		static {
			System.out.println("Bloco de inicialização static 2 inner.");
		}

	}

	public BlocosInicializacao() {
		System.out.println("Construtor vazio");
	}

	public BlocosInicializacao(final int i) {
		System.out.println("Construtor com argumento");
	}

	{
		System.out.println("Bloco de inicialização de instância 1.");
	}

	static {
		System.out.println("Bloco de inicialização static 1.");
	}

	{
		System.out.println("Bloco de inicialização de instância 2.");
	}

	static {
		System.out.println("Bloco de inicialização static 2.");
	}

	public static void main(final String[] args) {
		new BlocosInicializacaoInner();
//		new BlocosInicializacao(1);
	}

}
