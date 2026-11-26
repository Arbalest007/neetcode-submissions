class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(numToIndex.containsKey(difference)) {
                return new int[]{numToIndex.get(difference), i};
            }

            numToIndex.put(nums[i], i);
        }

        return new int[0];
    }
}
