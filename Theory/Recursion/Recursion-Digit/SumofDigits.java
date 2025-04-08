public class Main {
    public static void main(String[] args) {
        System.out.println(SumofDigits(12345));
    }
    static int SumofDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + SumofDigits(n/10);
    }
}
