import java.util.Stack;

public class ConsecutiveSequence {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek()!=arr[i])
                st.push(arr[i]);
           else if ( arr[i] ==st.peek()) {
                if (arr[i] != arr[i + 1] || i==arr.length-1) {
                    st.pop();
                }
            }
        }
        int [] res = new int[st.size()];
        int m = res.length;
        for(int i=m-1;i>=0;i--){
            res[i] = st.pop();
        }
         
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 5, 5, 5, 7, 7, 2 };
        int[] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}