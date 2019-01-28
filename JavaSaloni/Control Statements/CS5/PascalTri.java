import java.util.*;

class PascalTri
{
    public static void main(String args[])
    {
        int x, i, j,y, num=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        x = in.nextInt(); 
        for(i=0;i<x;i++)
        {
            for(y=x; y>i; y--)
            {
                System.out.print(" ");
            }
            num = 1;
            for(j=0;j<=i;j++)
            {
                 System.out.print(num+ " ");
                 num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}