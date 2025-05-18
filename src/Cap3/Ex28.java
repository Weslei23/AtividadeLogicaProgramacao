package Cap3;

import java.util.Scanner;

//Desenvolva um programa que leia cinco números inteiros do usuário, um por
//vez, e acumule a soma deles usando o operador de atribuição +=.
//Exiba o total acumulado ao final.
//Dica: Utilize o Scanner para pedir os dados, e você pode utilizar um loop for para repetir a
//solicitação de dados cinco vezes.
public class Ex28
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        int valor = 0;

        for ( int i = 0 ; i < 5 ; i++ )
        {
            System.out.println( "Digite o valor " + 1+ ": " );
            int valor1 = sc.nextInt();
            valor += valor1;
        }
        System.out.println( valor );
    }
}
