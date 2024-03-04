package ex04.controller;
/*Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
        inteiro, converta para binário. Entrada limitada a 2000.*/
public class Ex04_Controller {
    public Ex04_Controller(){
        super();
    }

    public String ConvertBinario(int num){

        if (num < 2){
            return String.valueOf(num);
        }else {
            return  ConvertBinario(num/2)+num % 2;
        }
    }

}
