package condicionales;
import java.util.Scanner;

//accepted

public class P158 {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        int alturaSalto, alturaSalto2=1;
        int descenso, ascenso;
        int casos = scN.nextInt();
        for (int i = 0; i< casos; i++){
            descenso=0;
            ascenso=0;
            int saltos = scN.nextInt();
            for (int j=0;j<saltos; j++){
                alturaSalto = scN.nextInt();
                if (j==0){
                    alturaSalto2=alturaSalto;
                }else {
                    if (alturaSalto2>alturaSalto){
                        descenso++;
                    } else if (alturaSalto2<alturaSalto){
                        ascenso++;
                    }alturaSalto2=alturaSalto;
                }
            }
            System.out.println(ascenso + " " + descenso);
        }
    }
}
