package book_one.chapter.three.diamondproblem;

public class Diamond implements Interface1, Interface2 {

	@Override
	public void foo() {
		Interface1.super.foo();
	}

}
