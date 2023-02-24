package com.mycompany.atividade02.ac01;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class DescontoProgressivo {

    Double calcularDesconto(Double valorUnitarioInserido,
            Integer quantidadeInserida) {

        Double desconto;
        Double valorTotalBruto = valorUnitarioInserido * quantidadeInserida;

        if (quantidadeInserida.equals(1)) {
            desconto = valorTotalBruto * 0.1;
        } else if (quantidadeInserida.equals(2)) {
            desconto = valorTotalBruto * 0.2;
        } else {
            desconto = valorTotalBruto * 0.3;
        }

        return valorTotalBruto - desconto;
    }

    void plotarSeparacao() {
        System.out.println("--------------------------------------");
    }

    void exibirNotaFiscal(Double valorUnitarioInserido,
            Integer quantidadeInserida) {

        plotarSeparacao();
        System.out.println(
                String.format("Valor do produto: %.2f", valorUnitarioInserido));
        System.out.println(
                String.format("Quantidade: %d", quantidadeInserida));
        plotarSeparacao();
        System.out.println(
                String.format("Valor com desconto: %.2f",
                        calcularDesconto(valorUnitarioInserido,
                                quantidadeInserida)));
    }
}
