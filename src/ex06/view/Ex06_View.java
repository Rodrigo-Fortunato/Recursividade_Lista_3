package ex06.view;
import ex06.controller.Ex06_Controller;

import java.util.Scanner;

public class Ex06_View {
    public static void main(String[] args) {
        Ex06_Controller somaFibo = new Ex06_Controller();
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número para a sequencia de somas: ");
        num = scan.nextInt();

        System.out.println(somaFibo.somaFatorial(num));

    }
}
