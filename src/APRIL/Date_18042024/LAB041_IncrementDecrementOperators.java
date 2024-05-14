package APRIL.Date_18042024;

public class LAB041_IncrementDecrementOperators {
    public static void main(String[] args) {
        //Increment(++),Decrement(--)
        // pre increment and Post decrement

        // pre --> value is incremented first and then the result is computed.
        System.out.println("Pre Increment Example");
        int a=10;
        int b=++a;
        System.out.println(b);


        // Post --> value is first used for computing the result and then incremented or decremented.
        System.out.println("Post decremented");
        int a1=10;
        int b1=a1++;
        System.out.println(b1);

    }
}
