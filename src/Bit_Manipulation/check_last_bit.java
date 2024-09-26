package Bit_Manipulation;
import java.util.*;
public class check_last_bit
{
    public static boolean lastBit(int n)
    {
        if((n&1)!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Is Last bit is set:"+lastBit(n));
    }

}
