package ex05.controller;
/*Escrever uma função recursiva que, dado uma posição da série, a função retorne seu valor.
        Entrada limitada a 20*/
public class Ex05_Controller {
    public Ex05_Controller(){
        super();
    }

    public int fibonacci(int num){
        if (num > 2){
            return fibonacci(num-1) + fibonacci(num -2);
        }else {
            return 1;
        }

    }

}
