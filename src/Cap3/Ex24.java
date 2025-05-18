package Cap3;

import java.util.Scanner;

//Crie um programa que leia um ano e verifique se ele é bissexto. Um ano é bissexto se for
//divisível por 4, mas não por 100, exceto se for divisível por 400.
public class Ex24
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite o ano que deseja verificar se é bissexto: " );
        int ano = sc.nextInt();

        if ( ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) || ( ano % 400 == 0) )
        {
            System.out.println( "É um ano bissexto" );
        }
        else
        {
            System.out.println( "Não é um ano bissexto" );
        }
    }
}
