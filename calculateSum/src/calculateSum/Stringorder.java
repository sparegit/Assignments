package calculateSum;

public class Stringorder {
	public static boolean stringOrder(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if (Character.compare(ch[i], ch[i + 1]) > 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(stringOrder("abzd"));
	}

}
