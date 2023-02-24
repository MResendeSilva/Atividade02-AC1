package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class TesteIdade {

    public static void main(String[] args) {
        
        Scanner leitorIdade = new Scanner(System.in);
        ClassificaIdade classificarIdade = new ClassificaIdade();

        System.out.println("Insira sua idade e descubra sua classificação:");
        Integer idadeInserida = leitorIdade.nextInt();
        classificarIdade.exibirIdadeClassificada(idadeInserida);
    }
}
