package book_two.chapter.two.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

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

        protected Veiculo boraSobrescrever(final Veiculo veiculo) {
            return new Veiculo();
        }

        void boraSobrescreverComCheckedException() throws IOException {

        }

        private void naoDaPraSobrescrever() {

        }

        protected Veiculo boraSobrescreverComCheckedExceptionAgain(final Veiculo veiculo) throws IOException {
            return new Veiculo();
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

        /**
         * Pode retornar um subtipo, mas os argumentos devem ser do mesmo tipo.
         *
         * O nivel de acesso pode ser menos restritivo.
         *
         * Pode "throw" algum tipo de runtime exception se o metodo sobrescrito originalmente nao "throws" nenhuma exception.
         */
        @Override
        public Carro boraSobrescrever(final Veiculo veiculo) throws RuntimeException {
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

        }

        /**
         * Podemos tirar a excecao! :O
         */
        @Override
        protected Veiculo boraSobrescreverComCheckedExceptionAgain(final Veiculo veiculo) {
            return new Veiculo();
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

        // Veiculo nao possui esse metodo
        // v1.fazerAlgoEspecifico();

        try {
            // Esse metodo, na class Veiculo, dispara excecao, por isso precisa do try/catch
            v1.boraSobrescreverComCheckedExceptionAgain(null);
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
