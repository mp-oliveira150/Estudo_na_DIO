package edu.mp_oliveira.aprendendo_sintaxe_java_DIO.estruturasderepaticaoearraysemjava;

import java.util.Scanner;

public class Ex3_maior_e_media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int soma = 0;
        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma = soma + numero;
            count++;
        }while (count < 5);
        float media = (float) soma/count;
        System.out.printf("A soma dos números é: %s \n" , soma);
        System.out.printf("O maior número é: %s \n" , maior);
        System.out.printf("A média dos 5 números é: %.3f", media);

    }
}
