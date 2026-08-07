public static void task1B_recursive(int i) {
        if (i > 10) {
            return; 
        }
        System.out.println(i);
        task1B_recursive(i + 1);
}
