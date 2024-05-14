package APRIL.Date_25042024;

import java.util.Scanner;

public class LAB074_Vowel_SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);


        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                int a =10;
                int b=10;
                System.out.println(a+b);
                break;

            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;


            default:
                System.out.println("Not a vowel it is consonant");

        }

        sc.close();

    }
}
