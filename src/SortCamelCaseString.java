import java.util.Collections;
import java.util.Vector;

public class SortCamelCaseString {


	public static String getSortedString(StringBuilder s, int n) {

		Vector<Character> v1 = new Vector<>();
		Vector<Character> v2 = new Vector<>();

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				v1.add(s.charAt(i));

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z')
				v2.add(s.charAt(i));
		}
		Collections.sort(v1);
		Collections.sort(v2);

		int i = 0, j = 0;

		for (int k = 0; k < n; k++) {

			if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z') {
				s.setCharAt(k, v1.elementAt(i));
				++i;
			}

			else if (s.charAt(k) >= 'A' && s.charAt(k) <= 'Z') {
				s.setCharAt(k, v2.elementAt(j));
				++j;
			}
		}

		return s.toString();
	}

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("gEeksfOrgEEkS");
		int n = s.length();
		System.out.println(getSortedString(s, n));
	}

}
