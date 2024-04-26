import java.util.Scanner;

public class LAB20_SwitchStatement {
    public static void main(String[] args) {
        // If Else -Condition (If, else If,else)-multiple condition
        //switch - multiple condition
        // which day it is ?
        // 1-> Monday , Sunday -> 7,4 -> Thursday
        //1,2,3,4,5,6,7 -> MTWTFSS
        //Create a simple program - user will enter a number, we will tell user which day it is .


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1-7 , I will tell you day it is ");
        int day = sc.nextInt();


        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Only number 1-7 are allowed");


        }
    }
}
