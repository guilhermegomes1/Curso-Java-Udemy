package aulas.ExerciciosNelio;

import java.util.Scanner;
import java.lang.Math;
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//casas decimais conforme exemplos

public class Question2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double raio, area;
       

        raio = input.nextDouble();

        area = Math.PI * (raio * raio);

        System.out.printf("A= %.4f", area);


        input.close();
        


    }
}