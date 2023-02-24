package com.mycompany.atividade02.ac01;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class ValidacaoNumerica {

    String verificarPrimo(Integer numeroInserido) {
        Integer contador = 0;
        String frase;

        for (int i = 1; i <= numeroInserido; i++) {

            if (numeroInserido % i == 0) {
                contador++;
            }
        }
        
        if (contador.equals(2)) {
            frase = "é primo!";
        } else {
            frase = "não é primo";
        }
        
       return frase;
    }
    
    void pularLinha(){
        System.out.println("\n");
    }

}
