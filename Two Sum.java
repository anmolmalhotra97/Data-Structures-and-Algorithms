class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment)!= i)
            {
                return new int[] {i, map.get(compliment)};
            }
            else{
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two Sums solution found");
    }
}