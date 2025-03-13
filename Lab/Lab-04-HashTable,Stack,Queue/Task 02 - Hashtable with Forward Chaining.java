private static int hashFunction(String key){
    int sum=0;
    if(key.length()%2!=0){
      for(int i=1;i<key.length();i+=2){
        int FristCharacter = ((int) key.charAt(i));
        sum+=FristCharacter;
      }
    }
    else{
      for(int i=0;i<key.length();i+=2){
        int FristCharacter = ((int) key.charAt(i));
        sum+=FristCharacter;
      }
    }
    return sum%key.length();
  }

public void insert(String key, Integer value){
  int index = hash_function(key);
    Node newNode = new Node(key, value);
    if (table[index] == null) {
        table[index] = newNode;
    } else {
        Node current = table[index];
        Node previous = null;
        while (current != null && current.value > value) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            newNode.next = table[index];
            table[index] = newNode;
        } else {
            newNode.next = current;
            previous.next = newNode;
        }
    }
}
