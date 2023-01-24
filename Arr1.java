package PracticeQ;

import java.util.Arrays;

class A{
	public static int[] M (int arr[]){
		int n=arr.length;
		Arrays.sort(arr);
		return new int[] {arr[1], arr[n-1]};
	}
}
public class Arr1 {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 2 };
		int result[] = A.M(arr);
		System.out.println("second minimum element is: "+result[0]);
		System.out.println("maximum element is: "+result[1]);
	}

}
