
import java.util.Scanner;

public class simple{
       public static void main(String[] args) {
        double si,principal,rate,time,ci;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal,rate,time :");
        principal=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();

        si=principal*rate*time;
        ci=principal*(Math.pow((1+rate/100),time));
        System.out.println("Simple Interest :"+si);
        System.out.println("Compound Interest :"+ci);

    }
}
