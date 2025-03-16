public static int diamondCount(Stack<Character> stack, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '<') {
                stack.push('>');
            } else if (ch == '>') {
                if (!stack.isEmpty() && stack.peek() == '>') {
                    count++;
                    stack.pop();
                }
            }
        }

        return count;
