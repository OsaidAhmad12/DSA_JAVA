package Mathematics;
import java.util.*;
public class count
{
    public int countDigits(int n)
    {
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        count obj=new count();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter a number whose number of digits u want to count:");
        n=dis.nextInt();
        System.out.println("Number of Digits:"+obj.countDigits(n));
    }
}
