package Question3;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1 For User Validation Class:");
        System.out.println(" 2 For Company Validation Class:");
        System.out.println(" 3 For Email Validation Class :");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println(" 1 For Checking if company exists in database:");
                System.out.println(" 2 for Checking if email id is valid :");
                int your_choice=sc.nextInt();
                switch (your_choice)
                {
                    case 1:
                        User_Validation uv=new User_Validation();
                        uv.Check();
                        break;
                    case 2:
                        User_Validation u=new User_Validation();
                        u.validate();
                        break;
                }
                break;
            case 2:
                System.out.println(" 1 for Company should not already exists in database:");
                System.out.println(" 2 for Checking if email id is valid :");
                choice=sc.nextInt();
                Company_Validation cv=new Company_Validation();
                switch (choice)
                {
                    case 1: cv.Checkforcompany();
                    break;
                    case 2: cv.validateformail();
                }
                break;
            case 3:
                Email_Validation ev=new Email_Validation();
                ev.email();
                break;
        }
    }
}
