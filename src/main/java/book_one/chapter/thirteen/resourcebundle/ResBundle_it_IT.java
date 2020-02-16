package book_one.chapter.thirteen.resourcebundle;

import java.util.ListResourceBundle;

public class ResBundle_it_IT extends ListResourceBundle {

	@Override
	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = { { "MovieName", "Che Bella Giornata" }, { "GrossRevenue", 43000000L },
			{ "Year", 2011 } };

}
