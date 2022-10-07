public class CalcEngine {
    public static void main(String[] a){
            double value1=100.0d;
            double value2=50.0d;
            double result=0.0d;
            char opCode='a';
            if(opCode=='a'){
                result=value1+value2;
            }else if(opCode=='s'){
                result=value1-value2;
            }else if(opCode=='m'){
                result=value1*value2;
            }else if(opCode=='d'){
                result=value1/value2;
            }else {
                result=0.0d;
            }

System.out.println("Result of Calc Engine"+result);
    }
}
