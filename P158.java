package condicionales;

import java.util.Scanner;

public class SaltosMario {
    public static void main(String[] args) {
        //creamos un scanner para numeros y otro para letras
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        //posicion nos indica el lugar en el que estamos en la cadena de caracteres de la altura de saltos
        int posicion=0;
        //altura salto es cada uno de los caracteres que indica la altura de un alto en una posicion concreta
        //Alturasalto2 almacena un valor para compararlo con el siguiente
        int alturaSalto, alturaSalto2=1;
        //contadores de saltos hacia arriba y hacia abajo
        int descenso=0, ascenso=0;
        System.out.println("Introduzca el número de casos de prueba: ");
        int casos = scN.nextInt();
        //el bucle externo hace iteraciones iguales al numero indicado por el usuario
        for (int i = 0; i< casos; i++){
            System.out.println("Introduzca el número de saltos");
            int saltos = scN.nextInt();
            System.out.println("Introduzca la altura de los saltos dejando un espacio entre cada uno");
            String cadenaSaltos= scL.nextLine();
            //el bucle interno se ejecuta el numero de veces que saltos indica el usuario
            for (int j=0;j<saltos; j++){
                //la altura del salto en una posicion dada es una conversión de una substring de la cadena de saltos
                //cuya posicion depende de la variable posiciom, que se ira sumando 2 a 2 para ajustar por los espacios
                alturaSalto = Integer.parseInt(cadenaSaltos.substring(posicion,posicion+1));
                posicion+=2;
                //El primer salto indica la altura inicial de Mario, así que, en el casod e ser la primera iteracion
                //del bucle, la variable simplemente se guarda y el bucle continua en la siguiente iteracion
                //asi el primer valor solo lo usamos para comparar
                if (j==0){
                    alturaSalto2=alturaSalto;
                    continue;
                    //en caso de no ser la primera iteracion comparamos el valor de la altura actual con el de
                    //la altura anterior, segun sea el caso sumaremos al contador correspondiente
                }else {
                    if (alturaSalto2>alturaSalto){
                        descenso++;
                    } else if (alturaSalto2<alturaSalto) {
                        ascenso++;
                        //una vez hecha la comparación y cambiado el contador en caso de ser necesario
                        //guardamos el valor de la altura que se comparara con la siguiente
                    }alturaSalto2=alturaSalto;
                }
            }
            System.out.println("Saltos hacia arriba: " + ascenso);
            System.out.println("Saltos hacia abajo: " + descenso);
        }
    }
}
