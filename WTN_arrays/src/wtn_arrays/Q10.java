package wtn_arrays;
import java.util.*;

public class Q10 {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		
		int n=3,m=3;
	    Scanner sc=new Scanner(System.in);
	    int arr[][]=new int[n][m];
	    for(int i=0;i<n;i++)
	    {
	      for(int j=0;j<m;j++)
	      {
	        arr[i][j]=sc.nextInt();
	      }
	    }
	    System.out.println("The given array is:");
		 for(int i=0;i<n;i++) 
		 {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	    int max=0;
	    for(int i=0;i<n;i++)
	    {
	      for(int j=0;j<m;j++)
	      {
	        if(arr[i][j]>max)
	        {
	          max=arr[i][j];
	        }
	      }
	    }
	    System.out.println("The biggest number in the given array is "+max);
	  }
}
