import javax.annotation.processing.ProcessingEnvironment;

public class arrayStack {

    // stack using array
    // stack operations : push , pop, peek, size, isEmpty

    private int data[];
    private int top;

    public arrayStack() {
        data = new int[10];
        top = -1;
    }

    public arrayStack(int capcity) {
        data = new int[capcity];
        top = -1;
    }

    public int peek() {
        return data[top];
    }

    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if (top > data.length) {
            System.out.println("stack Overflow");
        }
        top++;
        data[top] = x;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("stack underflow");
        }
        int temp = data[top];
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    // Driver Code
    public static void main(String[] args) {
        arrayStack stack = new arrayStack();

        // push operation

        for (int i = 1; i <= 8; i++) {
            stack.push(i);
        }

        // size operation

        System.out.println("Size of the stack is " + stack.size());

        // peek operation

        System.out.println("Top element in the stack is " + stack.peek());

        // isEmpty and pop operation

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
