package p500_599;

//Accepted


import java.util.ArrayList;
import java.util.Scanner;

public class P503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int[] valores = new int[d1+d2+1];
            for (int j = 1; j <= d1; j++) {
                for (int k = 1; k <= d2; k++) {
                    valores[j+k]++;
                }
            }

            int frecuenciaMax = Integer.MIN_VALUE;
            ArrayList<Integer> ganadores = new ArrayList<>();
            for (int j = 2; j < valores.length; j++) {
                if (valores[j]>frecuenciaMax){
                    ganadores.clear();
                    frecuenciaMax=valores[j];
                    ganadores.add(j);
                }
                else if (valores[j] == frecuenciaMax){
                    ganadores.add(j);
                }
            }
            for (int j = 0; j < ganadores.size(); j++) {
                System.out.print(ganadores.get(j) + (j == ganadores.size()-1 ? "":" "));
            }
            System.out.println();
        }
    }
}
