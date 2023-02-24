package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class TesteValidacaoNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica valPrimo = new ValidacaoNumerica();
        Integer numeroInserido = 0;

        System.out.println("Bem vindo(a) ao monitoramento de números primos!\n"
                + "Digite um número inteiro e veja se o número é "
                + "primo ou não.\nPara encerrar o programa, basta digitar um "
                + "número negativo!");
        while (true) {
            System.out.println("Insira um número: ");
            numeroInserido = leitor.nextInt();
            if (numeroInserido < 0) {
                System.out.println("Encerrando o programa!");
                break;
            } else {
                System.out.println(String.format("O número %d %s",
                        numeroInserido, valPrimo.verificarPrimo(numeroInserido)));
                valPrimo.pularLinha();
            }
        }
    }
}
