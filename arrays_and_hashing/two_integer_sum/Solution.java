import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      numMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (numMap.containsKey(diff) && numMap.get(diff) != i) {
        return new int[] {i, numMap.get(diff)};
      }
    }

    return new int[]{0};
  }

  public static void main(String[] args) {
    int[] nums = {2, 3, 5, 5};
    int target = 10;
    int[] solution = twoSum(nums, target);
    for (int i : solution) {
      System.out.println(i);
    }
  }
}
