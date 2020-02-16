package book_one.chapter.three.nestedclasses;

import book_one.chapter.three.nestedclasses.Matrix.Deep.Deeper;

public class Matrix {
    private final int level = 1;

    public class Deep {
        private final int level = 2;

        public class Deeper {
            private final int level = 5;

            public void printReality() {
                System.out.print(this.level);
                System.out.print(" " + Matrix.Deep.this.level);
                System.out.print(" " + Deep.this.level);

                class Spy {
                    void abc() {
                        System.out.println(" " + Matrix.this.level);
                    }
                }
                new Spy().abc();
            }
        }
    }

    public static void main(final String[] args) {
        final Deeper deeper = new Matrix().new Deep().new Deeper();
        deeper.printReality();
    }

}
