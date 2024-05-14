package APRIL.Date_18042024;

public class LAB033_LogicalOperator {
    public static void main(String[] args) {
        // Logical Operator
        // Not Gate, OR Gate,AND GATE
        boolean a= true;
        System.out.println("NOT GATE");
        System.out.println(!a);
        System.out.println(!(30>90));
        System.out.println(!!(30>90));
        System.out.println(!!!(30>90));
        //OR GATE
        System.out.println("OR GATE");


        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // AND GATE
        System.out.println("AND GATE");

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
