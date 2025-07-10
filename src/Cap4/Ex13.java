package Cap4;

import java.util.Scanner;

/*
Desenvolva um programa que leia dois números e um operador (+,-, *,/)
e realize a operação correspondente. Exiba o resultado no console.
 */
public class Ex13
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Qual operação deseja efetuar?" );
        System.out.println( "1 - Soma" );
        System.out.println( "2 - Subtracao" );
        System.out.println( "3 - Multiplicacao" );
        System.out.println( "4 - Divisao" );
        String op = sc.nextLine();

        System.out.println( "Digite um valor: " );
        double valor = sc.nextDouble();

        System.out.println( "Digite outro valor: " );
        double valor2 = sc.nextDouble();

        if( op.equals( "1" ) )
        {
            System.out.println( valor + valor2 );
        }
        else if( op.equals( "2" ) )
        {
            System.out.println( valor - valor2 );
        }
        else if( op.equals( "3" ) )
        {
            System.out.println( valor * valor2 );
        }
        else if( op.equals( "4" ) )
        {
            System.out.println( valor / valor2 );
        }
        else
        {
            System.out.println( "Erro!" );
        }
    }
}
