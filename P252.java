package p200_299;
import java.util.Scanner;



//accepted




public class P252 {
    static String invertirFrase(String frase, int longitud) {
        String inversa;
        if(longitud == 1){
            return String.valueOf(frase.charAt(0));
        } else {
            inversa = String.valueOf(frase.charAt(longitud-1)+invertirFrase(frase, longitud-1));
        }
        inversa= inversa.replaceAll(" ", "");
        return inversa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("XXX")){
            s = s.toLowerCase().replaceAll(" ", "");
            if (s.equals(invertirFrase(s, s.length()))) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            s = sc.nextLine();
        }
    }
}
