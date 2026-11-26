class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] currentWord = strs[i].toCharArray();
            Arrays.sort(currentWord);

            String key = new String(currentWord);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(groups.values());
    }
}
