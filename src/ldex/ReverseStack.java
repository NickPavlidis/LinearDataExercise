package ldex;
import java.util.*;


public class ReverseStack {
    public static Stack<Integer> reverse(Stack<Integer> initial) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        for (int i=0; i<11; i++){ 
            stack2.push(initial.peek());
            stack.push(initial.pop());
             
        }
        for (int i=0; i<11; i++){
            initial.push(stack2.pop());
            
            }
        return stack; 
    
   
    }
  
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + reverse(myStack));
        System.out.println("Reformed initial stack: " + myStack);
    }
}
