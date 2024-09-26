package Bit_Manipulation;
import java.util.*;
public class countSetBits3
{
    public static int count_Set_Bits3(int n)
    {
        int c=0;
        while (n>0)
        {
            n=n&(n-1);
            c++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Count of set bits:"+count_Set_Bits3(n));
    }
}
