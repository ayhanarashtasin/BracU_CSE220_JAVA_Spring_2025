public static Stack Do_Adjacent_Swap(Stack st) {

    Stack temp = new Stack();
    Stack result = new Stack();

    int count = 0;


    while (!st.isEmpty()) {
        temp.push(st.pop());
        count++;
    }

    while (!temp.isEmpty()) {
        st.push(temp.pop());
    }

    Object topElement = null;

    if (count % 2 != 0) {
        topElement = st.pop();
    }

    while (!st.isEmpty()) {

        Object first = st.pop();
        Object second = st.pop();

        temp.push(second);
        temp.push(first);
    }

    while (!temp.isEmpty()) {
        result.push(temp.pop());
    }

    if (topElement != null) {
        result.push(topElement);
    }

    return result;
}
