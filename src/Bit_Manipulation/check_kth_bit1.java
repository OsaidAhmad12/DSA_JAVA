package Bit_Manipulation;
import java.util.*;
public class check_kth_bit1
{
    public static boolean kthbitCheck(int n,int k)
    {
        int x=1;
        for(int i=0;i<k-1;i++)
            x=x*2;
        if((n&x)!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0,k=0;
        System.out.println("Enter the number");
        n=dis.nextInt();
        System.out.println("Enter the value of k:");
        k=dis.nextInt();
        System.out.println("Is "+k+" bit set :"+kthbitCheck(n,k));
    }
}
