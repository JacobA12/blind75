import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> sol = new HashMap<>();
    for(String s : strs){
      char[] c = s.toCharArray();
      Arrays.sort(c);

      String sortedString = new String(c);
      sol.putIfAbsent(sortedString, new ArrayList<>());
      sol.get(sortedString).add(s);
    }
    return new ArrayList<>(sol.values());
    
  }

  public static void main(String[] args) {
    String[] strs = {"act","pots","tops","cat","stop","hat"};

    System.out.println(groupAnagrams(strs).toString());
  }
}
