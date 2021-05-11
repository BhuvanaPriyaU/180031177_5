package wtn_arrays;
import java.util.*;

public class Q9 {
	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 
		 Scanner sc=new Scanner(System.in);
		 int n=2,m=2;
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
		 System.out.println("The reverse of the array is:");
		 for(int i=n-1;i>=0;i--)
		 {
			 for(int j=m-1;j>=0;j--)
			 {
				 System.out.print(arr[i][j]+" ");
		     }
			 System.out.println("");
		 }
		 }
}
