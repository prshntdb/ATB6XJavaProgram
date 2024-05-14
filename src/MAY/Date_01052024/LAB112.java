package MAY.Date_01052024;

public class LAB112 {
    public static void main(String[] args) {
        int[] ages = {27, 31, 32, 33, 34};
        //Fixed Elements

        int[] ages2 = new int[5];
        //case 2 -Here by default value of all the elements will be ?
        System.out.println(ages2[0]);
        System.out.println(ages2[4]);
//        System.out.println(ages2[0]);
//        System.out.println(ages2[0]);
        ages2[0] = 11;
        System.out.println(ages2[0]);



        String[] breakfast_item ={"Milk","idli","fruits","coffee","tea","poha"};
        System.out.println(breakfast_item.length);
    }
}

