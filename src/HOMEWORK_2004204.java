public class HOMEWORK_2004204 {
    public static void main(String[] args) {
        System.out.println("Question 1");
        int a=10,b=25,c=15;
        int max=(a>b)?(a>c?a:c):(b>c?b:c);

        System.out.println("Max Number" +a+ "," +b+ " and " +c+ "is"+max);
        System.out.println("The maximum number is"+max);


        System.out.println("Question 2 ");
        int a1=20;
        System.out.println("result="+(++a + a++ + a++));


        System.out.println("Question 3");

        int b1=30;
        System.out.println("result="+(--b + b++ + ++b));


        System.out.println("question 4");
        double x=10;
        double y=12.4;
        double z=56.78d;
        double result= Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);


    }
}



