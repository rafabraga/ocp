package book_one.chapter.two.inheritance;

public class Building {

    interface Church {

    }

    public class House extends Building {

    }

    public static void main(final String[] args) {
        final Building b = new Building();
        final House h = new Building().new House();
        final Building bh = new Building().new House();
        final House h1 = (House) b;
        final House h2 = h;
        final House h3 = (House) bh;
        final Church h4 = (Church) bh;
    }

}
