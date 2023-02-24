package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class CalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalcularMedia calcMedia = new CalcularMedia();
        
        System.out.println("Insira as notas do aluno:");
        System.out.println("Nota 01:");
        Double nota01 = leitor.nextDouble();
        System.out.println("Nota 02:");
        Double nota02 = leitor.nextDouble();
        
        Double mediaFinal = calcMedia.calculoMedia(nota01, nota02);
        System.out.println(
                String.format("Sua média final é: %.2f", mediaFinal));
    }
}
