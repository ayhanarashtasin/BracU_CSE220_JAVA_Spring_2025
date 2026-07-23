public Stack segregate(Stack original) {

    Stack oddStack = new Stack();
    Stack evenStack = new Stack();
    Stack result = new Stack();

    while (!original.isEmpty()) {

        Integer value = (Integer) original.pop();

        if (value % 2 != 0) {
            oddStack.push(value);
        } 
        else {
            evenStack.push(value);
        }
    }

    while (!evenStack.isEmpty()) {

        Integer value = (Integer) evenStack.pop();
        result.push(value);
    }

    while (!oddStack.isEmpty()) {

        Integer value = (Integer) oddStack.pop();
        result.push(value);
    }

    return result;
}
