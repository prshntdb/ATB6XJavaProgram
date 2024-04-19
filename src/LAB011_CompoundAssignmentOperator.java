public class LAB011_CompoundAssignmentOperator {
    public static void main(String[] args) {
        int a=10;
        int b=45;
        //+= , -=,*=,/=,%=
        //b=b+30;
        b+=30; //b=b+30;
        System.out.println(b);



        int b1=90;
        b1-=89;
        System.out.println(b1);


        int b2=100;
        b2*=3;
        System.out.println(b2);


        int b3=105;
        b3/=3;
        System.out.println(b3);

        int b4=110;
        b4%=3;
        System.out.println(b4);
    }
}
