package buclesSimples;
import java.util.Scanner;

//accepted

public class P157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, contador;
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
             dia = sc.nextInt();
             mes = sc.nextInt();
             contador = 0;
            while (dia != 31 || mes != 12) {
                dia++;
                contador++;
                switch (mes) {
                    case 2:
                        if (dia>28){
                            dia=1;
                            mes++;
                        }
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        if (dia>31){
                            dia=1;
                            mes++;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia>30){
                            dia=1;
                            mes++;
                        }
                        break;
                }
            }
            System.out.println(contador);
        }
    }
}
