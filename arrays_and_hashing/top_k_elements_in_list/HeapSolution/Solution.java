import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

  public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
      count.put(num, count.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      heap.offer(new int[] { entry.getValue(), entry.getKey() });
      if (heap.size() > k) {
        heap.poll();
      }
    }

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = heap.poll()[1];
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 3, 3, 3 };
    int k = 2;
    int[] res = topKFrequent(nums, k);

    System.out.print("[");
    for (int i : res) {
      System.out.print(i + ',');
    }
    System.out.print("]");
  }
}
