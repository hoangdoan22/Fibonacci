package HomeworkDSday2;

import java.util.HashMap;

public class PairGap {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		System.out.println(getMinGap(arr));

	}

	public static int getMinGap(int[] arr) {
		int minGap = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] == arr[j]) {
					int gap = j - i;
					if (gap < minGap) {
						minGap = gap;
					}

				}
		}
		return minGap;
	}
}
