package buclesSimples;

import java.util.Scanner;

public class ToestoCampo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los años que tenia el abuelo y los año de la iglesia: ");
        String anios = sc.nextLine();
        //separamos los años del abuelo y los de la iglesia
        String [] parts = anios.split(" ");
        int anioAbuelo = Integer.parseInt(parts[0]);
        int anioIglesia = Integer.parseInt(parts[1]);
        //mientras al menos uno de los dos no sea 0 se ejecutará el bucle
        while (anioAbuelo!=0 || anioIglesia!=0) {
            //si el abuelo tiene mas años o los mismos que la iglesia esta cuerdo
            if (anioAbuelo>=anioIglesia) {
                System.out.println("CUERDO");
            } else {
                System.out.println("SENIL");
            }
            //volvemos a pedir los datos para saber si se sigue ejecutando el bucle
            System.out.println("Ingrese los años que tenia el abuelo y los año de la iglesia: ");
             anios = sc.nextLine();
             parts = anios.split(" ");
             anioAbuelo = Integer.parseInt(parts[0]);
             anioIglesia = Integer.parseInt(parts[1]);
        }
    }
}
