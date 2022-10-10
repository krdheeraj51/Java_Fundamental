public class StringFormatingOperation {
    public static void main(String[] args){
        int w=15,x=20;
        int postiveVal=245,negativeVal=-200;
        String s1=String.format("W: %04d ,X:%04d",w,x);
        System.out.println(s1);
        String s2=String.format("Postive value: %+d",postiveVal);
        String s3=String.format("Negative value: %+d",negativeVal);
        System.out.println(s2);
        System.out.println(s3);
    }
}
