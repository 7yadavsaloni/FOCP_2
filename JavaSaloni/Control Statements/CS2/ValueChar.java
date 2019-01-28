import java.util.*;
public class ValueChar
{
	public static void main( String [] args)
	{ 
	  char ch;
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter any character :");
	  ch=in.next().charAt(0);
	  if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
	  {
	    if(ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
	     System.out.println("vowel");
	    else
	     System.out.println("consonent");
	  }
	  else 
	  System.out.println("Oops! error");
    }
}