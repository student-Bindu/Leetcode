
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for(int i = 0;i <s.length();i++){
            lastIndex[s.charAt(i) - 'a'] = i; // track the last index of character
        }
        boolean[] seen = new boolean[26]; //keep track seen
        Stack<Integer> st = new Stack();

        for (int i=0;i<s.length();i++){
            int curr = s.charAt(i) - 'a';
            if(seen[curr]) continue; // if character is seen then cont. we need only one
            while(!st.isEmpty() && st.peek() > curr && i<lastIndex[st.peek()]){
            seen[st.pop()] = false;  // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();
        }
}