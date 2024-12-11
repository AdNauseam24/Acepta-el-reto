package p100_199;
import java.util.Scanner;
import java.util.Stack;


//accepted



public class P141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean valid = true;
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '{':
                    case'[':
                    case'(':
                        stack.push(s.charAt(i));
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop()!='{') valid = false; break;
                    case ']':
                        if (stack.isEmpty() || stack.pop()!='[') valid = false; break;
                    case ')':
                        if (stack.isEmpty() || stack.pop()!='(') valid = false; break;
                }
                if (!valid) break;
            }
            if (!valid || !stack.isEmpty()) System.out.println("NO");
            else System.out.println("YES");
            stack.clear();
        }
    }
}
