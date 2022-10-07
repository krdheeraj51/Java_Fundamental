public class MaxValue {
    public static void main(String[] a){
        int value1=5;
        int value2=7;
        int result;
//        int result= value1 > value2 ? value1 : value2;

        if(value1 > value2){
            result= value1;
        }else {
            result = value2;
        }
        System.out.println("Max value :"+result);
    }
}
