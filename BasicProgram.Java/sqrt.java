import java.util.Scanner;

public class sqrt
{
    public static void main(String[] args) {
        double  sq,n1 ;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n1 :");
        n1=sc.nextDouble();
        sq = Math.sqrt(n1);
        System.out.println("Square root of number = "+sq);
   }
}
