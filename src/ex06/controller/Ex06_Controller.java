package ex06.controller;
/*Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
        inteiro (N), apresente a saída da somatória*/
public class Ex06_Controller {
    public Ex06_Controller(){
        super();
    }


    public double somaFatorial(int num){
        if (num ==1){
            return 1;
        }else{
            return (1/fatorial(num)) + somaFatorial(num-1);
        }
    }
    public double fatorial(int numFat){
        if (numFat ==1){
            return 1;
        }else {
            return numFat * fatorial(numFat-1);
        }
    }

}
