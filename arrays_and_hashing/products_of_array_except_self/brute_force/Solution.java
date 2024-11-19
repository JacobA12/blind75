package brute_force;

public class Solution {

  public static int[] productExceptSelf(int[] nums) {
    int[] sol = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      sol[i] = 1;
      for (int j = 0; j < nums.length; j++) {
        if (j != i) {
          sol[i] *= nums[j];
        }
      }
    }

    return sol;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,4,6};
    int[] sol = productExceptSelf(nums);

    for (int i : sol) {
      System.out.print(i + ",");
    }
  }
}