package book_one.chapter.thirteen.resourcebundle;

import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle {

	static final Object[][] CONTENTS = { { "MovieName", "Avatar" }, { "GrossRevenue", 2782275172L }, { "Year", 2009 } };

	@Override
	protected Object[][] getContents() {
		return CONTENTS;
	}

}
