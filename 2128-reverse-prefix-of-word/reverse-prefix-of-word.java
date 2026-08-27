class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < sb.length(); i++) {
            StringBuilder sb2 = new StringBuilder(sb.substring(0, i + 1));
            if (sb.charAt(i) == ch) {
                return sb2.reverse().toString()+ sb.substring(i + 1);
            }
        }
        return word;
    }
}