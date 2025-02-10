package bradescoJavaCloudNative;

import java.util.Scanner;

public class ExplorandoaSintaxeJava {
    private static Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {
            //calculoSaldoAtual();
           // classificacaoClientePorSaldo();
            scanner.close();
        }

    public static void classificacaoClientePorSaldo() {
        /*classifique os clientes de um banco baseado no saldo
         *  entrada do saldo = -50
         *  saida pode ser 3 = negativado -> saldos abaixo de zero
         *                     baixo -> saldos entre 0 e 500
         *                     confortavel -> saldos acima de 500
         *
         * */

            double saldo = scanner.nextDouble();
        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo < 500) {
            System.out.println("Baixo");
        } else if (saldo > 500) {
            System.out.println("Confortavel");
        }

    }

    public static void calculoSaldoAtual() {
            double saldoInicial = scanner.nextDouble();

            // TODO: Na linha abaixo, implemente a entrada das três transações:

            double firstTransaction = scanner.nextDouble();
            double secondTransaction = scanner.nextDouble();
            double thirdTransaction = scanner.nextDouble();

            if(firstTransaction > 0) {
                saldoInicial += firstTransaction;
            } else if(firstTransaction < 0) {
                saldoInicial += firstTransaction;
            };

            if(secondTransaction > 0) {
                saldoInicial += secondTransaction;
            } else if (secondTransaction < 0) {
                saldoInicial += secondTransaction;
            };

            if(thirdTransaction > 0) {
                saldoInicial += thirdTransaction;
            } else if  (thirdTransaction < 0) {
                saldoInicial += thirdTransaction;
            };






            // TODO: Na linha abaixo, realize o cálculo do saldo final:

            // Saldo final
            System.out.printf("%.2f\n", saldoInicial);
        }
    }

