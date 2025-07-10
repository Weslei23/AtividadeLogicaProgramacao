package Cap4;

import java.util.Scanner;

/*
Escreva um programa que leia um número de 1 a 4 e exiba o nome da estação
do ano correspondente:
● 1: Verão
● 2: Outono
● 3: Inverno
● 4: Primavera
 */
public class Ex14
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite um número de 1 a 4 " );
        int n1 = sc.nextInt();

        if( n1 == 1 )
        {
            System.out.println( "Verão" );
        }
        else if( n1 == 2 )
        {
            System.out.println( "Outono" );
        }
        else if( n1 == 3 )
        {
            System.out.println( "Inverno" );
        }
        else if( n1 == 4 )
        {
            System.out.println( "Primavera" );
        }
        else
        {
            System.out.println( "Erro" );
        }
    }
}
