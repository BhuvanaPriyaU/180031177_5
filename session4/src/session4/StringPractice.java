package session4;

public class StringPractice {
	public static void main(String args[])
	{
		String s=new String("hi how are u");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.indexOf('h'));
		System.out.println(s.indexOf('h'));
		System.out.println(s.toUpperCase()+" "+s.toLowerCase());
		String s1="abc:def";
		String b[]=s1.split(":");
		for(String x:b)
		{
			System.out.println(x);
		}
		
		char ch[]=s1.toCharArray();
		for(char x:ch)
		{
			System.out.println(x);
		}
		
		System.out.println(s1.equals(s));
		
		String a="bhuvana";
		String c="bhuvana";
		System.out.println(s1.compareTo(s));  //numeric output
		
		System.out.println(a.concat(c));
		System.out.println(a+c);
	}
}
