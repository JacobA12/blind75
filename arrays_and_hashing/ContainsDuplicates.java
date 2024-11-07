import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
  public static boolean hasDuplicates(int[] nums){
      Set<Integer> numsMap = new HashSet<>();
      for (int i : nums) {
        if (!numsMap.add(i)) {
          return true;
        }
      }
      return false;
    }
  
    public static void main(String[] args) {
      int[] nums = {1,2,3,3}; //expected true
      int[] nums2 = {1,2,3,4}; //expected false
      int[] nums3 = {3, 1, 2, 3}; //expected true
  
      System.out.println("Expected true: " + hasDuplicates(nums));
      System.out.println("Expected false: " + hasDuplicates(nums2));
      System.out.println("Expected true: " + hasDuplicates(nums3));

  }
  
}