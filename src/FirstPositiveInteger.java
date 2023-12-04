
public class FirstPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {-1,4,0,2,-3};
    
       for(int i=0; i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   int temp;
    		   if(arr[i]>arr[j])
    		   {
    			   temp=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=temp;
    			   
    		   }
    	   }
			if (arr[i] > 0) {
				System.out.println(arr[i]);
				break;
			}
       }
	}

}
