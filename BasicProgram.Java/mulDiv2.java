import java.util.Scanner;

public class mulDiv2
{
    public static void main(String[] args) {
        int mul ,div,n1,n2 ;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n1 & n2 :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        mul = n1*n2;
        div = n1/n2 ;
        System.out.println(n1+"*"+n2+"="+mul);
        System.out.println(n1+"/"+n2+"="+div);
        
    }
}
