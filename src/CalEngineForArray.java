public class CalEngineForArray {
    public static void main(String[] args){
        double[] leftVals={100.0d,125.0d,25.0d,30.0d};
        double[] rightVals={125.0d,100.0d,50.0d,80.0d};
        char[] opCode={'a','s','d','m'};
        double[] result=new double[opCode.length];
        for(int i=0;i<opCode.length;i++){
            switch (opCode[i]){
                case 'a':
                    result[i]=leftVals[i] +rightVals[i];
                    break;
                case 's':
                    result[i]=leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    result[i]=leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    result[i]=leftVals[i] / rightVals[i];
                    break;
                default:
                    System.out.println("Invalid opCode ");
            }
        }
        for(double currentResult:result){
            System.out.println("Result array : "+currentResult);
        }

    }
}
