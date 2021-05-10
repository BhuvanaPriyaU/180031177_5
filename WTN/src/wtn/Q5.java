package wtn;
import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.print("Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.print("Digit");
		}
		else
		{
			System.out.print("Special Character");
		}

	}
}