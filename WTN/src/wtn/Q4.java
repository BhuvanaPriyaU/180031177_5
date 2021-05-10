package wtn;
import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		if(ch1<ch2)
		{
			System.out.print(ch1+" "+ch2);
		}
		else
		{
			System.out.print(ch2+" "+ch1);
		}
	}
}
