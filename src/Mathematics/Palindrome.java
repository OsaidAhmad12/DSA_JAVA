package Mathematics;
import java.util.*;
public class Palindrome
{
    public boolean isPalindrome(int n)
    {
        int t=n,r=0,s=0;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return (s==t);
    }
    public static void main(String args[])
    {
        Palindrome obj=new Palindrome();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter a number to be checked:");
        n=dis.nextInt();
        System.out.println(obj.isPalindrome(n));
    }
}
