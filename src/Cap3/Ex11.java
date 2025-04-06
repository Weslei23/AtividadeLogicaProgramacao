package Cap3;

import java.util.Scanner;

//Crie um programa que leia dois números inteiros do usuário e exiba a soma, subtração,
//multiplicação, divisão e o módulo desses números no console.
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Digite um número: ");
        int num2 = sc.nextInt();

        System.out.println(num+num2);
        System.out.println(num-num2);
        System.out.println(num/num2);
        System.out.println(num*num2);
        System.out.println(num%num2);

        sc.close();
    }
}
