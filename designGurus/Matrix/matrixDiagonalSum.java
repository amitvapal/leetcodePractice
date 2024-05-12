package designGurus.Matrix;

public class matrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int totalSum = 0;  // Initialize the total sum
        // ToDo: Write Your Code Here.
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    totalSum += mat[i][j];
                }
                if(i+j == mat[i].length-1){
                    totalSum += mat[i][j];
                }
                if((i == mat[i].length / 2) && (j == mat[i].length / 2) && mat[i].length%2 == 1){
                    totalSum -= mat[i][j];
                }

            }
        }
        return totalSum;  // Return the calculated total sum
    }

    public static void main(String[] args) {
        matrixDiagonalSum sol = new matrixDiagonalSum();
        System.out.println(sol.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));  // Output: 25
        System.out.println(sol.diagonalSum(new int[][]{{1,0},{0,1}}));  // Output: 2
        System.out.println(sol.diagonalSum(new int[][]{{5}}));  // Output: 5
    }
}

