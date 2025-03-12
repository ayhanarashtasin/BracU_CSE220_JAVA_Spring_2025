import java.util.Stack;
public class Main {
  public static Stack<Integer> remove_block(Stack<Integer> stack, int block){
    Stack<Integer> temp = new Stack<Integer>();
    int count=1;
    while(!stack.isEmpty()){
      if (count==block){
        stack.pop();
        break;
      }
      else{
        temp.push(stack.pop());
        count++;
      }
    }
    while(!temp.isEmpty()){
      stack.push(temp.pop());
    }
    return stack;
  }
