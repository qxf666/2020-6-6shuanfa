package two;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int month=input.nextInt();
        int day=input.nextInt();
        String[] s={"ABCDEFGHI","JKLMNOPQR","STUVWXYZ*"};
        int moveMonth=(month-1+3)%3;
        int moveDay=(day-1+9)%9;
        while (moveMonth>0){
            String temp="STUVWXYZ*";
            for(int i=s.length-1;i>0;i--){
                s[i]=s[i-1];
            }

        }
    }
}
