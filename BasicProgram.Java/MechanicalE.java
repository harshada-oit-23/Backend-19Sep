import java.util.Scanner;

public class MechanicalE {
    public static void main(String[] args) {
        int me,m,g,h,v ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m,g,h,v : ");
        m = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        v = sc.nextInt();

        me = m*g*h+(1/2)*m*v*v;
        System.out.println("Mechanical Energy :"+me);

    }
}
