import java.util.Scanner;

public class subject {
    public static void main(String[] args) {
        int m1,m2,m3,total,avg,class;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class : ");
        class = sc.nextLine();
        System.out.println("Enter marks of 3 subjects : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        total = m1+m2+m3; 
        avg=(m1+m2+m3)/3;


    }
}
