
public class separateEvenOdd {
	
	static void arrayEvenOdd(int arr[], int n) {
 
	  int i = -1;
	  for(int j=0; j<n; j++) { 
	  if (arr[j] % 2 == 0) { 
          i++; 
          int temp = arr[i]; 
          arr[i] = arr[j]; 
          arr[j] = temp; 
      } 
	  }
	  for (int k = 0; k < n; k++) 
          System.out.print(arr[k] + " ");
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10,9,90};
		arrayEvenOdd(arr,arr.length);
	}
}