class Solution {

    // Given a one-dimensional array of integers, create a new array that represents the running sum of the original array.
    // The running sum at position i in the new array is calculated as the sum of all the numbers in the original array from the 0th index up to the i-th index (inclusive). 
    // Formally, the resulting array should be computed as follows: result[i] = sum(nums[0] + nums[1] + ... + nums[i]) 
    // for each i from 0 to the length of the array minus one.

    public int[] runningSum(int[] nums) {
        // Edge or base case
        if(nums.length == 0 || nums==null){
            return nums[0];
            
        }
        int[] result = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < result.length; i++){
            sum += nums[i];
            result[i] = sum;


        }
        return result;
    }
}
