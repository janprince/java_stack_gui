package stack;

public class Program {

    public static void main (String[] args){

        ArrayStack<String> myStack = new ArrayStack<String>();
        myStack.push("Prince");
        myStack.push("Johnson");
        myStack.push("Mark");
        myStack.push("Atta");
        myStack.push("William");

        System.out.println(myStack.toString());
        System.out.println("Size: " + myStack.size());
        System.out.println("Top: " + myStack.peek());

        String name = myStack.pop();

        System.out.println("Popped: " + name);
        System.out.println(myStack.toString());
        System.out.println("Size: " + myStack.size());
        System.out.println("Top: " + myStack.peek());
    }
}
