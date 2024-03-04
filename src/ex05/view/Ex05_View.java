package ex05.view;

import ex05.controller.Ex05_Controller;

import java.util.Scanner;

public class Ex05_View {
    public static void main(String[] args) {
        Ex05_Controller Fibonacci = new Ex05_Controller();
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número para a sequencia de Fibonacci: (Entrada limitada a 20)");
        num = scan.nextInt();
        System.out.println("O número na posição " + num + " da sequencia é: " + Fibonacci.fibonacci(num));
    }
}
