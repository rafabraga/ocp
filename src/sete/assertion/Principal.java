package sete.assertion;

public class Principal {

	public static void main(final String[] args) {
		final int numero = 7;
		testa(numero);
	}

	public static void testa(final int numero) {
		System.out.println("vai passar");
		assert (numero > 7) : "numero é " + numero;
		System.out.println("passou");
	}

}
