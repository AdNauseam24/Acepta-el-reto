package buclesSimples;
import java.util.Scanner;


//accepted



public class P355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int anio = sc.nextInt();
            if (anio%4==0){
                if (anio%100==0 && anio%400==0){
                    System.out.println("29");
                } else if (anio%100==0 && anio%400!=0) {
                    System.out.println("28");
                }else {
                    System.out.println("29");
                }
            }else {
                System.out.println("28");
            }
        }
    }
}
