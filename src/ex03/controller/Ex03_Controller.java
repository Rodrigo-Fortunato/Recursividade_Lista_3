package ex03.controller;
/*Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres
        (Ex.: entrada = teste ; saída = etset):*/
public class Ex03_Controller {
    public Ex03_Controller(){
        super();
    }

    public String invertor(String palavra, int tamanho){
        if (tamanho==0){
            return "";
        }else {
            return palavra.substring(tamanho-1,tamanho) + invertor(palavra, tamanho - 1) ;

        }

    }

}
