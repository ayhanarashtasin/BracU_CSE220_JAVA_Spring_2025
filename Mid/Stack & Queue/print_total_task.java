public static void print_total_task(int[][] tasks) {

    if (tasks == null || tasks.length == 0) {
        return;
    }

    Stack startStack = new Stack();
    Stack endStack = new Stack();

    int currentStart = tasks[0][0];
    int currentEnd = tasks[0][1];

    for (int i = 1; i < tasks.length; i++) {

        int nextStart = tasks[i][0];
        int nextEnd = tasks[i][1];


        if (nextStart < currentEnd) {

            if (nextEnd > currentEnd) {
                currentEnd = nextEnd;
            }
        }


        else {

            startStack.push(currentStart);
            endStack.push(currentEnd);

            currentStart = nextStart;
            currentEnd = nextEnd;
        }
    }

    startStack.push(currentStart);
    endStack.push(currentEnd);

    while (!startStack.isEmpty()) {

        int start = (Integer) startStack.pop();
        int end = (Integer) endStack.pop();

        System.out.println(start + ", " + end);
    }
}
