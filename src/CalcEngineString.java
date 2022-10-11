import java.time.LocalDate;
import java.util.Scanner;

public class CalcEngineString {
    public static void main(String[] args){
        double[] leftVals={100.0d,125.0d,25.0d,30.0d};
        double[] rightVals={125.0d,100.0d,50.0d,80.0d};
        char[] opCode={'a','s','d','m'};
        double[] result=new double[opCode.length];
        System.out.println("Command line arguments ::"+args);
//        if(args.length==0){
//            for(int i=0;i<opCode.length;i++){
//                result[i]= execute(opCode[i],leftVals[i],rightVals[i]);
//            }
//            for(double currentResult:result){
//                System.out.println("Result array : "+currentResult);
//            }
//        } else if (args.length==1 && args[0].equals("interactive")) {
            executeInteractively();

//
//        } else if(args.length==3)
//            handleCommandLine(args);
//        else{
//            System.out.println("Nothing here to do ...");
//        }
    }
    static double execute(char opCode,double leftVals,double rightVals){
        double result = 0.0d;
        switch (opCode){
            case 'a':
                result=leftVals +rightVals;
                break;
            case 's':
                result=leftVals - rightVals;
                break;
            case 'm':
                result=leftVals * rightVals;
                break;
            case 'd':
                result=leftVals / rightVals;
                break;
            default:
                System.out.println("Invalid opCode ");
        }
        return result;

    }
    static void executeInteractively(){
        System.out.println("Eneter an Operation and two numbers :");
        Scanner sb=new Scanner(System.in);
        String userInput=sb.nextLine();
        String[] parts=userInput.split(" ");
        System.out.println("parts ::"+parts);
        performOperation(parts);


    }

    private static void handleCommandLine(String[] args){
        char opCode=args[0].charAt(0);
        double leftVal=Double.parseDouble(args[1]);
        double rightVal=Double.parseDouble(args[2]);
        double result= execute(opCode,leftVal,rightVal);
        System.out.println(result);
    }
    static char opCodeFromStrings(String operationName){
        char opCode=operationName.charAt(0);
        return opCode;
    }
    static double valueFromWord(String word){
        String[] numberWords={
                "zero","one","two","three","four","five","six",
                "seven","eight","nine","ten"
        };
       double value=0.0d;
       for(int index=0;index<numberWords.length;index++){
           if(word.equals(numberWords[index])){
               value=index;
               break;
           }
       }
       return value;
    }
    private static void performOperation(String[] parts){
        char opCode= opCodeFromStrings(parts[0]);
        if(opCode=='w'){
            handleWhen(parts);

        }else{
            double leftVal= valueFromWord(parts[1]);
            System.out.println("leftVal value "+leftVal);
            double rightVal= valueFromWord(parts[2]);
            System.out.println("rightVal value "+rightVal);
            double result= execute(opCode,leftVal,rightVal);
            System.out.println(result);
        }

    }
    private static void handleWhen(String[] parts){
        LocalDate startDate=LocalDate.parse(parts[1]);
        long daysToAdd= (long) valueFromWord(parts[2]);
        LocalDate newDate=startDate.plusDays(daysToAdd);
        String output=String.format("%s plus %d days is %s ", startDate,daysToAdd,newDate);
        System.out.println(output);
    }
}
