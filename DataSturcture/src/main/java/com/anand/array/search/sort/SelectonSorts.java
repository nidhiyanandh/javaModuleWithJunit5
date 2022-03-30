package com.anand.array.search.sort;

public class SelectonSorts {

	public static int[] selectionSort(int[] values) {
		if (values != null && values.length > 0) {
			int m = values.length;
			for (int s = 1; s < m; s++) {
				int position = s - 1;
				int minmum = values[s - 1];
				for (int j = s; j < m; j++) {
					if (values[j] < minmum) {
						minmum = values[j];
						position = j;
					}
				}
				if (position != s - 1) {
					int temp = values[position];
					values[position] = values[s - 1];
					values[s - 1] = temp;
				}
			}
		}
		return values;
	}
}
