import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args){
        int arr[]=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array ::");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("array Elements ::"+arr[i]);
            sum+=arr[i];
        }
        System.out.println("Sum ::"+sum);
    }
}
