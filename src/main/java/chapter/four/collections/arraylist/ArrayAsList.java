package chapter.four.collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(final String[] args) {
		final Double[] temperatureArray = { 31.1, 30.0, 32.5, 34.9, 33.7, 27.8 };
		System.out.println("The original array is: " + Arrays.toString(temperatureArray));
		final List<Double> temperatureList = Arrays.asList(temperatureArray);
		temperatureList.set(0, 35.2);
		System.out.println("The modified array is: " + Arrays.toString(temperatureArray));
	}

}
