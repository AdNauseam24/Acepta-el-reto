package buclesSimples;
import java.util.Scanner;
//accepted
public class P111 {
    static int valorNivel(String caso){
        switch (caso.charAt(1)){
            case 's':
                return 2;
            case 'p':
                return 6;
            case 'd':
                return 10;
            case 'f':
                return 14;

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        String[] niveles = new String[]{"1s","2s", "2p", "3s", "3p", "4s","3d","4p","5s","4d","5p","6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p"};
        String elemento = scN.next();
        while (!elemento.equals("Exit")){
            int nAtomico = scN.nextInt();
            int i =0;
            while (nAtomico>valorNivel(niveles[i])){
                System.out.print(niveles[i]+valorNivel(niveles[i]) + " ");
                nAtomico-=valorNivel(niveles[i]);
                i++;
            }
            System.out.print(niveles[i]+nAtomico);
            System.out.println();
            elemento = scN.next();
        }
    }
}
