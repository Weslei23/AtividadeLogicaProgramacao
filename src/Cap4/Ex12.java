package Cap4;
// Crie um programa que leia uma nota de 0 a 10 e classifique a nota de acordo
//com as seguintes categorias:
//● 10: Excelente
//● 8 e 9: Muito bom
//● 6 e 7: Bom
//● 5: Regular
//● 0 a 4: Insuficiente

import java.util.Scanner;

public class Ex12
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Digite uma nota de 0 a 10" );
        int nota = sc.nextInt();

        calcular( nota );

    }

    public static void calcular( int nota )
    {
        if( nota >= 0 && nota <= 4 )
        {
            System.out.println( "Insuficiente" );
        }
        else if( nota == 5 )
        {
            System.out.println( "Regular" );
        }
        else if( nota >= 6 && nota <= 7 )
        {
            System.out.println( "Bom" );
        }
        else if( nota >= 8 && nota <= 9 )
        {
            System.out.println( "Muito Bom" );
        }
        else if( nota == 10 )
        {
            System.out.println( "Excelente" );
        }
        else
        {
            System.out.println( "Nota invalida" );
        }
    }

}
