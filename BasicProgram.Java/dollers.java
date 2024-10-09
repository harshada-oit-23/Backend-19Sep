import java.util.Scanner;
    public class dollers {
    public static void main(String []args)
    {
        double rupee , doller ,convert;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupee : ");
        convert = sc.nextDouble() ;
        System.out.println("Enter amount of dollers : ");
        doller = sc.nextDouble() ;
        rupee = doller*convert ;
          System.out.println("Rupee : "+rupee);
     }
}
