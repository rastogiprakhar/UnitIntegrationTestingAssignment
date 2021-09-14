package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Follow the Instructions:");
        System.out.println("i. Password should not contain any space.\n" +
                "    ii. Password should contain at least one digit(0-9).\n" +
                "    iii. Password length should be between 8 to 15 characters.\n" +
                "    iv. Password should contain at least one lowercase letter(a-z).\n" +
                "    v. Password should contain at least one uppercase letter(A-Z).\n" +
                "    vi. Password should contain at least one special character ( @, #, %, &, !, $, etc\n");
        System.out.println("Enter Your Password:");
        final String password=sc.next();

        if (Validator.isValid(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password!!!");
    }
}
