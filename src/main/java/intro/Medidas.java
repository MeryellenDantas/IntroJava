// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas


import javax.swing.*;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    // args é uma variável, ela funciona como uma caixinha em que você vai guardar as informações para usar depois
    public static void main(String[] args){
        System.out.println("Cálculo de Areas");


        // Calculo de area reduzida


    }

    public void calcularAreaModoExtenso(){
        // Calculo de area - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 5 unidades
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m2");

    }

    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura*comprimento + "m2");

    }
}
