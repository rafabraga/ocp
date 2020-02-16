package book_two.chapter.one.enums;

public class Enums {

    static CoffeeSize2 a;

    public static void main(final String[] args) {
        System.out.println(a.BIG.size);
    }

    private enum CoffeeSize {
        SMALL, BIG, HUGE
    }

    enum CoffeeSize2 {
        SMALL(8), BIG(12), HUGE(16) {

            /**
             * "Constant specific class body"
             */
            @Override
            public int getSize() {
                return 18;
            }
        }

        ;

        CoffeeSize2(final int size) {
            this.size = size;
        }

        final int size;

        public int getSize() {
            return this.size;
        }
    }

}
