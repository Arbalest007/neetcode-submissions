class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            int j = str.indexOf("#", i);
            int charCount = Integer.parseInt(str.substring(i, j));
            decodedStrings.add(str.substring(j + 1, j + charCount + 1));

            i = j + charCount + 1;
        }

        return decodedStrings;
    }
}
