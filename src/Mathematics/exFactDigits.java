package Mathematics;
import java.util.*;
public class exFactDigits
{
    public int factDigits(int n)
    {
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+Math.log10(i);
        }
        return (int)((Math.floor(s)+1));
    }
    public static void main(String[] args)
    {
        exFactDigits obj=new exFactDigits();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Number of digits in "+n+"!="+obj.factDigits(n));

    }

}
