package brute_force;

class Solution {

  public static int longestConsecutive(int[] nums) {
      int currStreak = 1;
      int longestStreak = 1;
      int offSet = 1;
  
      for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
          if (nums[i] + offSet == nums[j]) {
            currStreak++;
            offSet++;
          }
        }
        longestStreak = Math.max(currStreak, longestStreak);
        currStreak = 0;
        offSet = 1;
      }
      return longestStreak;
    }
  
    public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4, 4, 4, 20};
      System.out.println(longestConsecutive(nums));
  }
}
