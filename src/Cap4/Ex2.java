package Cap4;

import java.util.Scanner;

// Crie um programa que leia um número inteiro e exiba se o número é par ou
//ímpar.
public class Ex2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int x = sc.nextInt();

        if( x % 2 == 0 )
        {
            System.out.println("O valor digitado é par");
        }
        else
        {
            System.out.println("O valor digitado impar");
        }
    }
}
