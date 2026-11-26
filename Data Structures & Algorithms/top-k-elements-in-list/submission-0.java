class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new TreeMap<>();

        for(int num : nums) {
          freqMap.merge(num, 1, Integer::sum);
        }

        List<Integer>[] freqCount = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> e: freqMap.entrySet()) {
            int freq = e.getValue();

            if(freqCount[freq] == null) {
                freqCount[freq] = new ArrayList<>();
            }

            freqCount[freq].add(e.getKey());
        }

        int topK = 0;
        int[] result = new int[k];

        for(int i = freqCount.length - 1; i > 0 && topK < k; i--) {
            List<Integer> currentNumbers = freqCount[i];

            if(currentNumbers == null) {
                continue;
            }

            for(int num : currentNumbers) {
                result[topK++] = num;
                if(topK == k) return result;
            }
        }

        return result;
    }
}
