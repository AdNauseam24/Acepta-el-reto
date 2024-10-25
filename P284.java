package buclesSimples;
import java.util.Scanner;

//accepted


public class P284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int coste = sc. nextInt();
            int entrega = sc.nextInt();
            int eur2=0, eur1=0, cent50=0, cent20=0, cent10=0, cent5=0, cent2=0, cent1=0;
            int devolucion = entrega-coste;
            if (devolucion<0){
                System.out.println("DEBE " + Math.abs(devolucion));
            } else {
                    if(devolucion>=200){
                        eur2=eur2+devolucion/200;
                        devolucion=devolucion%200;
                    }  if (devolucion>=100) {
                        eur1=eur1+devolucion/100;
                        devolucion=devolucion%100;
                    }  if (devolucion>=50) {
                        cent50=cent50+devolucion/50;
                        devolucion=devolucion%50;
                    }  if (devolucion>=20){
                        cent20=cent20+devolucion/20;
                        devolucion=devolucion%20;
                    }  if (devolucion>=10) {
                        cent10=cent10+devolucion/10;
                        devolucion=devolucion%10;
                    }  if (devolucion>=5) {
                        cent5=cent5+devolucion/5;
                        devolucion=devolucion%5;
                    }  if (devolucion>=2) {
                        cent2=cent2+devolucion/2;
                        devolucion=devolucion%2;
                    }  if (devolucion>0){
                        cent1=cent1+devolucion;
                        devolucion= 0;
                    }
                System.out.println(eur2+ " " + eur1 + " " + cent50+ " " + cent20 + " " + cent10+ " " + cent5 + " " + cent2+ " " + cent1);
            }

        }
    }
}
