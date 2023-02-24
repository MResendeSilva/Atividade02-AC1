package com.mycompany.atividade02.ac01;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class CalculoNutricao {
    Double calculaIMC (Double alturaInserida,Double pesoInserido){
        return pesoInserido / (alturaInserida * alturaInserida);
    }
    
    void pularLinha(){
        System.out.println("\n");
    }
}
