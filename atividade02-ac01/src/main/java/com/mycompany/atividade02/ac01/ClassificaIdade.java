package com.mycompany.atividade02.ac01;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class ClassificaIdade {

    void exibirIdadeClassificada(Integer idadeInserida) {

        if (idadeInserida <= 2) {
            exibirFraseInicial();
            System.out.println("Bebê");
            pularLinha();
        } else if (idadeInserida <= 11) {
            exibirFraseInicial();
            System.out.println("Criança");
            pularLinha();
        } else if (idadeInserida <= 19) {
            exibirFraseInicial();
            System.out.println("Adolescente");
            pularLinha();
        } else if (idadeInserida <= 30) {
            exibirFraseInicial();
            System.out.println("Jovem");
            pularLinha();
        } else if (idadeInserida <= 60) {
            exibirFraseInicial();
            System.out.println("Adulto");
            pularLinha();
        } else {
            exibirFraseInicial();
            System.out.println("Idoso");
            pularLinha();
        }
    }

    void exibirFraseInicial() {
        System.out.println("Você pertence a faixa etária: ");
    }
    
    void pularLinha(){
        System.out.println("\n");
    }
}
