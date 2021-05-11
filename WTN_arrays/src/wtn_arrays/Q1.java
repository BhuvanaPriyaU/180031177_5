package wtn_arrays;

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6};
		int sum=0,c=0;
		for(int i:arr)
		{
			sum+=i;
			c++;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/c);
	}
}
