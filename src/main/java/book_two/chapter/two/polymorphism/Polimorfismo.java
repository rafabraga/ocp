package book_two.chapter.two.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <table>
 * <tr>
 * <th></th>
 * <th>Sobrecarga</th>
 * <th>Sobrescrita</th>
 * </tr>
 * <tr>
 * <td>Argumentos</td>
 * <td>Devem mudar</td>
 * <td>NAO podem mudar</td>
 * </tr>
 * <tr>
 * <td>Retorno</td>
 * <td>Podem mudar</td>
 * <td>Retorno "covariante"</td>
 * </tr>
 * <tr>
 * <td>Excecoes</td>
 * <td>Podem mudar</td>
 * <td>Pode diminuir ou remover. Nao pode disparar <br>
 * checked exception nova ou mais abrangente.</td>
 * </tr>
 * <tr>
 * <td>Acesso</td>
 * <td>Pode mudar</td>
 * <td>Nao pode ficar mais restritivo</td>
 * </tr>
 * <tr>
 * <td>Invocacao</td>
 * <td>Reference type</td>
 * <td>Object type</td>
 * </tr>
 * </table>
 *
 * @author rafael
 *
 */
public class Polimorfismo {

	public static class Veiculo {

		int rodas = 0;
		static String atributoQualquer = "Atributo do VEICULO";

		public void locomover() {
			System.out.println("Veiculo se locomovendo");
		}

		public void fazerAlgoGenerico() {
			System.out.println("Oi?!");
		}

		// ------ Sobrescrita
		protected Veiculo boraSobrescrever(final Veiculo veiculo) {
			System.out.println("protected Veiculo boraSobrescrever(final Veiculo veiculo)");
			return new Veiculo();
		}

		void boraSobrescreverComCheckedException() throws IOException {

		}

		private void naoDaPraSobrescrever() {
			System.out.println("Não da pra sobrescrever - classe Veiculo");
		}

		protected Veiculo boraSobrescreverComCheckedExceptionAgain(final Veiculo veiculo) throws IOException {
			return new Veiculo();
		}

		// ------ Sobrecarga
		protected void boraSobrecarregar() {
			System.out.println("BOM dia!");
		}

		protected void boraSobrecarregarComException() throws IOException {
			System.out.println("BOM dia!");
		}

		public static void fazerAlgoStatic() {
			System.out.println("Algo static no Veículo");
		}
	}

	public static class Carro extends Veiculo {

		int rodas = 4;
		String cor = "azul";

		static String atributoQualquer = "Atributo do CARRO";

		@Override
		public void locomover() {
			System.out.println("Carro se locomovendo");
		}

		public void fazerAlgoEspecifico() {
			System.out.println("Nada kkk.");
		}

		public static void fazerAlgoStatic() {
			System.out.println("Algo static no Carro");
		}

		// ------ Sobrescrita
		/**
		 * Pode retornar um subtipo, mas os argumentos devem ser do mesmo tipo.
		 *
		 * O nivel de acesso pode ser menos restritivo.
		 *
		 * Pode "throw" algum tipo de runtime exception se o metodo sobrescrito
		 * originalmente nao "throws" nenhuma exception.
		 */
		@Override
		public Carro boraSobrescrever(final Veiculo veiculo) throws RuntimeException {
			System.out.println("public Carro boraSobrescrever(final Veiculo veiculo) throws RuntimeException");
			return new Carro();
		}

		/**
		 * FileNotFoundException eh mais especifico que IOException, entao ok
		 */
		@Override
		void boraSobrescreverComCheckedException() throws FileNotFoundException {

		}

		/**
		 * Nao da pra sobrescrever, mas podemos tirar a anotacao
		 */
		// @Override
		private void naoDaPraSobrescrever() {
			System.out.println("Não da pra sobrescrever - classe Carro");
		}

		/**
		 * Podemos tirar a excecao! :O
		 */
		@Override
		protected Veiculo boraSobrescreverComCheckedExceptionAgain(final Veiculo veiculo) {
			return new Veiculo();
		}

		// ------ Sobrecarga
		protected String boraSobrecarregar(final String nome) throws Exception {
			System.out.println("BOM dia, " + nome);
			return "BOM dia, " + nome;
		}

		protected String boraSobrecarregarComException(final String nome) throws Exception {
			return "BOM dia, " + nome;
		}

		protected String boraSobrecarregarComException(final String nome, final String sobrenome)
				throws FileNotFoundException {
			return "BOM dia, " + nome + " " + sobrenome;
		}
	}

	public static void main(final String[] args) {

		// Reference type = Veiculo, Instance type = Carro
		final Veiculo v1 = new Carro();
		System.out.println(v1.rodas);

		// Veiculo nao conhece o atributo 'cor'
		// System.out.println(v1.cor);

		final Carro c1 = new Carro();
		System.out.println(c1.rodas);

		final Veiculo v2 = new Veiculo();
		System.out.println(v2.rodas);

		v1.locomover();

		c1.locomover();

		v2.locomover();

		System.out.println(Veiculo.atributoQualquer);

		System.out.println(Carro.atributoQualquer);

		v1.fazerAlgoGenerico();

		v1.boraSobrescrever(new Veiculo());
		c1.boraSobrescrever(new Veiculo());

		try {
			v1.boraSobrecarregar();
			c1.boraSobrecarregar("Fulano");
		} catch (final Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		v1.naoDaPraSobrescrever();
		c1.naoDaPraSobrescrever();

		// Veiculo nao possui esse metodo
		// v1.fazerAlgoEspecifico();

		v1.fazerAlgoStatic();
		c1.fazerAlgoStatic();

		try {
			// Esse metodo, na class Veiculo, dispara excecao, por isso precisa do try/catch
			v1.boraSobrescreverComCheckedExceptionAgain(null);
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
