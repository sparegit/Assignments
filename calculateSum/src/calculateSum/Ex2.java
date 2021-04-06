package calculateSum;

public class Ex2 {
	public static String[] sortString(String[] str) {
		String[] result = new String[str.length];
		int mid = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length - 1; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String dummy = str[i];
					str[i] = str[j];
					str[j] = dummy;
				}
			}
		}

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() % 2 != 0) {
				mid = (str[i].length() + 1) / 2;
			} else {
				mid = (str[i].length() / 2);
			}
			result[i] = str[i].substring(0, mid).toUpperCase().concat(str[i].substring(mid, str[i].length()));

		}

		for (String S : result) {
			System.out.println(S);
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "red", "green", "blue", "white", "orange" };

		sortString(str);
	}
}
