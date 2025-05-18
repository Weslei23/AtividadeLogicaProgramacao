package Cap4;

import java.util.Scanner;

// Escreva um programa que leia um número inteiro e verifique se ele é positivo,
//negativo ou zero. Exiba uma mensagem apropriada para cada caso.
public class Ex1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = sc.nextInt();

        if ( n >= 1 )
        {
            System.out.println("Positivo");
        } else if ( n < 0)
        {
            System.out.println("Negativo");
        }
        else
        {
            System.out.println( "Número digitado é 0" );
        }
    }
}
