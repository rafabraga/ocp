package book_two.chapter.one.access_modifiers;

import book_two.chapter.one.access_modifiers.subpackage.Classe2;

public class Classe1 {

    protected Integer protectedX = 1;
    public Integer publicX = 1;

    public Integer testar() {
        final Classe2 classe2 = new Classe2();

        // Nao consegue acessar a variavel protectedX
        return classe2.publicX;
    }

}
