package recursividad;
import java.util.Scanner;
//accepted
public class P136 {
    static int segmentos(int hobbit, int eslabones){
        int enanos=2*hobbit;
        int contador;
        if (eslabones<=enanos){
            return 0;
        }else {
            contador=1+segmentos(hobbit, (2*eslabones)/3+((2*eslabones)%3==0?0:1))+segmentos(hobbit, (eslabones/3));
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fHobbit = sc.nextInt();
        int eslabones= sc.nextInt();
        while (fHobbit!=0){
            System.out.println(segmentos(fHobbit,eslabones));
            fHobbit = sc.nextInt();
            eslabones= sc.nextInt();
        }
    }
}
