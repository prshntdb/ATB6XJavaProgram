package MAY.Date_04052024;

import java.util.Scanner;

public class LAB134 {
    public static void main(String[] args) {
        // Palindrome -> String

        // naman-> reverse->naman

        //1331->1331

        //Malaylam-> Palindrome
        // Madam  true, mom


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String, I will check if it is palindrome or not");
        String user_input=sc.next();
        StringBuilder sb=new StringBuilder(user_input);
        String rev_user_input=sb.reverse().toString();
        if (user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome->"+user_input);

        }else{
            System.out.println("Nope");
        }

    }
}
