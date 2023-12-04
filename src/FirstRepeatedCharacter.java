
public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String str = "cbappaleb";
		System.out.println(firstRepChar(str));
	}

	static String firstRepChar(String s) {
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (a[ch - 'a'] != 0)
				return Character.toString(ch);
			else
				a[ch - 'a']++;
		}
		return "-1";
	}
}
