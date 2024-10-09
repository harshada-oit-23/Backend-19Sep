import java.util.Scanner;
public class area
{
    public static void main(String [] args)
    {
        int area,perimeter,side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side :");
        side=sc.nextInt();
        
        area = side*side ;
        perimeter = 4*side; 
        System.out.println("Area of square :"+area);
        System.out.println("Perimeter of square :"+perimeter);

    }
}
