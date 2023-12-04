import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CountNumberOfCharacter {

	public static void main(String[] args) {
		String str = "aaabbaacdddaaeefg";
		ArrayList<Character> al = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			al.add(str.charAt(i));
		}
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			hm.putIfAbsent(al.get(i),Collections.frequency(al,al.get(i)));
		}

		for (Entry<Character, Integer> e : hm.entrySet()) {
			System.out.print(
				e.getKey()+""+ e.getValue());
		}
		
		char ch[] = str.toCharArray();

		HashMap<Character, Integer> hmap = new HashMap<>();
		for (char c : ch) {

			if (hmap.containsKey(c)  == true) {
				int val = hmap.get(c);
				val = val + 1;
				hmap.put(c, val);
			} else {
				hmap.put(c, 1);
			}
		

		}
		
		Set<Entry<Character, Integer>> mapp=  hmap.entrySet();
		  for(Entry<Character, Integer> data:mapp)
		  {
			  System.err.println(data.getKey()+" "+data.getValue());
		  }
		  
	
	}

}
