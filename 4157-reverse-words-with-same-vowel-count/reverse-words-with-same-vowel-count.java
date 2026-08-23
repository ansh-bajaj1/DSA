class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int a = 0;

        for (int j = 0; j < arr[0].length(); j++) {
            if ("aeiou".indexOf(arr[0].charAt(j)) != -1)
                a++;
        }
        for (int i = 1; i < arr.length; i++) {
            int c = 0;
            StringBuilder sb = new StringBuilder(arr[i]);
            for (int j = 0; j < arr[i].length(); j++) {
                if ("aeiou".indexOf(arr[i].charAt(j)) != -1)
                    c++;
            }

            if (c == a) {
                arr[i] = sb.reverse().toString();
            }
        }

        return String.join(" ", arr);
    }
}