package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class TesteCalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao calcIMC = new CalculoNutricao();

        Integer selecao;
        do {
            calcIMC.pularLinha();
            System.out.println("Bem vindo à calculadora de IMC\n"
                    + "Selecione uma das opções:\n"
                    + "1 - calcular IMC\n"
                    + "0 - sair");
            selecao = leitor.nextInt();

            switch (selecao) {
                case 1:
                    System.out.println("Quantas pessoas irão comparar o IMC?");
                    Integer quantidadePessoa = leitor.nextInt();

                    for (int i = 1; i <= quantidadePessoa; i++) {
                        System.out.println(
                                String.format("Insira a altura da pessoa %d:", i));
                        Double alturaInserida = leitor.nextDouble();
                        System.out.println(
                                String.format("Insira o peso da pessoa %d:", i));
                        Double pesoInserido = leitor.nextDouble();
                        calcIMC.calculaIMC(alturaInserida, pesoInserido);
                        System.out.println(
                                String.format("O IMC da pessoa %d é %.2f", i,
                                        calcIMC.calculaIMC(alturaInserida, pesoInserido)));
                        calcIMC.pularLinha();
                    }

                    break;

                case 0:
                    System.out.println("Encerrando calculadora");
                    break;
                default:
                    System.out.println("Opção inválida! Insira novamente");
                    ;
            }
        } while (!selecao.equals(0));
    }
}
