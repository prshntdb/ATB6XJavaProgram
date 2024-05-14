package APRIL.Date_27042024;

public class LAB101_ForLoop_EVEN_ODD_Continue_Statement {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                System.out.println("Even Number"+i);
                continue;
            }
            System.out.println("Odd Number"+i);

        }
    }
}
