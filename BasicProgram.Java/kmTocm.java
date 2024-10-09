import java.util.Scanner;

public class kmTocm
{
    public static void main(String[] args) {
        int km , cm ,m ;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers:");
        km=sc.nextInt();      
        m = km*1000 ;
        cm = km *10000 ;
        System.out.println(" Meters :"+m);
        System.out.println(" Centimeters :"+cm);

    }
}

