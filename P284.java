package condicionales;

import java.util.Scanner;

public class TiendaEsquina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int devolucion;
        int eur2=0, eur1=0, cent50=0, cent20=0, cent10=0, cent5=0, cent2=0, cent1=0;
        System.out.println("Introduzca el número de casos a analizar: ");
        int casos = sc.nextInt();
        for (int i = 0 ; i < casos; i++){
            System.out.println("Introduzca el precio de la compra en céntimos: ");
            int precio= sc.nextInt();
            System.out.println("Introduzca el dinero entregado por el cliente en céntimos: ");
            int pago = sc.nextInt();
            devolucion = pago-precio;
            if (devolucion>=0) {
                while (devolucion >= 200) {
                    devolucion -= 200;
                    eur2++;
                }
                while (devolucion >= 100) {
                    devolucion -= 100;
                    eur1++;
                }
                while (devolucion >= 50) {
                    devolucion -= 50;
                    cent50++;
                }
                while (devolucion >= 20) {
                    devolucion -= 20;
                    cent20++;
                }
                while (devolucion >= 10) {
                    devolucion -= 10;
                    cent10++;
                }
                while (devolucion >= 5) {
                    devolucion -= 5;
                    cent5++;
                }
                while (devolucion >= 2) {
                    devolucion -= 2;
                    cent2++;
                }
                while (devolucion >= 1) {
                    devolucion -= 1;
                    cent1++;
                }
                System.out.println(eur2+ " " + eur1 + " " + cent50+ " " + cent20 + " " + cent10+ " " + cent5 + " " + cent2+ " " + cent1);
            }else {
                System.out.println("Debe: " + Math.abs(devolucion));
            }

        }
    }
}
