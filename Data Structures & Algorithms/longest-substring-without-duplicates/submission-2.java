class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] input = s.toCharArray();

        List<String> substrings = new ArrayList<>();
        substrings.add(new String());

        int left = 0;
        int right = 0;  
        int max = 0;

        while (right < input.length) {   
            String currentSubstring = substrings.get(left);
            char currentChar = input[right];

            if (currentSubstring.contains(Character.toString(currentChar))) {
                left++;
                int dupIndex = currentSubstring.indexOf(currentChar);
                String newString = currentSubstring.substring(dupIndex + 1) + currentChar;
                substrings.add(newString);
            }
            else {
                substrings.set(left, (currentSubstring + Character.toString(currentChar)));
            }

            max = Math.max(substrings.get(left).length(), max);
            right++;
        }

        return max;
    }
}
