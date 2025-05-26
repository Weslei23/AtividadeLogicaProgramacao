package Cap4;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro de 1 a 7 e exiba o nome do
//dia da semana correspondente (1 para domingo, 2 para segunda-feira, etc.).
public class Ex11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7: ");
        int num1 = sc.nextInt();

        switch(num1)
        {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Invalido");

        }
    }
}
