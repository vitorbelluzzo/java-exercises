package ControlStructure;

/*
Exercícios com Estruturas de Controle

Maior entre Três Números
Peça ao usuário para inserir três números e exiba o maior deles.

Verificação de Número Primo
Peça ao usuário para inserir um número e verifique se ele é primo.

Fatorial
Peça ao usuário para inserir um número e calcule o fatorial desse número.

Sequência de Fibonacci
Peça ao usuário para inserir um número e exiba a sequência de Fibonacci até esse número.

Conversão de Temperatura
Crie um programa que converta temperaturas entre Celsius e Fahrenheit.

*/


import java.util.Scanner;

public class ControlStructureExercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // maiorEntreTres();
       // verificaçãoNumeroPrimo();
        fatorial();
        scanner.close();
    }

    public static void maiorEntreTres() {
        Integer primeiro = scanner.nextInt();
        Integer segundo = scanner.nextInt();
        Integer terceiro = scanner.nextInt();


        if (primeiro > segundo && primeiro > terceiro) {
            System.out.println(primeiro);
        } else if (segundo > primeiro && segundo > terceiro) {
            System.out.println(segundo);
        } else if (terceiro > primeiro && terceiro > segundo) {
            System.out.println(terceiro);
        }
    }

    public static void verificaçãoNumeroPrimo() {
        Integer thisnumber = scanner.nextInt();

        if (thisnumber <= 1) {
            System.out.println("notCousin");
            return;
        }
        for (int i = 2; i <= Math.sqrt(thisnumber) ; i++) {
            if (thisnumber % i == 0) {
                System.out.println("notCousin");
            }
        }
            System.out.println("cousin");

    }

    public static void fatorial() {
        Integer numeroFatorial = scanner.nextInt();
        Integer resultadoAtual = numeroFatorial;

        for (int i = numeroFatorial; i > 0 ; i--) {
            Integer valorMenor = i-1;
            if (valorMenor == 0) {
                System.out.println(resultadoAtual);
                return;
            }
            Integer conta = resultadoAtual * valorMenor;
            resultadoAtual = conta;
        }

        System.out.println(resultadoAtual);
    }

    public static void fibonacci() {

    }

}
