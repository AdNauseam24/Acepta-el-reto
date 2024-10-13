package condicionales;
import java.util.Scanner;
public class Nochevieja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos una variable para horas y otro para minutos
        //horaN nos contara los minutos que restan hasta las 00:00
        int hh, mm , horaN;
        String hora;
        System.out.println("Introduzca la hora en formato HH:MM");
        hora = sc.nextLine();
        //Creamos dos interger con uno siendo los minutos y otro las horas a partir de la cadena introducida
        hh =Integer.parseInt(hora.substring(0,2)) ;
        mm =Integer.parseInt(hora.substring(3,5)) ;
        //Mientras uno de los dos no sea 0 no será nochevieja, ene l momento en el que los dos son 0 se sale del bucle
        while ((hh!=0 || mm!=0)) {
            //se multiplican las horas *60 para comprobar cuantos minutos son
            hh*=60;
            //se suma para ver los minutos que han pasado desde las 00:00 anteriores
            horaN= hh+mm;
            //El resultado se le resta a 1440 que son los minutos que tienen 24h, lo que nos da los minutos que quedan
            horaN=1440-horaN;
            System.out.println("Faltan " + horaN + " minutos para nochevieja");
            System.out.println("Introduzca la hora en formato HH:MM");
            hora = sc.nextLine();
            hh =Integer.parseInt(hora.substring(0,2)) ;
            mm =Integer.parseInt(hora.substring(3,5)) ;
        }
    }
}
