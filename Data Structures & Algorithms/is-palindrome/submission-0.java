class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        char[] cleaned = sb.toString().toLowerCase().toCharArray();

        int i = 0;
        int j = cleaned.length - 1;

        while(i < j) {
            if(cleaned[i] != cleaned[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
