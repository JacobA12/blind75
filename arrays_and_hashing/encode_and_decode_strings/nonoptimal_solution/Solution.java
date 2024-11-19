import java.util.ArrayList;
import java.util.List;

class Solution {

  public String encode(List<String> strs) {
      String delimmiter = "#";
      String encodedString = "";
      for(String currWord : strs){
          String length = Integer.toString(currWord.length());
          encodedString += length + delimmiter + currWord; 
      }

      return encodedString;
  }

  public List<String> decode(String str) {
      List<String> strs = new ArrayList<>();
      String delimmiter = "#";
      while(str != ""){
          int poundIndex = str.indexOf(delimmiter);
          int length = Integer.parseInt(str.substring(0, poundIndex));
          String currString = str.substring(poundIndex + 1, poundIndex + 2 + length);
          strs.add(currString);
          str = str.substring(poundIndex + 1 + length);
      }

      return strs;
  }
}
