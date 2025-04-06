package Cap3;

import java.util.Scanner;

//Crie um programa que leia dois números inteiros e exiba se o primeiro é maior, menor ou
//igual ao segundo.
public class Ex16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        if(numero1 > numero2){
            System.out.println(numero1 + " é maior que " + numero2);
        }else if(numero1 < numero2){
            System.out.println(numero1 + " é menor que " + numero2);
        }else {
            System.out.println("Os dois números são iguais!");
        }

    }
}
