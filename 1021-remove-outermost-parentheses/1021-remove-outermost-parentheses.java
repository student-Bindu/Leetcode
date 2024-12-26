class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Use charAt to access characters
            if (ch == ')') count--;
            if (count != 0) ans.append(ch); // Use append instead of push_back
            if (ch == '(') count++;
        }
        return ans.toString(); // Convert StringBuilder to String
    }
}
