package book_two.chapter.one.access_modifiers.subpackage;

import book_two.chapter.one.access_modifiers.Parent;

class Child extends Parent {

    public void testIt() {
        System.out.println("This is x: " + this.x);

        final Parent p = new Parent();

        // A variavel x esta acessivel apenas por heranca.
        // System.out.println(p.x);
    }

    // @formatter:off
    /**
     * Visibilidade                     public  protected       default private
     * Mesma classe                     sim     sim             sim     sim
     * Outra classe no mesmo pacote     sim     sim             sim     nao
     * Subclasse no mesmo pacote        sim     sim             sim     nao
     * Subclasse em outro pacote        sim     por heranca     nao     nao
     * Outra classe em outro pacote     sim     nao             nao     nao
     */

}
