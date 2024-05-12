package designGurus.Matrix;

import java.util.Arrays;

public class richiestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Initialize maxWealth to 0
        // ToDo: Write Your Code Here.
        int max = Arrays.stream(accounts[0]).sum();
        for(int i = 1; i < accounts.length; i++){
            if(Arrays.stream(accounts[i]).sum() > max){
                max = Arrays.stream(accounts[i]).sum();
            }

            
            
        }
        maxWealth = max;

        return maxWealth;
    }

    public static void main(String[] args) {
        richiestCustomerWealth sol = new richiestCustomerWealth();
        // Example test cases
        System.out.println(sol.maximumWealth(new int[][]{{5,2,3},{0,6,7}}));  // 13
        System.out.println(sol.maximumWealth(new int[][]{{1,2},{3,4},{5,6}}));  // 11
        System.out.println(sol.maximumWealth(new int[][]{{10,100},{200,20},{30,300}}));  // 330
    }
}

