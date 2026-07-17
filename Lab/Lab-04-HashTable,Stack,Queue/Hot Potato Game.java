public static String hotPotato(String[] players, int k) {
    LinkedListQueue queue = new LinkedListQueue();


    for (int i = 0; i < players.length; i++) {
        queue.enqueue(players[i]);
    }

    int remainingPlayers = players.length;


    while (remainingPlayers > 1) {


        for (int i = 0; i < k; i++) {
            String currentPlayer = (String) queue.dequeue();
            queue.enqueue(currentPlayer);
        }


        String eliminatedPlayer = (String) queue.dequeue();
        System.out.println(eliminatedPlayer + " eliminated");

        remainingPlayers--;
    }


    String winner = (String) queue.dequeue();
    System.out.println("Winner: " + winner);

    return winner;
}
