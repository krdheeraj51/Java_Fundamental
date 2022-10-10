public class SwapTwoNum {
    public static void main(String[] args){
        swapNum(10,20);

    }
    static void swapNum(int i,int j){
        int k=i;
        i=j;
        j=k;
        System.out.println("first Num : "+i+ " Second Num : "+j);

    }
}
