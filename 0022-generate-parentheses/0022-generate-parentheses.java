import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateHelper("", 0, 0, n, result);
        return result;
    }

    private void generateHelper(String current, int openCount, int closeCount, int n, List<String> result) {
        // Base case: if we have used all parentheses
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add an open parenthesis if there are remaining open parentheses
        if (openCount < n) {
            generateHelper(current + '(', openCount + 1, closeCount, n, result);
        }

        // Add a close parenthesis if there are more open than close parentheses
        if (closeCount < openCount) {
            generateHelper(current + ')', openCount, closeCount + 1, n, result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        List<String> result = solution.generateParenthesis(n);

        // Print the result
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}
