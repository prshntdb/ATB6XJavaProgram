package APRIL.Date_27042024;

public class LAB097_ForLoopsAND_IF_ExampleNo2 {
    public static void main(String[] args) {
        System.out.println("Print the value of i, but I want to break when i=5");
        for (int i = 1; i <=10 ; i++) {
            if (i==5){
                break;
            }
            System.out.println("Val of "+i);

        }
        System.out.println("End");
    }
}
