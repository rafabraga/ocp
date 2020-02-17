package book_two.chapter.two.casting;

public class Casting {

    public static interface Pet {

        void serAmigavel();

    }

    public static class Cachorro implements Pet {

        @Override
        public void serAmigavel() {
            System.out.println("Cachorro sendo amigavel.");
        }

        public void fazerCoisasDeCachorro() {
            System.out.println("Fazendo coisas de cachorro.");
        }

    }

    public static class Beagle extends Cachorro {

        @Override
        public void serAmigavel() {
            System.out.println("Beagle sendo amigavel.");
        }

    }

    public static void main(final String[] args) {
        final Pet p1 = new Beagle();
        final Pet p2 = new Cachorro();
        final Beagle b1 = new Beagle();
        final Pet p3 = b1;
        p3.serAmigavel();
        final Beagle b2 = (Beagle) new Cachorro();
        b2.serAmigavel();
        final Cachorro c1 = new Beagle();
    }

}
