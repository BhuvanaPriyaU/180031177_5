package wtn;
import java.util.*;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='R')
		{
			System.out.print("Red");
		}
		else if(ch=='W')
		{
			System.out.print("White");
		}
		else if(ch=='G')
		{
			System.out.print("Green");
		}
		else if(ch=='O')
		{
			System.out.print("Orange");
		}
		else if(ch=='Y')
		{
			System.out.print("Yellow");
		}
		else if(ch=='B')
		{
			System.out.print("Blue");
		}
		else
		{
			System.out.println("Invalid code");
		}
	}
}
