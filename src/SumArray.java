
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr []={70,35,20,15,20};
         for(int i =0; i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++)
        	 {
        		   if(arr[i]+arr[j]==40)
        		   {
        			   System.out.print(arr[i]+" "+arr[j]);
        		   }
        		 
        	 }
        	 
         }
	}

}
