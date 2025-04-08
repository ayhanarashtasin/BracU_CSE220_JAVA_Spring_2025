public class Main {
    public static void main(String[] args) {
        System.out.println(CountZeros(1000200000,0));
    }
    static int CountZeros(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return CountZeros(n/10,count+1);
        }
        return CountZeros(n/10,count);
    }
}
