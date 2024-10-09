import java.util.*;
public class secondTohr {
    public static void main(String[] args) {
        double sec ,min, hr,a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second : ");
        sec = sc.nextDouble();
        hr = sec/3600 ;
        a = sec % 3600 ;
        min = a / 60 ;
        sec = a % 60 ;
        System.out.println("Hours :"+hr+" hrs");
        System.out.println("Minutes :"+min+" min");
        System.out.println("Second :"+sec+" sec");


    }
}
