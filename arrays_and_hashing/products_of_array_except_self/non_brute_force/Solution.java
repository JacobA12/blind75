package non_brute_force;

public class Solution {
  public int[] productExceptSelf(int[] nums) {
    int currIndex = 0;
    int[] sol = new int[nums.length];
    int[] prefix = new int[nums.length - 1];
    int[] suffix = new int[nums.length - 1];
    for (int i = 0; i < nums.length; i++) {
      if (i != currIndex) {
        prefix[i] = nums[i];
      }
    }
  }
}
