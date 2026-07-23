static Stack mergeStacks(Stack stack1, Stack stack2) {

    Stack temp = new Stack();
    Stack result = new Stack();

    while (!stack1.isEmpty() && !stack2.isEmpty()) {

        Integer value1 = (Integer) stack1.peek();
        Integer value2 = (Integer) stack2.peek();

        if (value1 <= value2) {
            temp.push(stack1.pop());
        }
        else {
            temp.push(stack2.pop());
        }
    }

    while (!stack1.isEmpty()) {
        temp.push(stack1.pop());
    }

    while (!stack2.isEmpty()) {
        temp.push(stack2.pop());
    }

    while (!temp.isEmpty()) {
        result.push(temp.pop());
    }

    return result;
}
