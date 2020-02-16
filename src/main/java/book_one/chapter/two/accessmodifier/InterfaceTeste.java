package book_one.chapter.two.accessmodifier;

public interface InterfaceTeste {

	public void testarPublico();

	void testarDefault();

	/**
	 * Illegal modifier for the interface method testarProtected; only public,
	 * abstract, default, static and strictfp are permitted
	 *
	 * protected void testarProtected();
	 *
	 * private void testarPrivate();
	 */

	abstract void testarAbstract();

}
