from typing import List

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        num_set = set()
        for num in nums:
          if num in num_set:
            return True
          else:
            num_set.add(num)
        return False
          
    
        
my_list = [1, 2, 3, 4, 4]
print(Solution().hasDuplicate(my_list))        

