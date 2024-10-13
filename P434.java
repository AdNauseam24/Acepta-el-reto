package buclesSimples;

import java.util.Scanner;

public class Palomar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de casos de prueba");
        int num = sc.nextInt();
        int n, m;
        for (int i = 0; i < num; i++) {
            System.out.println("Introduzca el número de palomas");
            n = sc.nextInt();
            while (n<2){
                System.out.println("El número de palomas debe ser al menos 2");
                n = sc.nextInt();
            }
            System.out.println("Introduzca el numero de palomares: ");
            m = sc.nextInt();
            if(n>m){
                System.out.println("PRINCIPIO");
            }else {
                System.out.println("ROMANCE");
            }
        }
    }
}
