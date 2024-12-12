package p300_399;
import java.util.Scanner;


//accepted



public class P337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int [] dientesSUP = new int[6];
            int [] dientesINF = new int[6];
            for (int j = 0; j < dientesSUP.length; j++) {
                dientesSUP[j]= sc.nextInt();
            } for (int j = 0; j < dientesINF.length; j++) {
                dientesINF[j] = sc.nextInt();
            }
            boolean flag = true;
            int suma = dientesSUP[0]+dientesINF[0];
            for (int j = 1; j < dientesSUP.length ; j++) {
                if (dientesSUP[j] + dientesINF[j] != suma){
                    System.out.println("NO");
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("SI");


        }
    }
}
