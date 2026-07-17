public static void dance_pair(Stack stk) {

    Queue maleQueue = new Queue();
    Queue femaleQueue = new Queue();

    int pairNumber = 1;

    // Process all dancers from the stack
    while (!stk.isEmpty()) {

        // Remove the top dancer
        Dancer firstDancer = (Dancer) stk.pop();

        // If this was the final dancer in the stack
        if (stk.isEmpty()) {
            if (firstDancer.getGender() == 'M') {
                maleQueue.enqueue(firstDancer);
            } else {
                femaleQueue.enqueue(firstDancer);
            }
            break;
        }

        // Look at the next dancer without removing
        Dancer secondDancer = (Dancer) stk.peek();

        // Case 1: Genders are different, so pair them immediately
        if (firstDancer.getGender() != secondDancer.getGender()) {

            stk.pop(); // Remove secondDancer from the stack

            System.out.println(
                "#" + pairNumber + ": " +
                firstDancer + " & " + secondDancer
            );

            pairNumber++;
        }

        // Case 2: Both dancers are female
        else if (firstDancer.getGender() == 'F') {

            // Keep the first female for future pairing
            femaleQueue.enqueue(firstDancer);
        }

        // Case 3: Both dancers are male
        else {

            // Try to pair the first male with a spare female
            if (!femaleQueue.isEmpty()) {

                Dancer spareFemale =
                    (Dancer) femaleQueue.dequeue();

                System.out.println(
                    "#" + pairNumber + ": " +
                    firstDancer + " & " + spareFemale
                );

                pairNumber++;
            } else {

                // No spare female, so keep the male for later
                maleQueue.enqueue(firstDancer);
            }
        }
    }

    // Pair spare males and females after the stack is processed
    while (!maleQueue.isEmpty() && !femaleQueue.isEmpty()) {

        Dancer spareMale = (Dancer) maleQueue.dequeue();
        Dancer spareFemale = (Dancer) femaleQueue.dequeue();

        System.out.println(
            "#" + pairNumber + ": " +
            spareMale + " & " + spareFemale
        );

        pairNumber++;
    }

    // Print remaining unpaired males
    if (!maleQueue.isEmpty()) {
        System.out.println("Unpaired Male:");

        while (!maleQueue.isEmpty()) {
            System.out.println((Dancer) maleQueue.dequeue());
        }
    }

    // Print remaining unpaired females
    if (!femaleQueue.isEmpty()) {
        System.out.println("Unpaired Female:");

        while (!femaleQueue.isEmpty()) {
            System.out.println((Dancer) femaleQueue.dequeue());
        }
    }
}
