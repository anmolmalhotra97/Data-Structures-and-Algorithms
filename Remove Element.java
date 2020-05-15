class Solution {
    public int removeElement(int[] nums, int val) {
        int head = 0, tail = nums.length;
        while(head < tail)
        {
            if(nums[head] == val)
            {
                nums[head] = nums[tail-1];
                tail--;
            }
            else
            {
                head++;
            }
        }
        return tail;
    }
}