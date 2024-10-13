package buclesSimples;

import java.util.Scanner;

public class GregorioXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = 0;
        System.out.println("Introduzca el número de casos a procesar");
        int n = sc.nextInt();
        //el bucle se repite el numero de evces indicado por el usuario
        for (int i = 0 ; i<n ; i++){
            //El programa pide forzosamente un numero mayor a 1582
            System.out.println("Introduzca un año a partir de 1582:");
            anio = sc.nextInt();
            while (anio<1583) {
                System.out.println("Introduzca un año a partir de 1582:");
                anio = sc.nextInt();
            }
            //si el año es divisible por 4
            if (anio%4==0){
                //divisible por 4 y 100 y 400
                if (anio%100==0 && anio%400==0){
                    System.out.println("29");
                    //divisible entre 4 y 100 y NO 400
                } else if (anio%100==0 && anio%400!=0) {
                    System.out.println("28");
                    //divisible solo entre 4
                }else {
                    System.out.println("29");
                }
                //no divisible entre 4
            }else {
                System.out.println("28");
            }

        }
    }
}
