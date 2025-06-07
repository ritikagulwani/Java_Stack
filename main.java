import java.util.Stack;

public class main {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.isEmpty());

    }

}