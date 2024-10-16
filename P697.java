import java.util.Scanner;
//accepted
public class Prueba {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        int tamanio = scN.nextInt();
        while (tamanio>0) {
            int[][] matriz = new int[tamanio][tamanio];
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    matriz[i][j] = scN.nextInt();
                }
            }
            int k = tamanio/2;
            int l = tamanio/2;
            int sumador=1;
            int caso=1;
            int acumulador = matriz[k][l];
            while (k<=tamanio-1 && l<=tamanio-1 && k>=0 && l>=0){
                switch (caso){
                    case 1:
                        for (int i = 1; i <=sumador ; i++) {
                            k = k - 1;
                            if (k<=tamanio-1 && l<=tamanio-1 && k>=0 && l>=0) {
                                acumulador = acumulador + matriz[k][l];
                            }else {
                                break;
                            }
                        }
                        break;
                    case 2:
                        for (int i = 1; i <=sumador ; i++) {
                            l = l + 1;
                            if (k <= tamanio - 1 && l <= tamanio - 1 && k >= 0 && l >= 0) {
                                acumulador = acumulador + matriz[k][l];
                            } else {
                                break;
                            }
                        }
                        break;
                    case 3:
                        for (int i = 1; i <=sumador ; i++) {
                            k = k + 1;
                            if (k <= tamanio - 1 && l <= tamanio - 1 && k >= 0 && l >= 0) {
                                acumulador = acumulador + matriz[k][l];
                            } else {
                                break;
                            }
                        }
                        break;
                    case 4:
                        for (int i = 1; i <=sumador ; i++) {
                            l = l - 1;
                            if (k <= tamanio - 1 && l <= tamanio - 1 && k >= 0 && l >= 0) {
                                acumulador = acumulador + matriz[k][l];
                            } else {
                                break;
                            }
                        }
                        break;
                }
                if (!(k<=tamanio-1 && l<=tamanio-1 && k>=0 && l>=0)){
                    break;
                }
                    caso++;
                if (caso>4){
                    caso=1;
                }
                    sumador++;

                }
            System.out.println(acumulador);
            tamanio = scN.nextInt();
            }

        }
    }

