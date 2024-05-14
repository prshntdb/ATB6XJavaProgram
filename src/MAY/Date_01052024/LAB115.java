package MAY.Date_01052024;

public class LAB115 {
    public static void main(String[] args) {
        //==
        //.equals()-> Values/Content

        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4,5};
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int[]arr3=arr1;
        System.out.println(arr1==arr3);
        System.out.println(arr1.equals(arr2));
        String s1="Prashant";
        String s2="Dubey";
        System.out.println(s1.equals((s2)));
    }
}
