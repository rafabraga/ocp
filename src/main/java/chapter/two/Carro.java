package chapter.two;

public class Carro extends Veiculo {

	public final Integer velocidade = 110;

	@Override
	public String andar() {
		return "O carro tá andando a " + this.velocidade + "km/h.";
	}

	public static void main(final String[] args) {
		final Veiculo veiculo = new Carro();
		System.out.printf("Retorno: %s", veiculo.velocidade);
	}

}
