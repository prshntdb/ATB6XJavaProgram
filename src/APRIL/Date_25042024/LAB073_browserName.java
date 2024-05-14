package APRIL.Date_25042024;

import java.util.Scanner;

public class LAB073_browserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();


        switch (browserName){
            case "chrome":
                System.out.println("Start the Chrome Browser");
                break;

            case "firefox":
                System.out.println("Start the Firefox Browser");
                break;

            case "edge":
                System.out.println("Execute the Edge Browser");
                break;

            default:
                System.out.println("I have no idea which browser is this ");
                break;

        }
    }
}
