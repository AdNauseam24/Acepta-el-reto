package buclesSimples;
import java.util.Scanner;

//accepted

public class P121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int proporcion = sc.nextInt();
        int extra = sc.nextInt();
        int chiclesComprados = sc.nextInt();
        while (proporcion!=0 || extra!=0 || chiclesComprados!=0){
            int chiclesComidos= chiclesComprados;
             int envoltoriosRestantes=chiclesComprados;
             if( extra==0 || chiclesComprados==0){
                 System.out.println(chiclesComidos + " " + envoltoriosRestantes);
             }
            else if(extra>=proporcion && chiclesComprados>=proporcion){
                System.out.println("RUINA");
            }else {
                while (envoltoriosRestantes >= proporcion) {
                    int chiclesRegalados = (envoltoriosRestantes/proporcion)*extra;
                    chiclesComidos+=chiclesRegalados;
                    envoltoriosRestantes =chiclesRegalados+(envoltoriosRestantes%proporcion);
                }
                System.out.println(chiclesComidos + " " + envoltoriosRestantes);
            }
             proporcion = sc.nextInt();
             extra = sc.nextInt();
             chiclesComprados = sc.nextInt();
        }
    }
}
