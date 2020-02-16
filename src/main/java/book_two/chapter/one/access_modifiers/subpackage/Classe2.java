package book_two.chapter.one.access_modifiers.subpackage;

import book_two.chapter.one.access_modifiers.Classe1;

public class Classe2 {

    protected Integer protectedX = 1;
    public Integer publicX = 1;

    public Integer testar() {
        // Modificadores de acesso nao sao permitidos em variaveis locais.
        // private String variavelSecreta = "ops";

        final Classe1 classe1 = new Classe1();

        // Nao consegue acessar a variavel protectedX
        return classe1.publicX;
    }

}
