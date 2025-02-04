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
        // fatorial();
        // fibonacci();
        //conversorDeTemperatura();
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
        for (int i = 2; i <= Math.sqrt(thisnumber); i++) {
            if (thisnumber % i == 0) {
                System.out.println("notCousin");
            }
        }
        System.out.println("cousin");

    }

    public static void fatorial() {
        Integer numeroFatorial = scanner.nextInt();
        Integer resultadoAtual = numeroFatorial;

        for (int i = numeroFatorial; i > 0; i--) {
            Integer valorMenor = i - 1;
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
        Integer numero = scanner.nextInt();

        Integer a = 0;
        Integer b = 1;

        while (a <= numero) {
            System.out.println(a + " ");
            Integer temporario = a;
            a = b;
            b = temporario + b;
        }
    }

    public static void conversorDeTemperatura() {
        System.out.println("Digite o número correspondente a conversão que deseja realizar:  1-Celsius para Fahrenheit,  2-Fahrenheit para Celsius");
        Integer escolherOperacao = scanner.nextInt();

        System.out.println("Digite a temperatura: ");
        Integer temperatura = scanner.nextInt();


        switch (escolherOperacao) {
            case 1:
                int conversaoFahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "ºC equivale à " + conversaoFahrenheit + "ºF");
                break;
            case 2:
                int conversaoCelsius = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + "ºF equivale à " + conversaoCelsius + "ºC");
                break;
        }
    }

}
