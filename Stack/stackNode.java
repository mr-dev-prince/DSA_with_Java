
// stack using linked List

public class stackNode<T> {

    // creating contructor for node
    class node<T> {
        T data;
        node<T> next;

        node(T d) {
            this.data = d;
            next = null;
        }
    }

    private node<T> head;
    private int size;

    public stackNode() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
        // return head == null; alternate argument
    }

    // peek operation

    T peek() {
        if (size() == 0) {
            System.out.println("stack empty");
        }
        return head.data;
    }

    void push(T elem) {
        node<T> newNode = new node<T>(elem);

        newNode.next = head; // pointing the next pointer of the new node to the head of the existing node as we are pushing the element to the front of the head node;
        head = newNode; // now pointing the head to the new node
        size++;
    }

    T pop() {

        if (head == null) {
            System.out.println("stack Empty");
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

    // Driver Code

    public static void main(String[] args) {
        stackNode<Integer> stack = new stackNode<>();

        for (int i = 1; i <= 10; i++) {
            stack.push(i + 2);
        }

        System.out.println("Size : " + stack.size());
        System.out.println("Top Element : " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();

        System.out.println("Size : " + stack.size());

    }

}

// a function must return something otherwise it throws an errrrror

// advantage of stack using linkedlist : we do not have to double the size of
// the stack when it is full.