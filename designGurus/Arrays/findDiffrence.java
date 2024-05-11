public class Solution {
    public int[] findDifferenceArray(int[] nums) {
        // Given an input array of integers nums, find an integer array, let's call it differenceArray, of the same length as an input integer array.

        // Each element of differenceArray, i.e., differenceArray[i], should be calculated as follows: 
        // take the sum of all elements to the left of index i in array nums (denoted as leftSum[i]), and 
        // subtract it from the sum of all elements to the right of index i in array nums (denoted as rightSum[i]), 
        // taking the absolute value of the result. Formally:

        // differenceArray[i] = | leftSum[i] - rightSum[i] |

        // If there are no elements to the left/right of i, the corresponding sum should be taken as 0.




        if(nums == null || nums.length==0){
            return null;
        }
        int n = nums.length;
        int[] differenceArray = new int[n];
        // This loop iterates through each element of nums
        for (int indi = 0; indi < n; indi++) {
            int leftSum = 0;
            int rightSum = 0;
            // Calculate leftSum
            for (int j = 0; j < indi; j++) {
                leftSum += nums[j];
            }
            // Calculate rightSum 
            for (int k = indi + 1; k < n; k++) {
                rightSum += nums[k];
            }
            // The difference array stores the absolute difference
            differenceArray[indi] = Math.abs(leftSum - rightSum);
        }
        return differenceArray;
    }
}
