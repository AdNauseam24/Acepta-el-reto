package p100_199;
import java.util.Scanner;


//accepted




public class P106 {

    static String [] numpais = {"0", "380", "50", "539", "560", "70", "759", "850", "890"};
    static String [] nombrePais = {" EEUU", " Bulgaria", " Inglaterra", " Irlanda", " Portugal", " Noruega", " Venezuela", " Cuba", " India"};

    public static void casoPrueba(String n, boolean trece){
        int iteraciones = trece ? 12 : 7;
        long x = Long.parseLong(n);
        long digitoControl = x%10;
        x = x/10;
        long acumulador = 0;
        for (int i = 0; i < iteraciones; i++) {
            acumulador = acumulador + (i%2 != 0 ? (x%10) : 3L *(x%10));
            x=x/10;
        }
        if ((acumulador+digitoControl)%10 != 0){
            System.out.print("NO");
        } else {
            System.out.print("SI");
            if (trece){
                boolean found = false;
                String codigo = n.substring(0, 3);
                for (int i = 0; i < numpais.length; i++) {
                    if (codigo.equals(numpais[i])){
                        found = true;
                        System.out.print(nombrePais[i]);
                        break;
                    }
                }
                if (!found){
                    codigo  = n.substring(0, 2);
                    for (int i = 0; i < numpais.length; i++) {
                        if (codigo.equals(numpais[i])){
                            found = true;
                            System.out.print(nombrePais[i]);
                            break;
                        }
                    }
                }
                if (!found){
                    if (n.substring(0,1).equals(numpais[0])){
                        System.out.print(nombrePais[0]);
                        found = true;
                    }
                }
                if (!found){
                    System.out.print(" Desconocido");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        while (!n.equals("0")){
            boolean trece = n.length()>8;
            if (trece && n.length()<13){
                int faltantes = 13-n.length();
                String anadir = "";
                for (int i = 0; i < faltantes; i++) {
                    anadir+="0";
                }
                n = anadir+n;
            }
            if (!trece && n.length()<8){
                int faltantes = 8-n.length();
                String anadir = "";
                for (int i = 0; i < faltantes; i++) {
                    anadir+="0";
                }
                n = anadir+n;
            }
            casoPrueba(n, trece);
            n = sc.nextLine();
        }

    }
}
