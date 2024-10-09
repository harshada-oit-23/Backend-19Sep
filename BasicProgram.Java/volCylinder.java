import java.util.Scanner;
public class volCylinder
{
    public static void main(String [] args)
    {
        double volume , r,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        r=sc.nextDouble();
        System.out.println("Enter  height :");
        h=sc.nextDouble();

        volume = 3.14*r*r*h ;
        
        System.out.println("Volume of cylinder :"+volume);

    }
}

