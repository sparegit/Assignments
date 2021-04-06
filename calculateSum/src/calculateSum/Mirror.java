package calculateSum;

public class Mirror {
	public static String mirrorString(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
		}
		sb.append('|');
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(mirrorString("EARTH"));

	}

}
//ex.2