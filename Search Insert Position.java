class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1])
            return nums.length;
        int mid=0, low=0, high=nums.length - 1;
        while(low<=high)
        {
            mid = (low + high)/2;
            if(target > nums[mid])
            {
                low = mid + 1;
            }
            else if(target < nums[mid])
            {
                high = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return low;
    }
}