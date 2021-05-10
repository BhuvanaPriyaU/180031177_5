package wtn;
import java.util.*;

public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch + "->" + Character.toLowerCase(ch));
		}
		else
		{
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		}
	}
}
