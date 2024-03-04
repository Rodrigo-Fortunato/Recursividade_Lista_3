package ex02.view;
import ex02.controller.Ex02_Controller;

import java.util.Scanner;

public class Ex02_View {
    public static void main(String[] args) {
        Ex02_Controller quantVezes = new Ex02_Controller();
        Scanner scan = new Scanner(System.in);

        int PrimeiroNum=0;
        int SegundoNum=0;
        boolean Intervalo = false;



            while (Intervalo == false) {
                System.out.println("Digite um primeiro número entre 10 e 999999:");
                PrimeiroNum = scan.nextInt();
                if (PrimeiroNum >= 10 && PrimeiroNum <= 999999) {
                    System.out.println("Digite um segundo número entre 0 e 9:");
                    SegundoNum = scan.nextInt();
                    if (SegundoNum >= 1 && SegundoNum <= 9) {
                        Intervalo = true;
                    }else{
                        System.out.println("Número invalido.");
                    }

                } else {
                    System.out.println("Número invalido.");
                }
            }

        System.out.println("O Segundo número aparece:"+quantVezes.VezesPresente(PrimeiroNum,SegundoNum)+" vezes no Primeiro número.");


    }
}
