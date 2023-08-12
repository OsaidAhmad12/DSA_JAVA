package Mathematics;

import java.util.Scanner;

public class Multiplication_under_modulo
{
    public static void modulo(long a,long b)
    {
        long m=(long)(Math.pow(10,9)+7);
        long A=a%m;
        long B=b%m;
        long C=(A*B)%m;
        System.out.println(C);
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        long a=0,b=0;
        System.out.println("Enter the numbers:");
        a=dis.nextLong();
        b=dis.nextLong();
        System.out.println("Multiplication under modulo :");
        modulo(a,b);
    }
}
