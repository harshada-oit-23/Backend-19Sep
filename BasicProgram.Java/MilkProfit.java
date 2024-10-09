import java.util.Scanner;

public class MilkProfit {
    public static void main(String[] args) {
        double milk , profit,total;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many liter milk:");
        milk=sc.nextDouble();
        total = (milk*53.25);
        profit = (milk+(milk/4))*74.15-total ;
       
        System.out.println("Total milk is :"+profit+ " liters");
        System.out.println("Profit of milk :"+profit +" /-");

    }
}
