package MAY.Date_04052024;

public class LAB126_2D_Array {
    public static void main(String[] args) {
        int[] array_1d={450,50,321};
        // 2D ->arrays
        // Matrix -> Row and Columns

        //rows are basically Horizontal
        // Columns are basically Vertical


        int[][] array_2d={
                {34,12,11},
                {34,12,34},
                {11,23,98}

        };

        int [][] array_2d_2=new int[3][3];
        //|0,0,0|
        //|0,0,0|
        //|0,0,0|
        array_2d_2[0][0]=34;
        //|0,0,0|
        //|0,0,0|
        //|0,0,0|
        array_2d_2[0][1]=12;
        //3D arrays
        //x,y,z

        for (int i = 0; i < array_2d.length ; i++) {//Rows
            for (int j = 0; j < array_2d[i].length ; j++) {//Columns
                System.out.println(array_2d[i][j]);

            }

        }

    }
}
