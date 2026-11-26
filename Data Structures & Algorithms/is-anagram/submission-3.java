class Solution {
    public boolean isAnagram(String s, String t) {  
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sCounts = countCharacters(s);
        Map<Character, Integer> tCounts = countCharacters(t);

        return sCounts.equals(tCounts);
    }

    public Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        char[] charArray = input.toCharArray();

        for(int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }
}
