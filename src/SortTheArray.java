
public class SortTheArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, -2, 5, 6, -6 };

		for (int i = 0; i <arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
			System.err.print(arr[i]+" ");
		}
	
	}
}
