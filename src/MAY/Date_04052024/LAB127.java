package MAY.Date_04052024;

public class LAB127 {
    public static void main(String[] args) {
        int[][] array_2d={
                {34,12,11},
                {34,12,34}
        };

        int row=array_2d.length;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < array_2d[i].length ; j++) {
                System.out.println(array_2d[i][j]);

            }

        }

    }
}
