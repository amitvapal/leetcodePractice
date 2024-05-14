package designGurus.Matrix;

public class rowWithMaxOnes {
    public int[] findMaxOnesRow(int[][] mat) {
        int maxOnesIdx = 0;
        int maxOnesCount = 0;
        // ToDo: Write Your Code Here.
        for(int i =0; i < mat.length;i++){
            int counter = 0;
            for(int j =0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    counter++;
                }

            }
            if(counter > maxOnesCount){
                maxOnesCount=counter;
                maxOnesIdx = i;
            }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }

    // Main method for testing
    public static void main(String[] args) {
        rowWithMaxOnes sol = new rowWithMaxOnes();
        // Applying example inputs
        int[] result1 = sol.findMaxOnesRow(new int[][]{{1, 0}, {1, 1}, {0, 1}});
        System.out.println(result1[0] + ", " + result1[1]);  // Output: 1, 2
        
        int[] result2 = sol.findMaxOnesRow(new int[][]{{0, 1, 1}, {0, 1, 1}, {1, 1, 1}});
        System.out.println(result2[0] + ", " + result2[1]);  // Output: 2, 3
        
        int[] result3 = sol.findMaxOnesRow(new int[][]{{1, 0, 1}, {0, 0, 1}, {1, 1, 0}});
        System.out.println(result3[0] + ", " + result3[1]);  // Output: 0, 2
    }

}

