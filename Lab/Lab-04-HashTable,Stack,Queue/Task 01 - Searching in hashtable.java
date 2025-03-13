//Part-a
private static int hashFunction(String key){
    if(key.length()%2==1){
      key+='N';
    }
    int sum=0;
    for(int i=0;i<key.length();i+=2){
      String FristCharacter = Integer.toString((int) key.charAt(i));
      String SecondCharacter = Integer.toString((int) key.charAt(i+1));
      int temp_sum = Integer.parseInt(FristCharacter+SecondCharacter);
      sum+=temp_sum;
    }
    return sum%key.length();
//Part-b
public String searchHashtable( Object[] keyValuePair ){
    String key = (String) keyValuePair[0];
    int index = hashFunction(key);
    if (index >= 0 && index < ht.length && ht[index] != null) {
        PairNode temp = ht[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return "Found";
            }
            temp = temp.next;
        }
    }
    return "Not Found";
}
