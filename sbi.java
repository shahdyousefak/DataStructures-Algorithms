
public class sbi {
	static void sbi (int[] arr, int n) {
	int max1 = 0, min1 = 0;
	int max2=1, min2=1;

	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]*arr[j] > arr[max1]*arr[max2]) {
				max1=i;
				max2=j;
			}
			if(arr[i]*arr[j] < arr[min1]*arr[min2]){
				min1=i;
				min2=j;
			}
		}
	}
	System.out.println("Max product is between index " + max1 + "=" + arr[max1] + " and " + max2 + "=" + arr[max2] + ":" +  (arr[max1]*arr[max2]));
	System.out.println("Min product is between index " + min1 + "=" + arr[min1] + " and " + min2 + "=" + arr[min2] + ":" + (arr[min1]*arr[min2]));
	}
	
	public static void main(String[]args) {
		int[] a = {1};
		sbi(a, 1);
	}
	
}
