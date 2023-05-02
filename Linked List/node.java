// linked list 

public class node<T>{
    T data;
    node<T> next;


    node(T d){
        this.data = d;
        next = null;
    }
    // print function to print the linked list

    public static void print(node<Integer> head){
        node<Integer> temp = head; // keeping the address of the first node for future use.
        while(head != null){
            System.out.print (head.data + " ");
            head = head.next;
        }
        head = temp;
        System.out.println();
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // making objects of the linked list class
        node<Integer> new_node1 = new node<Integer>(10);
        node<Integer> new_node2 = new node<Integer>(20);
        node<Integer> new_node3 = new node<Integer>(30);
        node<Integer> new_node4 = new node<Integer>(40);

        // pointing the head of the linked list to the first node
        node<Integer> head = new_node1; 

        // linking all the nodes to one another by the next pointer
        new_node1.next = new_node2;
        new_node2.next = new_node3;
        new_node3.next =new_node4;
        new_node4.next = null;
        
        print(head);


    }
}