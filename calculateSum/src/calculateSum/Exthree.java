package calculateSum;

import java.util.Arrays;

public class Exthree {
	public static int getSorted(int[] array) {
		int[] result = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			result[i] = array[i];
		}
		Arrays.sort(result);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length - 1; i++) {
			sb.append(result[i]);
		}

		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 4, 2, 4, 6, 7, 8 };
		System.out.println(getSorted(array));
	}

}
