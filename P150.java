package buclesAnidados;
//accepted 
import java.util.Scanner;

public class P150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String [] parts = nombre.split(" ");
        int lados = Integer.parseInt(parts[0]);
        char caracter = parts[1].charAt(0);
        while (lados!=0 || caracter!='0') {
            for (int i = 0; i < lados; i++) {
                for (int j = 0; j < lados - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < lados + 2 * i; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
            for (int i = 1; i < lados; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (lados*2)+(lados-2)-2*i; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
            nombre = sc.nextLine();
            parts = nombre.split(" ");
            lados = Integer.parseInt(parts[0]);
            caracter = parts[1].charAt(0);
            }

        }
    }

