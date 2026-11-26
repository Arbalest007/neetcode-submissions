class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> input = new HashSet<>();

        for(int num : nums) {
            input.add(num);
        }

        int max = 0;

        for(int num : input) {
            if(!input.contains(num - 1)) {
                int current = num;
                int count = 1;

                while(input.contains(current + 1)) {
                    count++;
                    current++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
