public class Main {
    public static void main(String[] args) {
        System.out.println(skip("baccdah","",0));
    }
    static String skip(String s , String ans,int index){
        if(index==s.length()){
            return ans;
        }
        if(s.charAt(index)=='a'){
            return skip(s,ans,index+1);
        }
        return skip(s,ans+s.charAt(index),index+1);
    }
}
