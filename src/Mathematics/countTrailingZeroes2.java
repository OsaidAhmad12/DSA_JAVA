package Mathematics;
import java.util.*;
public class countTrailingZeroes2
{
    public int countZeroes(int n)
    {
        int res=0;
        for(int i=5;i<=n;i=i*5)
            res=res+n/i;
        return res;
    }
    public static void main(String args[])
    {
        countTrailingZeroes2 obj=new countTrailingZeroes2();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Number of Trailing Zeroes:"+obj.countZeroes(n));

    }
}
