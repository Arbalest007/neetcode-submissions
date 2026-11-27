class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];

            //if Current > 0 then that means the remaining numbers are larger
            if(current > 0) {
                break;
            }

            if(i > 0) {
                if(current == nums[i - 1]) {
                    continue;
                }
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = current + nums[left] + nums[right];

                if(sum < 0) {
                    left++;
                }
                else if(sum > 0) {
                    right--;
                }
                else {
                    result.add(Arrays.asList(current, nums[left], nums[right]));
                    left++;
                    right--;

                    //Skip duplicate left
                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}