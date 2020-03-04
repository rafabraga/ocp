package book_two.chapter.four;

import java.util.ListResourceBundle;

public class ResourceBundle_en_CA extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "Greeting", new StringBuilder(" from Java") } };
	}

}
