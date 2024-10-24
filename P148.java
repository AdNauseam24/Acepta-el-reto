package condicionales;
import java.util.Scanner;
//accepted

public class P148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh, mm , horaN;
        String hora = sc.nextLine();
        String [] partes = hora.split(":");
        hh =Integer.parseInt(partes[0]) ;
        mm =Integer.parseInt(partes[1]) ;

        while ((hh!=0 || mm!=0)) {
            hh*=60;
            horaN= hh+mm;
            horaN=1440-horaN;
            System.out.println(horaN);
            hora = sc.nextLine();
            partes = hora.split(":");
            hh =Integer.parseInt(partes[0]) ;
            mm =Integer.parseInt(partes[1]) ;

        }
    }
}
