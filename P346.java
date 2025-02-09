package p300_399;
import java.util.Scanner;
import java.util.Stack;


//Accepted


public class P346 {

    public static int rangoMax(Stack<Integer> st, int A) {
        int rMax = 0;
        for (int i = st.size() - 1; i >= 0; i--) {
            while (Math.abs(st.get(i)-st.peek()) >= A) {
                st.pop();
            }
            if (st.size()-i>rMax) rMax = st.size()-i;
        }
        return rMax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        while (N != 0){
            int A = sc.nextInt();

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < N; i++) {
                stack.push(sc.nextInt());
            }

            System.out.println(rangoMax(stack, A));

             N = sc.nextInt();

        }
    }
}
