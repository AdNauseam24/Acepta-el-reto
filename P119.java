package buclesSimples;

import java.util.Scanner;
//accepted
public class P119 {
    static int nEcudos(int n){
        int escudos =0;
        int formacion;

        int lado;
        while (n>0){
            lado=(int) Math.sqrt(n);
            formacion= (int) Math.pow(lado,2);
            escudos= escudos+lado*4+formacion;
            n-=formacion;

        }
                return escudos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            System.out.println(nEcudos(n));
            n= sc.nextInt();
        }
    }
}
