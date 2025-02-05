class Solution:
    def isPalindrome(self, s: str) -> bool:
      #removes all non-alphanumeric characters from the string
      filtered_s = ''.join(filter(str.isalnum, s)).lower()
      
      #reverses the string, taking advantage of Python's slicing
      rev_s = filtered_s[::-1]
      
      if filtered_s == rev_s:
        return True
      
      return False
      