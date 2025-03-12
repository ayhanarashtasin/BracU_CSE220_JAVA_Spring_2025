import java.util.Stack;
public class Main {
  public static Stack<Integer> conditional_reverse(Stack<Integer> stack){
    Stack<Integer> temp = new Stack<Integer>();
    while(!stack.isEmpty()){
      int top = stack.pop();
      if(!stack.isEmpty()){
        if(top == stack.peek()){
          stack.pop();
          temp.push(top);
        }
        else{
          temp.push(top);
        }
      }
    }
    return temp;
  }
