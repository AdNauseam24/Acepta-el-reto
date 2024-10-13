package buclesSimples;

import java.util.Scanner;

public class Espantaperros_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas: ");
        String coordenadas = sc.nextLine();
        int xTorre = Integer.parseInt(coordenadas.substring(0,1));
        int yTorre = Integer.parseInt(coordenadas.substring(2,3));
        int xIntruso = Integer.parseInt(coordenadas.substring(4,5));
        int yIntruso = Integer.parseInt(coordenadas.substring(6,7));
        while (xTorre!=0 || yTorre!=0 || xIntruso!=0 || yIntruso != 0){
            if (xTorre==xIntruso || yTorre==yIntruso || Math.abs(yTorre-yIntruso)== Math.abs(xTorre-xIntruso)){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
            System.out.println("Ingrese las coordenadas: ");
             coordenadas = sc.nextLine();
             xTorre = Integer.parseInt(coordenadas.substring(0,1));
             yTorre = Integer.parseInt(coordenadas.substring(2,3));
             xIntruso = Integer.parseInt(coordenadas.substring(4,5));
             yIntruso = Integer.parseInt(coordenadas.substring(6,7));
        }
    }
}
