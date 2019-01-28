import java.util.*;
 public class Rhombus {
    public static void main(String args[])
    {
        int n,i,j,k,count=1,count2=1;
        char ch = 'A';
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of rows :");
        n = in.nextInt();
        for (i = 1; i<(n * 2); i++) 
        {
            for (k = n-count2; k>0; k--)   
             {
                System.out.print(" ");
             }
            if (i < n) 
                count2++;
            else 
                count2--;
            for (j = 0; j<count; j++) 
            {
                System.out.print(ch);
                if (j<count/2) 
                    ch++;
                else 
                    ch--;
            }
            if (i<n)
                count = count+2;
            else
                count = count-2;

            ch = 'A';
            System.out.println();
        }
    }
}