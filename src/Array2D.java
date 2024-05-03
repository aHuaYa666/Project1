public class Array2D {
    public static void main(String[] args) {
        int[][] array1 = {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++){
                sum += array1[i][j];

            }

        }
        System.out.println(sum);
    }
}
