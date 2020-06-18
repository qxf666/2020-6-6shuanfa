package two;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please system input a hex char:");
        String answer = input.nextLine();
        char ch = answer.charAt(0);
        int result = 0;
        if ('A'<ch && ch<'F') {
            result = ch-'A'+10;
            System.out.println("the number is:" + result);
        } else if (Character.isDigit(ch)) {
            result = ch-'0';
            System.out.println("the number is:" + result);
        } else {
            System.out.println("Your input is error");
            System.exit(1);
        }

    }
}
