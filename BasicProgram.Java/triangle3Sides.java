import java.util.Scanner;
public class triangle3Sides
{
    public static void main(String [] args)
    {
        double area,a,b,c,s,d,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius a,b,c :");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        n=sc.nextDouble();

        s = a+b+c/2 ;
        n=s(s-a)(s-b)(s-c);
        d=Math.sqrt(n);
        System.out.println("Semi perimeter :"+s);
        System.out.println("Area of triangle:"+d);

    }
}

