package aulas.secao4.aula27;

import java.util.Scanner;

public class FuncoesMatematicas {
    public static void main(String[]args){
        /*double a, b = 81.0, c;

        a = Math.sqrt(b);

        System.out.printf("A raiz quadrada de %.2f é: %.2f", b, a);*/

        double a = 2, b = 8,  c= -24, x1, x2, delta; 
 
        delta = Math.pow(b, 2) - (4 * a * c);

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(delta);
        System.out.println(x1);
        System.out.println(x2);


    }
}
