package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for factorial:");
        System.out.println("Enter 2 for checking palindrom:");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                Factorial f=new Factorial();
                f.factorial();
                break;
            case 2:
                Palindrome p=new Palindrome();
                p.palindrome();
                break;
        }
    }
}
