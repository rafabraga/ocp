package book_two.chapter.one.use_interfaces;

public interface Interface1 {

    /**
     * As variáveis são public, static e final
     */
    String VARIAVEL_1 = "EMPTY :p";

    /**
     * Métodos não podem ser final, strictfp ou native.
     * 
     * @return
     */
    Integer metodo1();

    /**
     * Métodos default não podem ser private, protected, static, final ou abstract
     * 
     * @param parametro
     * @return
     */
    default Boolean metodoDefault(final String parametro) {
        return parametro != null;
    }

    /**
     * Métodos static não podem ser private, protected, abstract ou final
     * 
     * @return
     */
    static String metodoStatic() {
        return "BAZINGA!";
    }

}
