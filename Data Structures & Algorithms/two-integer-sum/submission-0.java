class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int[] result = new int[]{0, 0};

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(numToIndex.containsKey(difference)) {
                result[0] = Math.min(i, numToIndex.get(difference));
                result[1] = Math.max(i, numToIndex.get(difference));
                return result;
            }

            numToIndex.put(nums[i], i);
        }

        return result;
    }
}
