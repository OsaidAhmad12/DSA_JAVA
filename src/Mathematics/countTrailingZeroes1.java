package Mathematics;
import java.util.*;
public class countTrailingZeroes1
{
    public int countZeroes(int n)
    {
        int f=1,c=0;
        for(int i=2;i<=n;i++)
            f=f*i;
        while(f%10==0)
        {
            f=f/10;
            c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        countTrailingZeroes1 obj=new countTrailingZeroes1();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Number of trailing zeroes:"+obj.countZeroes(n));

    }
}
