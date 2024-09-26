package Bit_Manipulation;
import java.util.*;
public class powerOF21
{
    public static boolean power_of_2(int n)
    {
        if(n==0)
            return false;
        while(n!=1)
        {
            if(n%2!=0)
                return false;
            n=n>>1;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Is "+n+" power of 2:"+power_of_2(n));
    }

}
