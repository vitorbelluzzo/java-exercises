import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Main somaDeDoisNumeros = new Main();
        somaDeDoisNumeros.somaDeDoisNumeros();
    }





    public void somaDeDoisNumeros() { //método instanciavel = nao utiliza static, para utiliza-lo, é necessário criar uma instancia com Main metodo = new Main(); e entao metodo.somaDeDoisNumeros();
        Scanner scanner = new Scanner(System.in);
        Integer primeiroNumero = scanner.nextInt();
        Integer segundoNumero = scanner.nextInt();
        Integer soma = primeiroNumero + segundoNumero;
        System.out.println(soma);
    }
    public static void somaDeNumeros() { //método estatico =  para utiliza-lo, apenas declare na main sem criar instancia,
        Scanner scanner = new Scanner(System.in);
        Integer primeiroNumero = scanner.nextInt();
        Integer segundoNumero = scanner.nextInt();
        Integer soma = primeiroNumero + segundoNumero;
        System.out.println(soma);
    }


}