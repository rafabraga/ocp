package book_one.chapter.three.nestedclasses;

import book_one.chapter.three.nestedclasses.Casa.DeMadeira.DeMadeira2;
import book_one.chapter.three.nestedclasses.Casa.Quarto.Armario;
import book_one.chapter.three.nestedclasses.Casa.Quarto.Suite;
import book_one.chapter.three.nestedclasses.Casa.Quarto.Suite.Banheiro;

public class Casa {

    public static double metrosQuadrados = 1.0;
    final DeMadeira2 madeira = new DeMadeira().new DeMadeira2();

    static interface Tarefas {
        static final int CONSTANTE = 9;

        void abc();
    }

    public class DeMadeira {

        public class DeMadeira2 {
            public void testar() {
                final Tarefas tarefas = new Tarefas() {
                    @Override
                    public void abc() {
                        System.out.println(CONSTANTE);

                    }

                };
            }
        }

    }

    public static class Quarto implements Tarefas {

        public double metrosQuadrados = 2.0;
        public Banheiro banheiro = new Suite().new Banheiro() {
            @Override
            public void testarBanheiro() {

            }
        };

        public class Suite extends Quarto {
            public static final double metrosQuadrados = 3.0;

            public double medirQuarto() {
                return new Quarto().metrosQuadrados;
            }

            public class Banheiro {
                public double metrosQuadrados = 4.0;

                public void testarBanheiro() {

                }
            }
        }

        public static class Armario extends Quarto {
            public static double metrosQuadrados = 3.0;

            public Suite testar() {
                return null;
            }
        }

        @Override
        public void abc() {
            // TODO Auto-generated method stub

        }
    }

    public Quarto.Suite testar() {
        return null;
    }

    public Suite testar2() {
        return null;
    }

    public static void main(final String[] args) {
        final Casa casa = new Casa();
        final Quarto quarto = new Quarto();
        final Quarto quarto2 = new Casa.Quarto();
        final Suite suite = new Quarto().new Suite();
        final Banheiro banheiroSuite = new Quarto().new Suite().new Banheiro();
        final Armario armario = new Armario();
        final Armario armario2 = new Quarto.Armario();

        System.out.println(Casa.metrosQuadrados);
        System.out.println(quarto.metrosQuadrados);
        System.out.println(Suite.metrosQuadrados);
    }

}
