public class LLImplementation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;

        }
        void displayrec(Node h){
            if(h== null) return;
            displayrec(h.next);
            System.out.print(h.val +" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                int x = head.val;
                head = head.next;
                return x;
            }

        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;

        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.display();
        st.push(4);
        st.display();
        st.push(2);
        st.display();
        st.push(9);

        st.display();
        st.displayRev();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());

    }

}
