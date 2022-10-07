public class CalculateFactorial {
    public static void main(String[] args){
        int someValue=4;
        int factorial=1;

     /*
      // while loop
        while(someValue > 1){
            factorial *=someValue;
            someValue--;
        }
*/

     /*
      // do while loop
      do {
            factorial *=someValue;
            someValue--;

            }while (someValue >1);
*/

        // for loop
        for(int i=someValue;i>1;i--){
            factorial =i*factorial;
        }
        System.out.println("Factorial of Number 4 is : "+factorial);
    }
}
