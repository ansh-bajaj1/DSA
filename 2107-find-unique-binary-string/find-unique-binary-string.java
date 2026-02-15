class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>(Arrays.asList(nums));

        return recurse(set, new StringBuilder(), nums.length);
    }

    private String recurse(Set<String> set, StringBuilder sb, int n) {

        if (sb.length() == n) {
            String s = sb.toString();
            if (!set.contains(s)) return s;
            return null;
        }

        for (char c : new char[]{'0', '1'}) {
            sb.append(c);
            String res = recurse(set, sb, n);
            if (res != null) return res;
            sb.deleteCharAt(sb.length() - 1);
        }

        return null;
    }
}
