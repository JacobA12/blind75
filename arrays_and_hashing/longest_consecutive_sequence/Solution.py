from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
          return 0
        
        
        longest_streak = 0
        
        for i in range(len(nums)):
          curr_num = nums[i]
          
          curr_streak = 1
          
          while curr_num + 1 in nums:
            curr_num += 1
            curr_streak += 1
          
          longest_streak = max(longest_streak, curr_streak)
          
        return longest_streak

def main():
    test_cases = [
        ([100, 4, 200, 1, 3, 2], 4),
        ([0, 3, 7, 2, 5, 8, 4, 6, 0, 1], 9),
        ([], 0),
        ([1, 2, 0, 1], 3)
    ]
    
    for nums, expected in test_cases:
        solution = Solution()
        result = solution.longestConsecutive(nums)
        print(f"longestConsecutive({nums}) = {result}, expected = {expected}")
        assert result == expected, f"Test failed for input {nums}"

if __name__ == "__main__":
    main()