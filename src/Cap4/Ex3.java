package Cap4;

import java.util.Scanner;

//Desenvolva um programa que leia o valor de uma compra e aplique um
//desconto de 10% se o valor for superior a R$100,00. Exiba o valor final com ou sem
//desconto.
public class Ex3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if ( valor > 100.00 )
        {
            System.out.println( "O valor sem desconto é de: R$" + valor );
            double valorNovo = valor * 0.10;
            valor -= valorNovo;
            System.out.println("O valor com desconto de 10% será de: R$" + valor);
        }
    }
}
