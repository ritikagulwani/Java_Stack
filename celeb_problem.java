// A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people. A square matrix mat[][] (n*n) is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

import java.util.Stack;

public class celeb_problem {

    public static int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (mat[v1][v2] == 0)
                st.push(v1);
            else if (mat[v2][v1] == 0)
                st.push(v2);
        }
        if (st.size() == 0) {
            return -1;
        }
        int a = st.pop();
        for (int i = 0; i < n; i++) {
            if (mat[a][i] == 1)
                return -1;
        }
        for (int i = 0; i < n; i++) {
            if (i == a)
                continue;
            if (mat[i][a] == 0)
                return -1;
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 } };
        System.out.println(celebrity(mat));
    }
}
