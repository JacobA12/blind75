package non_brute_force;

public class Solution {
  public static int[] productExceptSelf(int[] nums) {
      int numLength = nums.length;
       int[] res = new int[numLength];
       int[] pref = new int[numLength];
       int[] suff = new int[numLength];
  
       pref[0] = 1;
       suff[numLength - 1] = 1;
  
       for (int i = 1; i < numLength; i++) {
        pref[i] = nums[i - 1] * pref[i - 1];
       }
       for (int i = numLength - 2; i >= 0; i--) {
          suff[i] = nums[i + 1] * suff[i + 1];
       }
       for (int i = 0; i < numLength; i++) {
        res[i] = pref[i] * suff[i];
       }
  
       return res;
    }
  
  
    public static void main(String[] args) {
      int[] nums = {1, 2, 4, 6};
      int[] res = productExceptSelf(nums);
    
      for (int i : res) {
        System.out.println(i);
      }
  }
}
