package ex01.controller;
/*Crie uma função recursiva que exiba a quan�dade de dígitos de um número inteiro passado como
        parâmetro:*/
public class Ex01_Controller {
    public Ex01_Controller(){
        super();
    }

    public int QuantDigitos(int num){
        if (num < 10){
            return 1;
        }else{
            return 1+QuantDigitos(num/10);
        }
    }




}
