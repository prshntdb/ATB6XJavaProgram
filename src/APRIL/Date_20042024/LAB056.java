package APRIL.Date_20042024;

public class LAB056 {
    public static void main(String[] args) {
        String password  = "Prashant@123";
        String pass_u = password.toLowerCase();
        // pass_u == password?
        // pass_u.equals(password) -> No
        // pass_u.equalsIgnoreCase(password) -> Yes
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));


        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("a"));
    }
}
