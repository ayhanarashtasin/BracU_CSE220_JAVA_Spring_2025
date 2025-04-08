public class Main {
    public static void main(String[] args) {
        System.out.println(productofDigits(12345));
    }
    static int productofDigits(int n){
        if(n==1){
            return 1;
        }
        return (n%10) * productofDigits(n/10);
    }
}
