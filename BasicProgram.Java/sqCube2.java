import java.util.Scanner;

public class sqCube2
{
    public static void main(String[] args) {
        double sq,cube,n ;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n :");
        n=sc.nextDouble();
        sq = Math.sqrt(1024);
        cube = n*n*n ;
        System.out.println("Square :"+sq);
        System.out.println("Cube :"+cube);
    }
}

