package Question2;

import java.util.Scanner;

class Factorial implements Check{

    public void factorial() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to to find factorial :");
        int num=sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

    }

    @Override
    public void palindrome() {

    }

}
