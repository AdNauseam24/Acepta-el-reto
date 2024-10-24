package buclesSimples;
import java.util.Scanner;

//accepted

public class P174 {
    static boolean digitosRepetidos(String n){
        for (int i = 0; i < n.length()-1; i++) {
            for (int j = i+1; j <n.length() ; j++) {
                if(n.charAt(i)==n.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anioNum, anioNum2;
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            String anio = sc.next();
            String anio2 = anio;
            if (digitosRepetidos(anio)){
                while (digitosRepetidos(anio)){
                     anioNum = Integer.parseInt(anio);
                    anioNum--;
                    anio= Integer.toString(anioNum);
                }

                while (digitosRepetidos(anio2)){
                    anioNum2 = Integer.parseInt(anio2);
                    anioNum2++;
                    anio2= Integer.toString(anioNum2);
                }

            } else {
                while (!digitosRepetidos(anio)){
                    anioNum = Integer.parseInt(anio);
                    anioNum--;
                    anio= Integer.toString(anioNum);
                }
                while (!digitosRepetidos(anio2)){
                    anioNum2 = Integer.parseInt(anio2);
                    anioNum2++;
                    anio2= Integer.toString(anioNum2);
                }

            }
            anioNum=Integer.parseInt(anio)+1;
            System.out.print(anioNum);
            System.out.print(" " + (Integer.parseInt(anio2)-anioNum));
            System.out.println();

        }
    }
}
