public class Solution {

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; i++) {
        if (nums[i] + nums[j] == target && i != j) {
          return new int[]{i,j};
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] nums = {5, 5};
    int target = 10;
    int[] solution = twoSum(nums, target);
    for (int i : solution) {
      System.out.println(i);
    }
  }
}
