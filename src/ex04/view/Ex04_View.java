package ex04.view;

import ex04.controller.Ex04_Controller;

import java.util.Scanner;

public class Ex04_View {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ex04_Controller ex = new Ex04_Controller();

        int num;

        System.out.println("Digite um número: (Número Maximo:2000)");
        num = scan.nextInt();

        System.out.println(ex.ConvertBinario(num));


    }
}
