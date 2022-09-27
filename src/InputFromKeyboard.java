import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,sum;
        System.out.println("Enter number n1 ::");
        n1=sc.nextInt();
        System.out.println("Enter number n2");
        n2=sc.nextInt();
        sum=n1+n2;
        System.out.println("print sum ::"+sum);
    }
}
