package Bit_Manipulation;
import java.util.*;
public class powerOf2_3
{
    public static boolean check_power2(int n)
    {
        return ((n>0) && ((n&(n-1))==0));
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Is "+n+" a power of 2:"+check_power2(n));
    }
}
