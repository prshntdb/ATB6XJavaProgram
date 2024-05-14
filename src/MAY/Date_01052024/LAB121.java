package MAY.Date_01052024;

import java.util.Scanner;

public class LAB121 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the first subject 1 mark ");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the first subject 2 mark ");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the first subject 3 mark ");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the first subject 4 mark ");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the first subject 5 mark ");
        marks[4]=sc.nextFloat();

        for (int i = 0; i < marks.length ; i++) {
            if(marks[i]<30){
                System.out.println("Failed in this subject "+marks[i]);
            }
            System.out.println(marks[i]);

        }
        int j =0;
        while (j< marks.length){
            System.out.println(marks[j]);
            j++;
        }
        sc.close();
    }
}
