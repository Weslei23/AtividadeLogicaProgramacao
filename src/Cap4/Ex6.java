package Cap4;

import java.util.Scanner;

//Desenvolva um programa que leia três números inteiros e exiba o maior deles.
//Caso dois ou mais números sejam iguais, exiba uma mensagem indicando que há números
//iguais.
public class Ex6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o valor 2: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o valor 3: ");
        int num3 = sc.nextInt();

        if( num1 == num2 && num1 == num3 )
        {
            System.out.println("Todos são iguais");
        }
        else if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("O número " + num1 + " é maior!");
        }
        else if (num2 >= num1 && num2 >= num3 )
        {
            System.out.println("O número " + num2 + " é maior!");
        }
        else if (num3 >= num1 && num3 >= num2)
        {
            System.out.println("O número " + num3 + " é maior!");
        }
    }
}
