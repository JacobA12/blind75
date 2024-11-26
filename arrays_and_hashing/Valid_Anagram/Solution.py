class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_sorted = ''.join(sorted(s))
        t_sorted = ''.join(sorted(t))
        
        if s_sorted == t_sorted:
          return True
        else:
          return False
        
s = "racecar"
t = "carrace"

s2 = 'jar'
t2 = 'jam'


print(Solution().isAnagram(s,t))
print(Solution().isAnagram(s2,t2))
