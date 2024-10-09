import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        int age,days;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        age = sc.nextInt();
        days = age*365 ;
        System.err.println("Age in days :"+days);
    }
}
