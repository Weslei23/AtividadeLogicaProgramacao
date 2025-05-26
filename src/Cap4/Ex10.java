package Cap4;

import java.util.Scanner;

//Crie um programa que leia a velocidade de um veículo e exiba uma mensagem
//dizendo se o veículo está dentro do limite de velocidade (até 60 km/h), acima do limite
//(entre 61 km/h e 80 km/h) ou muito acima do limite (acima de 80 km/h).
public class Ex10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Digite uma velocidade: " );
        int velocidade = sc.nextInt();

        if ( velocidade <= 60 )
        {
            System.out.println( "Voce está dentro do limite de velocidade!" );
        }
        else if ( velocidade > 61 && velocidade < 80 )
        {
            System.out.println( "Voce esta acima do limite de velocidade!" );
        }
        else
        {
            System.out.println( "Voce está muito acima do limite de velocidade!" );
        }
    }
}
