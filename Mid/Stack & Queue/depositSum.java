public static Stack depositSum(Stack st, int window) {

    Stack temp = new Stack();

    if (window <= 0) {
        return st;
    }

    while (!st.isEmpty()) {

        int sum = 0;
        int count = 0;

        while (count < window && !st.isEmpty()) {

            Integer value = (Integer) st.pop();

            if (value > 0) {
                sum = sum + value;
            }

            count++;
        }

        temp.push(sum);
    }

    while (!temp.isEmpty()) {

        Integer value = (Integer) temp.pop();
        st.push(value);
    }

    return st;
}
