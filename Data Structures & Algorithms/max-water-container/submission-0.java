class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int max = 0;

        while(left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];

            int maxHeight = (right - left) * Math.min(leftHeight, rightHeight);
            
            if(maxHeight > max) {
                max = maxHeight;
            }

            if(leftHeight < rightHeight) {
                left++;
            }
            else {
                right--;
            }
        }

        return max;
    }
}
