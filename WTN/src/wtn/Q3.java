package wtn;
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		if(s.length()==0) 
		{
			System.out.println("No Values");
		}
		else 
		{
			for(int i=0;i<s.length();i++) 
			{
				System.out.print(s);
				if(i<s.length()-1) 
				{
					System.out.print(", ");
				}
			}
		}
	}
}
