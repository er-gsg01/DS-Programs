import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ACBABDD";
	
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
			  if(data.getValue()==1)
			  System.err.println(data.getKey());
		  }
		  
	}

}
