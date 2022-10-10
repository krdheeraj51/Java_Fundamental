public class StringBuilderExample {
    public static void main(String[] args){
        String location="Florida";
        int flightNumber=174;
        StringBuilder sb=new StringBuilder(40);
        sb.append("I flew");
        sb.append(location);
        sb.append(" on flight #");
        sb.append(flightNumber);
        String time ="9.00";
        int pos=sb.indexOf(" on");
        sb.insert(pos," at ");
        sb.insert(pos +4,time);
        System.out.println(sb);
    }
}
