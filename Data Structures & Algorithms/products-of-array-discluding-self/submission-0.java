class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] totalsLeft = new int[nums.length];
        int[] totalsRight = new int[nums.length];

        int currentTotalLeft = 1;
        int currentTotalRight = 1;

        for(int i = 0; i < nums.length; i++) {
            totalsLeft[i] = currentTotalLeft;
            currentTotalLeft *= nums[i];
        }

        for(int j = nums.length - 1; j >= 0; j--) {
            totalsRight[j] = currentTotalRight;
            currentTotalRight *= nums[j];
        }

        int[] result = new int[nums.length];
        for(int k = 0; k < nums.length; k++) {
            result[k] = totalsLeft[k] * totalsRight[k];
        }

        return result;
    }
}  
