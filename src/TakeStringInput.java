import java.util.Scanner;

public class TakeStringInput {
    public static void main(String[] args){
        String firstName,lastName,fullName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name :");
        firstName=sc.next();
        System.out.println("Enter last name :");
        lastName=sc.next();
        System.out.println("print full name ::"+firstName +" "+lastName);
    }
}
