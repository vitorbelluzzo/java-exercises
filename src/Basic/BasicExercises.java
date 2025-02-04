package Basic;

import java.util.Scanner;

    /*
    Hello World
    - Crie um programa que imprima "Hello, World!" no console.

    Soma de Dois Números
    - Peça ao usuário para inserir dois números e exiba a soma deles.

    Verificação de Número Par ou Ímpar
    - Peça ao usuário para inserir um número e determine se ele é par ou ímpar.

    Calculadora Simples
    - Crie uma calculadora que permita ao usuário escolher entre adição, subtração, multiplicação e divisão de dois números.

    Tabuada
    - Peça ao usuário para inserir um número e exiba a tabuada desse número de 1 a 10.
*/


public class BasicExercises {

    public static void main(String[] args) {

        System.out.println("Hello, World!"); //-1
        somaDeNumeros(); //-2 estatico
        BasicExercises somaDeDoisNumeros = new BasicExercises(); // -2 instancia
        somaDeDoisNumeros.somaDeDoisNumeros();
        verificador();
        calcSimples();
        tabuada();

    }

    public void somaDeDoisNumeros() {  /* método instanciavel = nao utiliza static, para utiliza-lo, é necessário criar uma instancia com Main metodo = new Main(); e entao metodo.somaDeDoisNumeros(); */
        Scanner scanner = new Scanner(System.in);
        Integer primeiroNumero = scanner.nextInt();
        Integer segundoNumero = scanner.nextInt();
        Integer soma = primeiroNumero + segundoNumero;
        System.out.println(soma);
    }

    public static void somaDeNumeros() { /* método estatico =  para utiliza-lo, apenas declare na main sem criar instancia. */
        Scanner scanner = new Scanner(System.in);
        Integer primeiroNumero = scanner.nextInt();
        Integer segundoNumero = scanner.nextInt();
        Integer soma = primeiroNumero + segundoNumero;
        System.out.println(soma);
    }

    public static void verificador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou ímpar:");
        Integer numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

    }

    public static void calcSimples() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação que deseja realizar pelo seguinte número: 1-adição, 2-subtração, 3-multiplicação, 4-divisão ");

        Integer escolherOperacao = scanner.nextInt();


        if (escolherOperacao < 1 || escolherOperacao > 4) {
            System.out.println("escolha entre 1 a 4");
            calcSimples();
            return;
        }

        System.out.println("digite o primeiro número");
        Integer primeiroNumero = scanner.nextInt();

        System.out.println("digite o segundo número");
        Integer segundoNumero = scanner.nextInt();

        switch (escolherOperacao) {
            case 1:
                System.out.println(primeiroNumero + segundoNumero);
                break;
            case 2:
                System.out.println(primeiroNumero - segundoNumero);
                break;
            case 3:
                System.out.println(primeiroNumero * segundoNumero);
                break;
            case 4:
                if (segundoNumero == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    System.out.println(primeiroNumero / segundoNumero);
                }
                break;

        }

    }

    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver sua tabuada:");
        Integer numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
        System.out.println("Tabuada finalizada!");
    }

}



