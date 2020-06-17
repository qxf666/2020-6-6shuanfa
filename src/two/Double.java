package two;

public class Double {
    public static void main(String[] args) {
       final double EPSILON=1e-14;
       double a=1-0.1-0.2-0.3;
       double b=0.4;
       if(Math.abs(a-b)<=EPSILON){
           System.out.println("a,b相等");
       }
    }
}