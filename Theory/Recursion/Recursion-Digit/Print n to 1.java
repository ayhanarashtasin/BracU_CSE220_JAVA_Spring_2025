public class Main {
    public static void main(String[] args) {
        funtion(5);
    }
    static void funtion(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funtion(n-1);
    }
}
