// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import javax.swing.*;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características
    // 3.2 - Métodos e Funções
    // args é uma variável, ela funciona como uma caixinha em que você vai guardar as informações para usar depois
    public static void main(String[] args){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do java para ler a escolha do usuário no console

        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S");
        System.out.println("c - Calcular Área Modo Curto: ");
        System.out.println("d - Contar até dez: ");
        System.out.println("e - Calcular Área Modo Extenso: ");
        System.out.println("i - ifSimples: ");
        System.out.println("r - Contagem regressiva de 10 a 0: ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // Switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "melancia";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método curto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método extenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimpes();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;

        }


    }

    public static void ifSimpes(){

        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Area Modo Curto");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura*comprimento + "m2");

    }

    
    public static void calcularAreaModoExtenso(){
        // Calculo de area - Exemplo: o tamanho do tapete ou do piso
        System.out.println("Cálculo de Area Modo Extenso");
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 5 unidades
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m2");

    }

 public static void contarAteDez(){

        // Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem Crescente");

        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
 }

 public static void contagemRegressiva(){
     System.out.println("Contagem Crescente");

     for (int numero = 10; numero > -1; numero--){
         System.out.println(numero);
     }
 }

}
