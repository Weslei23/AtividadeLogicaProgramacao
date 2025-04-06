package Cap3;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro e verifique se ele está entre 10 e 20
//(inclusive). Exiba uma mensagem informando se o número está dentro ou fora do intervalo.
public class Ex20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if ( num >= 10 && num <= 20 )
        {
            System.out.println("Está dentro do intervalo!");
        }else {
            System.out.println("Está fora do intervalo!");
        }

        sc.close();
    }
}
