package condicionales;

import java.util.Scanner;

public class Velocidad_desp_tiemp {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        System.out.println("Introduzca el número de problemas a resolver");
        int n = scN.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca los datos: ");
            String datos = scL.nextLine();
            String[] parametros = datos.split(" ");
            String [] datos1 = parametros[0].split("=");
            char parametro1 = datos1[0].charAt(0);
            int valor1 = Integer.parseInt(datos1[1]);
            String [] datos2 = parametros[1].split("=");
            char parametro2 = datos2[0].charAt(0);
            int valor2 = Integer.parseInt(datos2[1]);
            switch (parametro1) {
                case 'D':
                    switch (parametro2){
                        case 'T':
                            System.out.println(valor1/valor2);
                            break;
                        case 'V':
                            System.out.println(valor1/valor2);
                            break;
                    }
                    break;
                case 'T':
                    switch (parametro2){
                        case 'V':
                            System.out.println(valor2*valor1);
                            break;
                        case 'D':
                            System.out.println(valor2/valor1);
                            break;
                    }
                    break;
                case 'V':
                    switch (parametro2){
                        case 'T':
                            System.out.println(valor2*valor1);
                        case 'D':
                            System.out.println(valor2/valor1);
                    }
                    break;
            }
        }
    }
}
