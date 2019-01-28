import java.util.*;
public class Spaces
{
	public static void main( String [] args)
	{
	int num,d1,d2,d3,d4,d5,X;
	Scanner in=new Scanner(System.in);
	System .out.println("enter any number :");
	num=in.nextInt();
	d1=num%10;
	num=num/10;
	d2=num%10;
	num=num/10;
	d3=num%10;
	num=num/10;
	d4=num%10;
	num=num/10;
	d5=num%10;
	//X=(10000*d5)+(1000*d4)+(100*d3)+(10*d2)+(1*d1);
	System .out.println(""+d5+"   "+d4+"   "+d3+"   "+d2+"   "+d1);
    }
}
