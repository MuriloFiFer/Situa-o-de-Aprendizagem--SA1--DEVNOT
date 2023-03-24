package Atividade1;

import java.util.Scanner;

public class Exercicio1 {
    Scanner sc = new Scanner(System.in);

    public void exercicio() {
        float resultado;
        System.out.println("Digite o primeiro numero decimal");
        float numero1 = sc.nextFloat();
        System.out.println("Digite o segundo numero");
        float numero2 = sc.nextFloat();
        System.out.println("Escolha 1 para Soma, 2 para Subtração, 3 para Multiplicação e 4 para Divisão:");
        int numeroEscolha = sc.nextInt();
        if (numeroEscolha == 1) {
            resultado = (numero1 + numero2);
            System.out.println("O Reusltado é" + resultado);
        } else if (numeroEscolha == 2) {
            resultado = (numero1 - numero2);
            System.out.println("O Resultado é" + resultado);
        } else if (numeroEscolha == 3) {
            resultado = (numero1 * numero2);
            System.out.println("O Resultado é" + resultado);
        } else if (numeroEscolha == 4) {
            resultado = (numero1 / numero2);
            System.out.println("O Resultado é" + resultado);
        }
    }

}