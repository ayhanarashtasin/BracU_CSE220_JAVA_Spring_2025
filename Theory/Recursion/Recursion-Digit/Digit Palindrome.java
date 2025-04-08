public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome(123211));
    }
    static int reverseofDigits(int n){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        int digits = (int)Math.log10(n);
        return rem*(int)Math.pow(10,digits)+reverseofDigits(n/10);
    }
    static boolean palindrome(int n){
        if(n==reverseofDigits(n)){
            return true;
        }
        else{
            return false;
        }
    }
}
