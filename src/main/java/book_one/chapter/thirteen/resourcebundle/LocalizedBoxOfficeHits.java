package book_one.chapter.thirteen.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedBoxOfficeHits {

	public void printMovieDetails(final ResourceBundle resBundle) {
		final String movieName = resBundle.getString("MovieName");
		final Long revenue = (Long) resBundle.getObject("GrossRevenue");
		final Integer year = (Integer) resBundle.getObject("Year");
		System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " + revenue);
	}

	public static void main(final String args[]) {
		final LocalizedBoxOfficeHits localizedHits = new LocalizedBoxOfficeHits();
		// print the largest box-office hit movie for default (US) locale
		Locale locale = Locale.getDefault();
		localizedHits.printMovieDetails(ResourceBundle.getBundle("chapter.thirteen.resourcebundle.ResBundle", locale));
		// print the largest box-office hit movie for Italian locale
		locale = new Locale("it", "IT", "");
		localizedHits.printMovieDetails(ResourceBundle.getBundle("chapter.thirteen.resourcebundle.ResBundle", locale));
	}

}
