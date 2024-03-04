package ex02.controller;
/*Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10
        a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas
        vezes o 2o número aparece no primeiro.*/
public class Ex02_Controller {
    public Ex02_Controller(){
        super();
    }
    public int VezesPresente (int primeiroNum, int segundoNum){
        //Condicional de parada, encerrando a recursiva quando
        if (primeiroNum==0 /*&& primeiroNum < 10*/){
            return 0;
        }else if (primeiroNum % 10 == segundoNum ){
            return 1+VezesPresente(primeiroNum/10,segundoNum);
        }else{
            return VezesPresente(primeiroNum/10,segundoNum);
        }


    }

}
