package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBraces {
    public static boolean isValid(String str) {
        Map<Character, Character> parenthesesMapping = new HashMap<>();
        parenthesesMapping.put('(', ')');
        parenthesesMapping.put('{', '}');
        parenthesesMapping.put('[', ']');

        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (parenthesesMapping.containsKey(c)) {
                parentheses.push(c);
            } else if (parentheses.isEmpty() || parenthesesMapping.get(parentheses.pop()) != c) {
                return false;
            }
        }
        return parentheses.isEmpty();
    }
}