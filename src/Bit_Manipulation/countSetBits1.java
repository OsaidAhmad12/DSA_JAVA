package Bit_Manipulation;
import java.util.*;
public class countSetBits1
{
    public static int count_set_Bits(int n)
    {
        int c=0;
        while(n>0)
        {
            if(n%2!=0)
                c++;
            n=n/2;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Count of Set Bits:"+count_set_Bits(n));
    }
}
