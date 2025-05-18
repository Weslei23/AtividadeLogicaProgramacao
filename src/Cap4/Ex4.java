package Cap4;

import java.util.Scanner;

//Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem
//informando se ela é menor de idade (menor que 18 anos), maior de idade (18 anos ou mais)
//ou idosa (60 anos ou mais).
public class Ex4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade < 18)
        {
            System.out.println("Voce é menor de idade");
        }
        else if (idade >= 18 && idade <=60)
        {
            System.out.println("Voce é maior de idade");
        }
        else
        {
            System.out.println("Voce é idoso");
        }
    }
}
