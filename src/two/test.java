package two;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);
        char lottery1=lottery.charAt(0);
        char lottery2=lottery.charAt(1);
        System.out.print("please input your guess number:");
        String guess=input.nextLine();
        char guess1=guess.charAt(0);
        char guess2=guess.charAt(1);
        if(lottery.equals(guess)){
            System.out.println("you win 3000$");
        }
        else if(lottery1==guess2&&lottery2==guess1){
            System.out.println("you win 1500$");
        }
        else if(lottery1==guess1||lottery1==guess2 ||
                lottery2==guess1||lottery2==guess2
        ){
            System.out.println("you win 500$");
        }
        else
            System.out.println("sorry you don't have win");
        System.out.println("the Lottery is:"+lottery);
    }
}
