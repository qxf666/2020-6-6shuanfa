package two;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a hex number:");
        String s=input.nextLine();
        int number=0;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            number+= hexToDecimal(s.charAt(i))*Math.pow(16,j);
        }
        System.out.printf("The decimal val for hex number %s is %d",s,number);
    }
    public static int hexToDecimal(char ch){
        if(ch>='A'&&ch<='F'){
            return ch-'A'+10;
        }else
            return ch-'0';
    }
}
