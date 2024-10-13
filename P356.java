package buclesSimples;

import java.util.Scanner;

public class DolarZimbabuense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Introduzca el número de casos de prueba: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println();
            System.out.println("Introduzca el primer precio");
            a = sc.nextInt();
            System.out.println("Introduzca el segundo precio");
            b = sc.nextInt();
            System.out.println("Introduzca el tercer precio");
            c = sc.nextInt();
            if (a>b && a>c){
                System.out.print(a + " ");
                if (b>c){
                    System.out.print(b + " ");
                    System.out.print(c + " ");
                } else {
                    System.out.print(c + " ");
                    System.out.print(b + " ");
                }
            } else if (b>c) {
                System.out.print(b + " ");
                if (c>a){
                    System.out.print(c + " ");
                    System.out.print(a + " ");
                } else {
                    System.out.print(a + " ");
                    System.out.print(c + " ");
                }
            } else{
                System.out.print(c + " ");
                if (b>a){
                    System.out.print(b + " ");
                    System.out.print(a + " ");
                } else {
                    System.out.print(a + " ");
                    System.out.print(b + " ");
                }
            }


        }
    }
}
