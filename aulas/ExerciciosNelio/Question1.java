import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos

public class Question1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();

        c = a + b;

        System.out.printf("SOMA = %.2f", c);
        
    }
}