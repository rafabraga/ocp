package book_two.chapter.two.immutable;

/**
 * Classe final Variáveis private e final; Se o(s) construtor(es) receberem
 * objetos mutáveis, fazer cópia; Se tiver getters que retornem objetos
 * mutáveis, fazer cópia; Não criar setters
 *
 * @author usuario
 *
 */
public final class MinhaClasseImutavel {

	private final String umNomeQualquerDeQualquerCoisa;
	private final ObjetoQualquer objetoQualquer;

	public MinhaClasseImutavel(final String nomeQualquer, final ObjetoQualquer objetoQualquer) {
		this.umNomeQualquerDeQualquerCoisa = nomeQualquer;
		this.objetoQualquer = new ObjetoQualquer(objetoQualquer.id, objetoQualquer.descricao);
	}

	public String getUmNomeQualquerDeQualquerCoisa() {
		return this.umNomeQualquerDeQualquerCoisa;
	}

	public ObjetoQualquer getObjetoQualquer() {
		return new ObjetoQualquer(this.objetoQualquer.id, this.objetoQualquer.descricao);
	}

	public static class ObjetoQualquer {
		public Long id;
		public String descricao;

		public ObjetoQualquer(final Long id, final String descricao) {
			super();
			this.id = id;
			this.descricao = descricao;
		}
	}

}
