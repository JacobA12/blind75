package Valid_Anagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> charMap = new HashMap<>();
    for (char i : s.toCharArray()) {
      charMap.put(i, charMap.getOrDefault(i, 0) + 1);
    }

    for (char i : t.toCharArray()) {
      if (!charMap.containsKey(i)) {
        return false;
      }
      if (charMap.get(i) == 1) {
        charMap.remove(i);
      } else {
        charMap.put(i, charMap.get(i) - 1);
      }
    }

    return true;
  }

  public static void main(String[] args) {
    // Test cases
    String[][] testCases = {
      { "anagram", "nagaram" },
      { "rat", "car" },
      { "listen", "silent" },
      { "aacc", "ccac" },
    };

    for (String[] testCase : testCases) {
      String s = testCase[0];
      String t = testCase[1];
      boolean expected = s.length() == t.length(); // A necessary condition for anagrams

      boolean result = isAnagram(s, t);
      System.out.println(
        "s: " +
        s +
        ", t: " +
        t +
        ", Expected: " +
        expected +
        ", Result: " +
        result
      );

      if (result != expected) {
        System.out.println("Test failed!");
      }
    }
  }
}
