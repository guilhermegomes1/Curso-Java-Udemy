package aulas.ExerciciosNelio;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais */
import java.util.Locale;
import java.util.Scanner;

public class Question4{
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int nFun, nHoras;
        double valorHora, salario;

        nFun = input.nextInt();
        nHoras = input.nextInt();
        valorHora = input.nextDouble();

        salario = valorHora * nHoras;

        System.out.printf("NUMBER = %d\nSALARY = U$%.2f", nFun, salario);

    }
}