// This stack doubles itself every time the number of elements exceeds the current capacity of the stack


public class doubleCapacitStack {
    private int data[];
    private int top;

    public doubleCapacitStack() {
        data = new int[10];
        top = -1;
    }

    public doubleCapacitStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    // stack operations - push , pop, peek, size, isEmpty
    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if (size() == data.length) {
            doubleCapacity();
        }
        top++;
        data[top] = x;
    }

    // double capacity method

    private void doubleCapacity() {
        int temp[] = data; // store all data in temp
        data = new int[2 * temp.length]; // initialise data array of double size
        for (int i = 0; i <= top; i++) { // copy data from temp to data again
            data[i] = temp[i];
        }
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

    public int peek() {
        return data[top];
    }

    // Driver code

    public static void main(String[] args) {
        doubleCapacitStack s = new doubleCapacitStack(3);

        System.out.println("size of stack: " + s.size());

        for (int i = 1; i <= 12; i++) {
            s.push(i);
        }

        System.out.println("elements pushed in the stack successfully");

        System.out.println("size of stack: " + s.size());

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
