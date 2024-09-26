package Bit_Manipulation;
import java.util.*;
public class check_kth_bit_4
{
    public static boolean kthbitCheck4(int n,int k)
    {
        int x=(n>>(k-1));
        if((x&1)!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner dis = new Scanner(System.in);
        int n = 0, k = 0;
        System.out.println("Enter the number");
        n = dis.nextInt();
        System.out.println("Enter the value of k:");
        k = dis.nextInt();
        System.out.println("Is " + k + " bit set :" + kthbitCheck4(n, k));
    }
}
