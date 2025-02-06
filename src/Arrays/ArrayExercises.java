package Arrays;

/*
Exercícios com Arrays

Soma de Elementos de um Array
Crie um array de números e calcule a soma de todos os elementos.

Maior e Menor Valor em um Array
Encontre o maior e o menor valor em um array de números.

Inversão de Array
Crie um programa que inverta a ordem dos elementos em um array.

Busca de Elemento em um Array
Peça ao usuário para inserir um número e verifique se ele está presente em um array predefinido.

Ordenação de Array
Implemente um algoritmo de ordenação (como Bubble Sort) para ordenar um array de números.

*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayExercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  SomadeElementosdeumArray();
        //  MaioreMenorValoremumArray();
        //  InversaodeArray();
        BuscadeElementoemumArray();
        scanner.close();
    }

    public static void SomadeElementosdeumArray() {
        int[] elementos = {2, 4, 6, 8, 10, 12};
        int resultadoSoma = Arrays.stream(elementos).sum();

        System.out.println(resultadoSoma);
    }

    public static void MaioreMenorValoremumArray() {
        int[] elementos = {2, 4, 6, 68, 10, 12};
        int maiorNumero = Arrays.stream(elementos).max().getAsInt();
        int menorNumero = Arrays.stream(elementos).min().getAsInt();

        System.out.println("O maior número do array é: " + maiorNumero + ", e o menor é: " + menorNumero);
    }

    public static void InversaodeArray() {
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        int tamanhoArray = array.length;
        int[] arrayInvertido = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            arrayInvertido[i] += array[tamanhoArray - 1 - i];

        }
        System.out.println(Arrays.toString(arrayInvertido));
    }

    public static void BuscadeElementoemumArray() {
        int[] arrayPredefinido = {2, 4, 6, 8, 10};
        int numeroInserido = scanner.nextInt();

        for (int i = 0; i < arrayPredefinido.length; i++) {
            if (numeroInserido == arrayPredefinido[i]) {
                System.out.println("está presente na posição " + i + " da array");
            }
        }
        System.out.println("não está presente na array");
    }

    public static void OrdenacaodeArray() {

    }
    //Ordenação de Array
    //Implemente um algoritmo de ordenação (como Bubble Sort) para ordenar um array de números.

}
