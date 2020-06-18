package two;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int count=1;
        int number1;
        int number2;
        int countNumber;
        int correctNumber=0;
        String output="";
        String jieguo;
        long time1=System.currentTimeMillis();
        Scanner input=new Scanner(System.in);
        while(count<=5){
            number1=(int)(Math.random()*10);
            number2=(int)(Math.random()*10);
            System.out.printf("what is %d -%d ?",number1,number2);
            int result=number1-number2;
            countNumber=input.nextInt();
            if(countNumber==result){
                System.out.println("You are correct!");
                jieguo="correct";
            }
            else{
                System.out.println("Your answer is wrong");
                System.out.printf("%d-%d should be %d \n",number1,number2,result);
                jieguo="wrong";
            }
            output+=number1+"-"+number2+"="+result+jieguo+"\n";
            count++;
        }
        long time2=System.currentTimeMillis();
        long time=(time2-time1)/1000;
        System.out.println("Test time is"+time+"seconds");
        System.out.println(output);
    }
}
