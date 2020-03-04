package book_two.chapter.one.use_interfaces;

import static book_two.chapter.one.use_interfaces.Interface1.metodoStatic;

public interface Interface1 {

	/**
	 * As variáveis são public, static e final
	 */
	String VARIAVEL_1 = "EMPTY :p";

	/**
	 * Métodos não podem ser final, strictfp ou native.
	 *
	 * @return
	 */
	Integer metodo1();

	/**
	 * Métodos default não podem ser private, protected, static, final ou abstract
	 *
	 * @param parametro
	 * @return
	 */
	default Boolean metodoDefault(final String parametro) {
		return parametro != null;
	}

	/**
	 * Métodos static não podem ser private, protected, abstract ou final
	 *
	 * @return
	 */
	static String metodoStatic() {
		return "BAZINGA!";
	}

	public abstract static class ClasseQueImplementaInterface implements Interface1 {

		public static void main(final String[] args) {
			metodoStatic();
		}

		void abc() {
			metodoDefault("oi");
		}

		@Override
		public Boolean metodoDefault(final String parametro) {
			System.out.println("'Sobrecrevendo' método default");
			return Interface1.super.metodoDefault(parametro);
		}

	}

}
