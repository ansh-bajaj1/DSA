class Solution {
    public int numberOfSpecialChars(String word) {

        Map<Character, Integer> lower = new HashMap<>();
        Map<Character, Integer> upper = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower.put(ch, i); 
            } else {
                upper.putIfAbsent(ch, i); 
            }
        }
        int c = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {

            char cc = Character.toUpperCase(ch);
            if (lower.containsKey(ch) &&
                upper.containsKey(cc) &&
                lower.get(ch) < upper.get(cc)) {
                c++;
            }
        }

        return c;
    }
}