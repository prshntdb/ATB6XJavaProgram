import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the x");
        double x = sc.nextDouble();
        System.out.println("Enter the value for the y");
        double y = sc.nextDouble();
        System.out.println("Enter the value for the z");
        double z = sc.nextDouble();
        double result;
        result=Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);
        sc.close();

    }
}
