package Atividade3;

import java.util.Scanner;

public class Exercicio3 {
    Scanner sc = new Scanner(System.in);

    public void exercicio3() {
        double vlMorango = 2.50;
        double vlMaca = 1.80;
        double vlBanana = 1.30;
        System.out.println("Digite o numero em Kg de Morangos adquiridos");
        double quantMorangos = sc.nextDouble();
        System.out.println("Digite o numero em Kg de Morangos adquiridos");
        double quantMaca = sc.nextDouble();
        System.out.println("Digite o numero em Kg de Morangos adquiridos");
        double quantBanana = sc.nextDouble();
        double kgTotal = (quantMorangos + quantMaca + quantBanana);

        double vlCompraMo = (quantMorangos * vlMorango);
        double vlCompraMa = (quantMaca * vlMaca);
        double vlCompraBa = (quantBanana * vlBanana);
        double vlTotal = (vlCompraMo + vlCompraMa + vlCompraBa);
        double precoDesc = vlTotal - (vlTotal * 10 / 100);
        if (kgTotal > 8 || vlTotal > 25) {
            System.out.println("O Valor da compra é de:" + precoDesc);
        } else {
            System.out.println("O valor da compra é de:" + vlTotal);
        }

    }

}
