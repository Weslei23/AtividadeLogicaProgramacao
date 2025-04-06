package Cap3;
//Crie um programa que leia três números inteiros e verifique se pelo menos um deles é
//maior que 10 (usando o operador ||). Em seguida, verifique se todos são maiores que 10
//(usando o operador &&).

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite um número: ");
        int n2 = sc.nextInt();

        System.out.println("Digite um número: ");
        int n3 = sc.nextInt();

        if( n1 > 10 || n2 > 10 || n3 > 10 ){
            System.out.println("Pelo menos um número é maior que 10");
        }else{
            System.out.println("Nenhum número é menor que 10");
        }

        if( n1 > 10 && n2 > 10 && n3 > 10 ){
            System.out.println("Todos os números são maiores que 10");
        }else{
            System.out.println("Nenhum dos números são maiores que 10");
        }

    }
}
