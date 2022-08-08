package stack;
import
import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {

    private final static int Capacity = 100;
    private int top;
    private T[] stack;

    // constructor 1
    public ArrayStack(){
        this(Capacity);
    }

    // constructor 2
    public ArrayStack(int initialCapacity){
        top = 0;

        // creates an array of size, initialCapacity
        stack = (T[]) (new Object[initialCapacity]);
    }


    @Override
    public void push(T element) {
        // inserts element at the top of the stack.
        if (size() == stack.length){
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }



    @Override
    public T pop() throws EmptyStackException {
        // removes and returns the element at the top of the stack.
        if (isEmpty()){
            throw new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() {

        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    public void expandCapacity(){
        // copies stack with a new length
        stack = Arrays.copyOf(stack, stack.length*2);
    }
}
