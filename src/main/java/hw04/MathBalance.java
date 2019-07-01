package hw04;

import hw01.LinkedListPrototypeOnNodes;

public class MathBalance {

    public boolean isBalanced(String string) {
        LinkedListPrototypeOnNodes<Character> stack = new LinkedListPrototypeOnNodes<>();

        if (string == null) {
           return false;
        }
        int iteration = 0;
        while (iteration < string.length()) {

            char charAt = string.charAt(iteration);

            if (charAt == '(' || charAt == '{' || charAt == '[') {
                stack.addFirst(charAt);
                iteration++;
            } else if ((stack.head() != null) &&
                    ((charAt == ']' && stack.head() == '[') ||
                    (charAt == '}' && stack.head() == '{') ||
                    (charAt == ')' && stack.head() == '('))) {
                    stack.removeFirst();
                    iteration++;
            } else if (charAt == ')' || charAt == ']' || charAt == '}') {
                return false;
            } else {
                iteration++;
            }
        }
        return stack.size() == 0;
    }
}
