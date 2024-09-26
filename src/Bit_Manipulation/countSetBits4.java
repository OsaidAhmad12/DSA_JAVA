package Bit_Manipulation;
import java.util.*;
public class countSetBits4
{
    static int tbl[]=new int[256];
    public static void initilialize()
    {
        tbl[0]=0;
        for(int i=1;i<256;i++)
            tbl[i]=tbl[i&(i-1)]+1;
    }
    public static int count_Set_Bits4(int n)
    {
        return tbl[n & 255]+tbl[ (n>>8)&255]+tbl[(n>>16)&255]+tbl[n>>24];
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        initilialize();
        System.out.println("Count of set bits:"+count_Set_Bits4(n));

    }
}
