package session4;

public class Practice {
	public static void main(String args[])
	{
		Character c=new Character('5');
		char ch=c;
		
		System.out.println(Character.isLetter(c));
		
		System.out.println(Character.isLetter(ch));
		
		System.out.println(Character.toUpperCase(65));
		
		System.out.println(Character.toUpperCase('A'));
		
	}
}
