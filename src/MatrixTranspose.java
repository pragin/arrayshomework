// 9. Write a 2-D array and WAP to transpose a matrix
public class MatrixTranspose {
    public static void main(String[] args) {
        //Create a 2D array
        int[][] matrix = {
                            {1,2,3,4},
                            {5,6,7,8}
                         };
        System.out.println("Matrix before transpose :  ");
        printArr(matrix);
        System.out.println("Matrix after transpose : ");
        printArr(transpose(matrix));


    }
// Method to print the array
    private static void printArr(int[][] matrix){
        int i = 0;
        while(i < matrix.length){
            int j = 0;
            while (j < matrix[i].length){
                System.out.print(matrix[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
// Method to transpose the matrix
    private static int[][] transpose(int[][] matrix){
        int row = matrix[0].length;
        int column = matrix.length;

        int[][] matrixTranspose = new int[row][column];

        int i = 0;
        while(i < matrix.length){
            int j = 0;
            while (j < matrix[i].length){
                matrixTranspose[j][i] = matrix[i][j];
                j++;
            }
            i++;
        }
        return matrixTranspose;
    }
}
