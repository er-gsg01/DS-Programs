
public class StringReverse {

	public static void main(String[] args) { 
		 String str="Hello Coforge";
			  String rev = "";
			  char[] finalarray = str.toCharArray();
			  for (int i = finalarray.length - 1; i >= 0; i--)
			    rev += finalarray[i];
			  System.out.println(rev);
			}
			

	}

