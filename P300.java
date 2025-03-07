package p300_399;
import java.util.HashSet;
import java.util.Scanner;

//accepted


public class P300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            HashSet<Character> letras = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' ||
                        s.charAt(j) == 'e' ||
                        s.charAt(j) == 'i' ||
                        s.charAt(j) == 'o' ||
                        s.charAt(j) == 'u' ){
                    letras.add(s.charAt(j));
                }
            }
            if (letras.size()== 5){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
