package ex03.view;

import ex03.controller.Ex03_Controller;
public class Ex03_View {
    public static void main(String[] args) {
        Ex03_Controller inversorString = new Ex03_Controller();

        String palavra = "abacate azul";
        int tamanho;
        tamanho = palavra.length();


        System.out.println(inversorString.invertor(palavra,tamanho));




    }
}
