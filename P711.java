package p700_799;
import java.util.Scanner;


//accepted




public class P711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            int [] arr = new int[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arr[j] = Integer.parseInt(s.charAt(j) + "");
            }
            int acumulador = 0;
            int mayor=0;
            for (int j = 0; j < arr.length; j++) {
                if (j%2 == 0){
                    int min = 10;
                    for (int k = arr.length-1; k>j ; k--) {
                        min = arr[k]<min ? arr[k] : min;
                        if (min==0)break;
                    }
                    acumulador += 3*arr[j] + min; //+ el minimo que este a su derecha
                } else {
                    acumulador += 2*arr[j] + mayor;
                }
                mayor=Math.max(mayor,arr[j]);
            }
            System.out.println(acumulador);
        }
    }
}
