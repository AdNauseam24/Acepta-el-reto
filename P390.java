package condicionales;
import java.util.Scanner;
public class PixelArt {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        //asumimos en un primer lugar que siempre podemos realizar el pixel art
        boolean disponible= true;
        //las tres priemras avriables son para la cantidad de cada color
        //posicion lo usamos para el caracter a analizar
        int m, a, c, posicion;
        //La parte de la cadena introducida por el usuario que contiene los colores
        String colors;
        //El caracter de la cadena que indica el color usado en cada caso
        char tono;
        System.out.println("Introduzca el número de casos a analizar");
        int casos = scN.nextInt();
        //El bucle tiene las iteraciones que especifique el usuario
        for (int i = 0 ; i<casos; i++){
            System.out.println("El código de colores es: \nM magenta\nA amarillo\nC cian\nV verde\nL violeta\nR rojo\nN negro\nB blanco");
            System.out.println("Introduzca la cantidad de color y el orden de píxeles en formato M A C ORDEN");
            String pixels= scL.nextLine();
            //Hacemos 3 substrings cada una con la cantidad de ccada color
            m = Integer.parseInt(pixels.substring(0,1));
            a = Integer.parseInt(pixels.substring(2,3));
            c = Integer.parseInt(pixels.substring(4,5));
            //El resto de la cadena son los colores utilizados
            colors = pixels.substring(6);
            //El valor inicial de la posicione es el ultimo, es decir la longitud -1
            posicion = colors.length()-1;
            //el siguiente bucle anidado se ejecuta el numero de veces que longitud tiene la cadena de colores
            for (int j = 0; j<colors.length(); j++){
                //tono nos indica el caracter en cada posicion
                tono = colors.charAt(posicion);
                //Según el tono restaremos unos colores u otros
                switch (tono){
                    case 'M':
                        m--;
                        break;
                    case 'A':
                        a--;
                        break;
                    case 'C':
                        c--;
                        break;
                    case 'R':
                        m--;
                        a--;
                        break;
                    case 'V':
                        a--;
                        c--;
                        break;
                    case 'L':
                        m--;
                        c--;
                        break;
                    case 'N':
                        m--;
                        c--;
                        a--;
                        break;
                    case 'B':
                        break;
                }
                //si alguno de los colores cae debajo de 0 significa que no tenemos suficiente color
                //por lo cual disponible pasa a false y salimos del bucle
                if (m<0 || c<0 || a<0){
                    disponible = false;
                    break;
                //en caso contrario nos vamos a la posicion anterior y seguimos el bucle
                }else {posicion--;}
            }
            //Una vez analizados todos los colores, si estan disponibles se imprime un si + lo que resta de cada color
            if (disponible==true){
                System.out.println("SI "+ m + " " + a + " " +c);
                //en caso contrario se indica que no
            }else {
                System.out.println("NO");
            }

        }
    }
}
