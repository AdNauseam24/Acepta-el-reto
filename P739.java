package buclesSimples;

import java.util.Scanner;

public class HorizontalOVertical {
    public static void main(String[] args) {
        //dos sccaner para letras y num
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        System.out.println("Ingrese el numero de casos de prueba");
        //introducimos el numero de repeticiones
        int casos = scN.nextInt();
        for (int i = 0; i < casos; i++) {
            //cremoas contadores para ver si es mas eficiente ponerlo en vertical u horizontal
            int contadorVertical=0;
            int contadorHorizontal=0;
            System.out.println("Ingrese separado por un espacio el ancho y alto de la pared y el ancho y alto de los azulejos");
            String tamanios = scL.nextLine();
            //tomamos todas las medidas
            String [] parts = tamanios.split(" ");
            int anchoPared = Integer.parseInt(parts[0]);
            int alturaPared = Integer.parseInt(parts[1]);
            int anchoAzulejo = Integer.parseInt(parts[2]);
            int alturaAzulejo = Integer.parseInt(parts[3]);
            //copiamos la altura y el ancho 2 veces cada una para operar con ellas probando poniendo los azulejos de las dos maneras
            int anchoParedH=anchoPared;
            int alturaParedH=alturaPared;
            int anchoParedV=anchoPared;
            int alturaParedV=alturaPared;
            //para calcular ponerlo en ancho lo que hacemos es ir restando el ancho de los azulejos al de la pared
            //cuando baja de 0 lo ponemos en su valor original y restamos la altura correspondiente que ocupa esa fila de azulejos
            //cuando nos quedemos sin altura quiere decir que la pared esta completa
            while (alturaParedH>0){
                contadorHorizontal++;
                anchoParedH-=anchoAzulejo;
                if (anchoParedH<1){
                    anchoParedH=anchoPared;
                    alturaParedH-=alturaAzulejo;
                }
            }
            //para ponerlos en vertical, a la altura de la pared lo que restamos es el ancho del azulejo
            //y al ancho de la pared le vamos restando la altura de los azulejos
            //cuando el ancho de la pared llega a 0 ya habremos colocado todos los azulejos
            while (anchoParedV>0) {
                contadorVertical++;
                alturaParedV -= anchoAzulejo;
                if (alturaParedV < 1) {
                    alturaParedV = alturaPared;
                    anchoParedV -= alturaAzulejo;
                }
            }
            //comparamos que metodo es el que gasta menos azulejos y lo mostramos
            System.out.println(Math.min(contadorVertical, contadorHorizontal));
        }
    }
}
