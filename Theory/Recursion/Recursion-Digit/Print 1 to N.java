public class Main {
    public static void main(String[] args) {
        funtion(1);
    }
    static void funtion(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        funtion(n+1);
    }
}
