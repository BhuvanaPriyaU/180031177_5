package wtn_arrays;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={10,3,6,1,2,7,9};
		int sum=0,six=-1,seven=-1;
		for(int i=0;i<arr.length;i++) 
		{
			if (arr[i]==6)
			{
				six=i;
			}
			if (arr[i]==7)
			{
				seven=i;
			}
		}
		if(seven==-1) 
		{
			six=-1;
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(i>=six && i<=seven && six!=-1) 
			{
				continue;
			}
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
