package book_one.chapter.seven.exceptions;

import java.util.NoSuchElementException;

public class Exceptions {

	public static void main(final String[] args) throws MyException {
		final String retorno = testar();
		System.out.println(retorno);
		testarCheckedException();
	}

	public static String testar() throws NoSuchElementException {
		return "abc";
	}

	/**
	 * Descrição.
	 * 
	 * @throws MyException
	 *             exceção lançada em caso de erro.
	 */
	public static void testarCheckedException() throws MyException {
		System.out.println("opa");
	}

}
