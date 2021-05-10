package wtn;
import  java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" is positive number");
			
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
