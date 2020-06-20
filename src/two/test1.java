package two;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
    int[] deck=new int[52];
    for (int i=0;i<deck.length;i++){
        deck[i]=i;
    }
    String[] suit={"S","H","D","C"};
    String[] ranks={"A","1","2","3","4","5","6","7","8","9","J","Q","K"};
    int temp;
    //Shuffling the array;
        for(int i=0;i<deck.length;i++){
            temp=deck[i];
            deck[i]=deck[(int)(Math.random()*deck.length)];
            deck[(int)(Math.random()*deck.length)]=temp;
        }
        System.out.println(deck[0]);
    for(int i=0;i<4;i++){
        System.out.printf("Card number %d:%s of %s\n",deck[i],ranks[deck[i]%13],suit[deck[i]/13]);
    }
    }
}
