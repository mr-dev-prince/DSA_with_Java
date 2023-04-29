
public class stackUsingArray {

    private int data[];
    private int top;

    public stackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public stackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top+1;
    }

    public int top() throws stackEmptyException {
        if (size() == 0) {
            // stackException
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int elem) throws stackfullException {
        if (size() == data.length) {
            stackfullException e = new stackfullException();
            throw e;
        }
        top++;
        data[top] = elem;
    }

    public int pop() throws stackEmptyException {

        if (size() == 0) {
            // stackException
            stackEmptyException e = new stackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }


    // Driver Code 
    public static void main(String[] args) throws stackfullException {
        stackUsingArray stack = new stackUsingArray();

        for(int i = 1 ; i<=5 ; i++){
            stack.push(50+i);
        }

        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
            }catch(stackEmptyException e){
                // never reach here
            }
        }
    }
}