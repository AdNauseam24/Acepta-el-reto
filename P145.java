package p100_199;
import java.util.Scanner;
import java.util.Stack;


//accepted




public class P145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int contadorParejas=0;
            Stack<Character> pasajeros = new Stack<>();
            String tren = sc.nextLine();
            for (int i = 0; i < tren.length(); i++) {
                switch (tren.charAt(i)){
                    case 'H':
                    case 'h': pasajeros.push(tren.charAt(i));
                        break;
                    case 'M': if (!pasajeros.isEmpty() && pasajeros.pop()=='H'){
                        contadorParejas++;}
                        else pasajeros.push(tren.charAt(i));
                        break;
                    case 'm': if (!pasajeros.isEmpty() && pasajeros.pop()=='h'){
                            contadorParejas++;
                        }
                        else pasajeros.push(tren.charAt(i));
                        break;
                    case '@':pasajeros.clear();
                        break;
                }
            }
            System.out.println(contadorParejas);
        }
    }
}
