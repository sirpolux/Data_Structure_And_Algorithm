## 41. First Missing Positive

Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

### Example 1:

#### Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

### Example 2:

#### Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

#### Constraints:

1 <= nums.length <= 10<sup>5</sup>

-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1