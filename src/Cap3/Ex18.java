package Cap3;

import java.util.Scanner;

//Desenvolva um programa que leia três números inteiros e exiba o maior deles.
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite um número: ");
        int n2 = sc.nextInt();

        System.out.println("Digite um número: ");
        int n3 = sc.nextInt();

        if(n1 > n2 || n1 > n3){
            System.out.println( n1 + " é maior");
        } else if(n2 > n3 || n2 > n1){
            System.out.println( n2 + " é maior");
        } else if(n3 > n2 || n3 > n1){
            System.out.println( n3 + " é maior");
        }else {
            System.out.println("Erro");
        }

    }
}
