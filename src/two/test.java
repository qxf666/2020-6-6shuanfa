package two;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=input.nextLine();
        int count=0;
        boolean flag=true;
       for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
           if(s.charAt(i)!=s.charAt(j)){
               flag=false;
               break;
           }
       }
       if (flag){
           System.out.println( "is palindorme");
       }
       else
           System.out.println( "is not a palindorme");

    }
}
