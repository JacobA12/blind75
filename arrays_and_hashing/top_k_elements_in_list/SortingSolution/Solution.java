package SortingSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public static int[] topKFrequent(int[] nums, int k){
    Map<Integer, Integer> count = new HashMap<>();
    for(int num : nums){
      count.put(num, count.getOrDefault(num, 0) + 1);
    }

    List<int[]> arr = new ArrayList<>();
    for(Map.Entry<Integer, Integer> entry : count.entrySet()){
      arr.add(new int[] {entry.getValue(), entry.getKey()});
    }
    arr.sort((a, b) -> b[0] - a[0]);

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = arr.get(i)[1];
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = {7, 7};
    int k = 1;

    int[] res = topKFrequent(nums, k);

    System.out.print("[");
    for (int i : res) {
      System.out.print(i + ",");
    }
    System.out.print("]");
  }
}
