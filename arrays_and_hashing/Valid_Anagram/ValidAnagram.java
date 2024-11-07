package Valid_Anagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> charMap = new HashMap<>();
    for (char i : s.toCharArray()) {
      charMap.putIfAbsent(i, 1);
      charMap.put(i, charMap.get(i) + 1);
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
}
