public class LAB007_IFELSE {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int max;
        /*if(a%2==0)
            System.out.println("Value is EVEN");
        else
            System.out.println("Value is odd");*/

       
        if(a>b && a>c)
            max=a;
        else if (b>a && b>c)
            max=b;
        else
            max=c;
        System.out.println("Max value is"+max);{

        }
    }
}
