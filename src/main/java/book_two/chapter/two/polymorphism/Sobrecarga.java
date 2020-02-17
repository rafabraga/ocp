package book_two.chapter.two.polymorphism;

public class Sobrecarga {

    public static class Animal {

        public void comer() {
            System.out.println("Animal comendo.");
        }

    }

    public static class Cavalo extends Animal {

        public void comer(final String comida) {
            System.out.println("Animal comendo " + comida);
        }

    }

    public void fazerAlgo(final Animal animal) {
        System.out.println("Animal fazendo algo.");
    }

    public void fazerAlgo(final Cavalo cavalo) {
        System.out.println("Cavalo fazendo algo.");
    }

    public static void main(final String[] args) {
        final Animal a = new Animal();
        final Cavalo c = new Cavalo();
        final Animal ac = new Cavalo();

        final Sobrecarga s = new Sobrecarga();
        s.fazerAlgo(a);
        s.fazerAlgo(c);
        s.fazerAlgo(ac);

        ac.comer();

        /**
         * Nao consegue enxergar o metodo comer que recebe uma String
         */
        // ac.comer("cenoura");
    }

}
