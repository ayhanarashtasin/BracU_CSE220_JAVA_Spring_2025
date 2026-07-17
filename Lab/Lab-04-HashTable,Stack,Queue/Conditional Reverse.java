public static Stack conditionalReverse(Stack stack) {
    Stack reversedStack = new Stack();

    while (!stack.isEmpty()) {
        int current = stack.pop();

        if (reversedStack.isEmpty() || current != reversedStack.peek()) {
            reversedStack.push(current);
        }
    }

    return reversedStack;
}
