import java.util.*;
public class addSub2
{
    public static void main(String [] args)
    {
        int add,sub,n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n1 & n2 :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        add = n1+n2;
        sub= n1-n2 ;
        System.out.println("Adddiion :"+add);
        System.out.println("Subtraction :"+sub);

    }
}