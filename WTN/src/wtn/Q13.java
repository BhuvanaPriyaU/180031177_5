package wtn;

public class Q13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<100;i++)         
		{ 		  	  
			int c=0; 	  
	        for(int num=i;num>=1;num--)
	        {
	        	if(i%num==0)
	        	{
	        		c=c+1;
		        }
		    }
	        if(c==2)
	        {
	        	System.out.println(i+" ");
		    }	
	    }	
	}
}
