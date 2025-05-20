package Cap4;
//Escreva um programa que leia a temperatura atual em graus Celsius e exiba
//uma mensagem dizendo se o clima está "Frio" (abaixo de 15ºC),
//"Agradável" (entre 15ºC e 30ºC) ou "Quente" (acima de 30ºC).

import java.util.Scanner;

public class Ex7
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite a temperatura atual: " );
        int temperatura = sc.nextInt();

        if( temperatura < 15 )
        {
            System.out.println( "Está fazendo frio" );
        }
        else if( temperatura > 15 && temperatura < 30  )
        {
            System.out.println( "Temperatura agradável ");
        }
        else
        {
            System.out.println( "Temperatura está quente" );
        }

        sc.close();
    }
}
