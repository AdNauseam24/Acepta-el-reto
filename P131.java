package p100_199;
import java.util.Scanner;


//accepted



public class P131 {
    public static int numeroViajes(int piscina, int barrenio, int perdida){
        if (perdida>=barrenio && barrenio<piscina) return Integer.MAX_VALUE;
        if (barrenio>=piscina) return 1;
        int viajes = 0;
        while (piscina>barrenio){
            int posiblesViajes=piscina/barrenio;
            piscina=piscina-posiblesViajes*barrenio+posiblesViajes*perdida;
            viajes+=posiblesViajes;
        }
        if (piscina>0) viajes++;
        return viajes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        while (x1!=0 && x2!=0){
            int viajesYO=numeroViajes(x1,y1,z1);
            int viajesVECINO=numeroViajes(x2,y2,z2);
            if (viajesYO==viajesVECINO){
                System.out.println("EMPATE " + viajesYO);
            } else if (viajesYO>viajesVECINO) {
                System.out.println("VECINO " + viajesVECINO);
            } else System.out.println("YO " + viajesYO);
             x1 = sc.nextInt();
             y1 = sc.nextInt();
             z1 = sc.nextInt();
             x2 = sc.nextInt();
             y2 = sc.nextInt();
             z2 = sc.nextInt();
        }
        }
}
