package two;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int count=1;
        int number=2;
        String s="";
        while(count<=50){
            boolean isprime=true;
            for(int divisor=2;divisor<number;divisor++){  //判断是否是素数
                if(number%divisor==0){
                    isprime=false;
                }
            }
            if (isprime){

                s+=number+" ";
               if(count%10==0)
                   s+="\n";
                count++;
            }
            number++;
        }
        System.out.println(s);
    }
}
