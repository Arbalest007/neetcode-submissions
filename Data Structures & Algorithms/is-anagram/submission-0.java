class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCounts = countCharacters(s);
        HashMap<Character, Integer> tCounts = countCharacters(t);
        
        if(s.length() != t.length()) {
            return false;
        }
        else if(!sCounts.equals(tCounts)) {
            return false;
        }

        return true;
    }

    public HashMap<Character, Integer> countCharacters(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        char[] charArray = input.toCharArray();

        for(int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }
}
