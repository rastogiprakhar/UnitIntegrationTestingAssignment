package Question2;

import java.util.Scanner;

public class Palindrome implements Check{

    @Override
    public void factorial() {

    }

    public void palindrome() {
        int  reversedNum = 0, remainder;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to to find palindrome :");
        int num=sc.nextInt();

        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
