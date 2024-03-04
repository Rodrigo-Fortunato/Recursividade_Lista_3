package ex01.view;
import ex01.controller.Ex01_Controller;

public class Ex01_View {
    public static void main(String[] args) {
        Ex01_Controller QuantD = new Ex01_Controller();

        int num=3500000;

        System.out.println(QuantD.QuantDigitos(num));
    }
}
