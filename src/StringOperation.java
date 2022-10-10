public class StringOperation {
    public static void main(String[] args){
        String name="John";
        String greeting= "hi " + name;
        String message="hi John";
        System.out.println(greeting == message);

        System.out.println(greeting.equals(message));

//        greeting += "! Welcome back.";
//        System.out.println(greeting);
        String s1="I Love";
        s1 += " Java";
        String s2="I";
        s2+=" Love Java";
        System.out.println(s1==s2);

        String s3= s1.intern();
        String s4=s2.intern();
        System.out.println(s3==s4);

    }
}
