class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        sol = []
        nums.sort()

        for i in range(len(nums)):
            # Skip duplicate i values
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            j = i + 1
            k = len(nums) - 1
            
            target = -1 * nums[i]
            while j < k:
                
                curr = nums[k] + nums[j]

                if curr < target:
                    j += 1
                if curr > target:
                    k -= 1
                if curr == target:
                    sol.append([nums[i], nums[j], nums[k]])
                    # Skip duplicate j values:
                    while j < k and nums[j] == nums[j + 1]:
                        j += 1
                    # Skip duplicate k values:
                    while j < k and nums[k] == nums[k - 1]:
                        k -= 1
                    j += 1
                    k -= 1
        return sol
                