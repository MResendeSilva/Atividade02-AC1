package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);
        DescontoProgressivo calcDesconto = new DescontoProgressivo();
        
        System.out.println("Bem ao sistema de desconto progressivo!\n");
        System.out.println("Digite o valor unitário do produto:");
        Double valorUnitarioInserido = produto.nextDouble();
        System.out.println("Insira a quantidade:");
        Integer quantidadeInserida = produto.nextInt();
        
        calcDesconto.exibirNotaFiscal(valorUnitarioInserido,quantidadeInserida);
        System.out.println("\n");
    }
}
