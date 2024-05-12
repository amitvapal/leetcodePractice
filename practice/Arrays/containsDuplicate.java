import java.util.HashSet;
import java.util.Set;

public class Solution {


  // my solution using o(n^2)
  public boolean containsDuplicate(int[] nums) {
    //Edge Case
    if(nums == null || nums.length == 0){
      return null;
    }
    // TODO: Write your code here
    for(int i = 0; i < nums.length; i++){
      int dup = nums[i];
      for(int j = 0; j < nums.length;j++){
        if(dup == nums[j] && i!=j){
          return true;

        }
      }
    }
    return false;
  }
}

// better soloution using hashset which is o(n)


  public boolean containsDuplicate2(int[] nums) {
    Set<Integer> set = new HashSet<>(); // Use HashSet to store unique elements
    for (int x : nums) {
      if (!set.add(x)) // If the set already contains the current element, return true
        return true;
    }
    return false; // Return false if no duplicates found
  }
