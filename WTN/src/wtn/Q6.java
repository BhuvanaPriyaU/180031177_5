package wtn;
import java.util.*;

public class Q6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String gender=sc.next();
	    int age=sc.nextInt();
	    if(gender.equals("female"))
	    {
	    	if(age>=1 &&age<=58)
	    	{
	    		System.out.println("The percentage of interest is 8.2%.");
	        }
	        else
	        {
	            System.out.println("The percentage of interest is 9.2%.");
	        }
	   }
	   else 
	   {
		   if(age>=1 && age<=58)
		   {
			   System.out.println("The percentage of interest is 8.4%.");
	       }
	       else
	       {
	    	   System.out.println("The percentage of interset is 10.5%");
	       }
	    }
	 }
}