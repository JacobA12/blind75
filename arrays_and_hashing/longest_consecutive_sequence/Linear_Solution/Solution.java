package brute_force;

import java.util.Arrays;

class Solution {

  public static int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    Arrays.sort(nums);

    int longestStreak = 1;
    int currentStreak = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        if (nums[i] == nums[i - 1] + 1) {
          currentStreak++;
        } else {
          longestStreak = Math.max(longestStreak, currentStreak);
          currentStreak = 1;
        }
      }
    }

    return Math.max(longestStreak, currentStreak);
  }

  public static void main(String[] args) {
    int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
    System.out.println(longestConsecutive(nums));
  }
}
