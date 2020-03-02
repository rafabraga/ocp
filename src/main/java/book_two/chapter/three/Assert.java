package book_two.chapter.three;

/**
 * Para habilitar os asserts: java -ea package.Classe OU java -enableassetions package.Classe
 *
 * Para desabilitar os asserts: java -da package.Classe OU java -disableAssertions package.Classe
 *
 * Habilitando de forma seletiva: java -ea:package.subpackage OU java -ea:package.Class OU java -ea
 * -da:package.subpackage
 *
 * Habilitando em geral mas desabilitando nas classes de sistema: java -ea -dsa
 *
 * @author rafael
 *
 */
public class Assert {

    public static void main(final String[] args) {
        final int a = 3;

        int b = 9;

        assert a > 2;

        assert a > 3 : "ops!";

        assert a > 3 : Assert.handleAssert();

        assert a > 4 : b = 9;

        // precisa retornar um valor
        // assert a > 4 : Assert.voidHandleAssert();
    }

    private static Integer handleAssert() {
        return 1;
    }

    private static void voidHandleAssert() {

    }

}
