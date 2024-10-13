package condicionales;

import java.util.Scanner;

public class Navidad {
    public static void main(String[] args) {
        //scanner para letras y para numeros
        Scanner scL = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        int dia, mes;
        System.out.println("Introduzca el número de fechas a comprobar: ");
        int n = scN.nextInt();
        //iteraciones indicadas por el usuario
        for (int i=0; i<n; i ++){
            System.out.println("Introduzca la fecha en formaro DD MM");
            String fecha = scL.nextLine();
            //sacamos el dia y mes haciendo conversiones de la substrings a enteros
            dia = Integer.parseInt(fecha.substring(0,2));
            mes = Integer.parseInt(fecha.substring(3,5));
            //si coinciden con la fecha de navidad es navidad, en cualquier otro caso no lo es
            if (dia==25 && mes ==12){
                System.out.println("Es Navidad!!");
            }else {
                System.out.println("No es navidad");
            }
        }
    }
}
