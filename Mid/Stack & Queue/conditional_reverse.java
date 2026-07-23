public static MidStack conditional_reverse(MidStack stack) {

    MidStack reversedStack = new MidStack();

    if (stack.isEmpty()) {
        return reversedStack;
    }

    Integer previous = (Integer) stack.pop();
    reversedStack.push(previous);

    while (!stack.isEmpty()) {

        Integer current = (Integer) stack.pop();

        if (!current.equals(previous)) {
            reversedStack.push(current);
        }

        previous = current;
    }

    return reversedStack;
}
