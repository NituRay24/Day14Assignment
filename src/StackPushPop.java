import java.util.Stack;
public class StackPushPop {
    public void stackPushPop()
    {
    //creating an object of Stack class
    Stack<Integer> strStack = new Stack<>();
    //pushing elements into the stack
        System.out.println(strStack.isEmpty()); // true
    System.out.println(strStack.size()); // 0
//System.out.println(strStack.peek()); // EmptyStackException
      strStack.add(100);
      strStack.push(200);// to insert element into the stack
          strStack.push(300);
strStack.push(400);
System.out.println("Push 1000 returns: "+strStack.push(1000));
strStack.push(3000);
System.out.println(strStack);
strStack.pop(); // To remove an element from the top of the stack
System.out.println(strStack);
strStack.remove(300); // To remove a particular element from the stack
System.out.println(strStack);
System.out.println(strStack.indexOf(2000)); // returns -1 if that element is not present
System.out.println("Add 250 returns: "+strStack.add(250));
strStack.add(300);
System.out.println(strStack);
}
    public static void main(String[] args) {
        StackPushPop sDemons = new StackPushPop();
        sDemons.stackPushPop();
}
}

