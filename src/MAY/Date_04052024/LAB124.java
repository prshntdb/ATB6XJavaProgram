package MAY.Date_04052024;

public class LAB124 {
    public static void main(String[] args) {
        //Arrays
        //Collection of similar Data Type.

        int [] salaries ={30,50,60,90,100,999,-1,-2};
        //How do we find the Max Sal in the array

        //Loop-> Logic->max =0, for i=0 to length
        // salaries[i]>max->max... 0 to l - max

        int max_salary=Integer.MIN_VALUE;
//        System.out.println(max_salary);
//        System.out.println(Integer.MAX_VALUE);
        for (int i = 0; i <salaries.length ; i++) {
            if (salaries[i]>max_salary){
                max_salary=salaries[i];
            }

            int j=0;
            while (j<salaries.length){
                if (salaries[i]>max_salary){
                    max_salary=salaries[j];
                }
                j++;
            }
            System.out.println("Max Sal -->" +max_salary);

        }
    }
}
