package buclesSimples;
import java.util.Scanner;



//accepted




public class P390 {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);

        int m, a, c, posicion;
        String colors;
        char tono;
        int casos = scN.nextInt();
        for (int i = 0 ; i<casos; i++){
            boolean disponible= true;
            m = scN.nextInt();
            a = scN.nextInt();
            c = scN.nextInt();
            colors = scN.next();
            posicion = colors.length()-1;
            for (int j = 0; j<colors.length(); j++){
                tono = colors.charAt(posicion);
                switch (tono){
                    case 'M':
                        m--;
                        break;
                    case 'A':
                        a--;
                        break;
                    case 'C':
                        c--;
                        break;
                    case 'R':
                        m--;
                        a--;
                        break;
                    case 'V':
                        a--;
                        c--;
                        break;
                    case 'L':
                        m--;
                        c--;
                        break;
                    case 'N':
                        m--;
                        c--;
                        a--;
                        break;
                    case 'B':
                        break;
                }
                if (m<0 || c<0 || a<0){
                    disponible = false;
                    break;
                }else {posicion--;}
            }
            if (disponible){
                System.out.println("SI "+ m + " " + a + " " +c);
            }else {
                System.out.println("NO");
            }

        }
    }
}