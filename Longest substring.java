class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String current = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;
                maxLength = Math.max(maxLength, current.length());
            }
        }

        return maxLength;
    }
}
