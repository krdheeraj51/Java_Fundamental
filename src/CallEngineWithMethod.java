public class CallEngineWithMethod {
    public static void main(String[] args){
        double[] leftVals={100.0d,125.0d,25.0d,30.0d};
        double[] rightVals={125.0d,100.0d,50.0d,80.0d};
        char[] opCode={'a','s','d','m'};
        double[] result=new double[opCode.length];
        System.out.println("Command line arguments ::"+args);
        if(args.length==0){
            for(int i=0;i<opCode.length;i++){
                result[i]= execute(opCode[i],leftVals[i],rightVals[i]);
            }
            for(double currentResult:result){
                System.out.println("Result array : "+currentResult);
            }
        }
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
}
