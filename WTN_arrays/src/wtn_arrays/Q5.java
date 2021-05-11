package wtn_arrays;
import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {6,12,143,111,0,-6};
		Arrays.sort(arr);
		System.out.println("1st largest number: "+arr[arr.length-1]);
		System.out.println("2nd largest number: "+arr[arr.length-2]);
		System.out.println("1st smallest number: "+arr[0]);
		System.out.println("2nd smallest number: "+arr[1]);
	}
}
