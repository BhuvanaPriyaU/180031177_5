package wtn;
import java.util.*;

public class Q19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,i=2;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(i<=num)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
