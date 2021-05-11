package wtn_arrays;
import java.util.*;

public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,4,1,3,6,4,12};
		List<Integer> distinctArray=new ArrayList<>();
		for(int item:arr)
		{
			if(!distinctArray.contains(item))
			{
				distinctArray.add(item);
			}
		}
		System.out.println(Arrays.toString(distinctArray.toArray()));
	}
}
