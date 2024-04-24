import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Leap Year"+year);
        }
        else
        {
            System.out.println("Not a Leap Year"+year);
        }
        sc.close();
    }
}
