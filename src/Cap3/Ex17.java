package Cap3;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        sc.close();
    }
}
