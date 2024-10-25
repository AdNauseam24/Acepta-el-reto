package buclesSimples;
import java.util.Scanner;


//accepted



public class P356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long precio1 = sc.nextLong();
            long precio2 = sc.nextLong();
            long precio3 = sc.nextLong();
           long mayor,menor, medio;
           mayor=Math.max(precio1,Math.max(precio2,precio3));
           menor=Math.min(precio1,Math.min(precio2,precio3));
           medio=precio1+precio2+precio3-mayor-menor;
            System.out.println(menor + " " + medio + " " + mayor);
        }
    }
}
