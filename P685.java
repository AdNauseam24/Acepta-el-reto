package buclesSimples;

import java.util.Scanner;

public class Espantaperros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las cordenadas x y x y: ");
        String coordenadas = sc.nextLine();
        //asumimos que en principio no se detecta y creamos una variable para cada una de las coordenadas
        boolean detectado = false;
        int xTorre = Integer.parseInt(coordenadas.substring(0,1));
        int yTorre = Integer.parseInt(coordenadas.substring(2,3));
        int xIntruso = Integer.parseInt(coordenadas.substring(4,5));
        int yIntruso = Integer.parseInt(coordenadas.substring(6,7));
        //hasta que el usuario introduzca manualmente todo 0 se repetira el programa
        while (xTorre!=0 || yTorre!=0 || xIntruso!=0 || yIntruso != 0) {
            //si uno de los ejes coincide significa que está en su campo de vision
            if (xTorre==xIntruso || yTorre==yIntruso) {
                detectado = true;
                //en cualquier otro caso se nos queda la cuadricula dividida en 4 espacios
                //segun sea la posicion relativa de los dos objetos se comprobará en una direccion u otra
            } else {
                //en el primer caso se escanea aumentando x e y
                //si alguno de los dos numeros sobrepasa el de las coordenadas del intruso significa que ya no lo detecta
                //si las dos coordenadas se vuelven coincidentes se ha detectado
                if (xIntruso>xTorre && yIntruso>yTorre) {
                    while (xIntruso>xTorre && yIntruso>yTorre){
                        xTorre++;
                        yTorre++;
                        if (xTorre==xIntruso && yTorre==yIntruso) {
                            detectado = true;
                        }
                    }
                } else if (xIntruso>xTorre && yIntruso<yTorre) {
                    while (xIntruso>xTorre && yIntruso<yTorre){
                        xTorre++;
                        yTorre--;
                        if (xTorre==xIntruso && yTorre==yIntruso) {
                            detectado = true;
                        }
                    }
                } else if (xIntruso<xTorre && yIntruso<yTorre) {
                    while (xIntruso<xTorre && yIntruso<yTorre){
                        xTorre--;
                        yTorre--;
                        if (xTorre==xIntruso && yTorre==yIntruso) {
                            detectado = true;
                        }
                    }
                } else if (xIntruso<xTorre && yIntruso>yTorre) {
                        while (xIntruso<xTorre && yIntruso>yTorre){
                            xTorre--;
                            yTorre++;
                            if (xTorre==xIntruso && yTorre==yIntruso) {
                                detectado = true;
                            }
                        }
                }
            }
            if (detectado) {
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
            System.out.println("Ingrese las cordenadas x y x y: ");
             coordenadas = sc.nextLine();
             detectado = false;
             xTorre = Integer.parseInt(coordenadas.substring(0,1));
             yTorre = Integer.parseInt(coordenadas.substring(2,3));
             xIntruso = Integer.parseInt(coordenadas.substring(4,5));
             yIntruso = Integer.parseInt(coordenadas.substring(6,7));
        }
    }
}
