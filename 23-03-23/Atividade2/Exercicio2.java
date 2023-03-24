package Atividade2;

import java.util.Scanner;

public class Exercicio2 {
    Scanner sc = new Scanner(System.in);

    public void exercicio() {
        System.out.println("Digite o n de matricula do primeiro Aluno");
        int matricula = sc.nextInt();
        if (matricula / 4 == 0) {
            System.out.println("O Aluno esta no Time do Chris");
        } else if (matricula / 4 == 1) {
            System.out.println("O Aluno esta no Time do Greg");
        } else if (matricula / 4 == 2) {
            System.out.println("O Aluno esta no Time do Caruso");
        } else {
            System.out.println("O Aluno esta no Time do Jerome");
        }

    }
}
