package Bit_Manipulation;
import java.util.*;
public class countSetBits2
{
    public static int count_set_bits2(int n)
    {
        int c=0;
        while (n>0)
        {
            c=c+(n&1);
            n=n>>1;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Count of set bits:"+count_set_bits2(n));
    }
}
