package wtn;
import java.util.*;

public class Q18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}
	}
}
