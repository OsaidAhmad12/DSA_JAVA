package Bit_Manipulation;
import java.util.*;
public class check_kth_bit2
{
    public static boolean kthbitCheck2(int n,int k)
    {
        for(int i=0;i<k-1;i++)
            n=n/2;
        if((n & 1)!=0)
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
        System.out.println("Is "+k+" bit set :"+kthbitCheck2(n,k));

    }
}
