import java.util.Scanner;
public class areaCircle
{
    public static void main(String [] args)
    {
        double area,cir,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        r=sc.nextDouble();
        
        area = 3.14*r*r ;
        cir = 2*3.14*r; 
        System.out.println("Area of circle :"+area);
        System.out.println("Circumference of circle :"+cir);

    }
}

