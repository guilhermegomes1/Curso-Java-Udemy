package aulas.secao4.aula25;

import java.util.Scanner;


public class EntradaUsuario {

    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    /*
    String s1, s2, s3;

    s1 = input.nextLine();
    s2 = input.nextLine();
    s3 = input.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
        */

    /*ATENÇÃO COM A QUEBRA DE LINHA PENDENTE: 
    quando usamos o comando next , ao apertar o enter ele faz uma quebra de linha, 
    sendo que, essa quebra conta no programa!!!!
        EXEMPLO ABAIXO
    */

    String s1, s2, s3;
    int x;

    x = input.nextInt();
    input.nextLine(); //solução para consumir a quebra de linha anterior, que ficou pendente
    s1 = input.nextLine();
    s2 = input.nextLine();
    s3 = input.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);


    }

}
