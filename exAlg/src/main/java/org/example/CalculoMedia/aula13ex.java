package org.example.aula13;

import java.util.Scanner;

public class aula13ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas notas deseja informar? ");
        int qtdNotas = scan.nextInt();

        double[] notas = lerNotas(scan, qtdNotas);
        double media = calcMedia(notas);

        System.out.printf("A média das notas foram de: %.2f \n",media);

        scan.close();

    }

    public static double[] lerNotas(Scanner scan, int qtdNotas) {
        double[] notas = new double[qtdNotas];
        for (int c = 0; c < qtdNotas; c++) {
            System.out.print("Diga a nota " + (c + 1) + ": ");
            while (!scan.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, digite um número válido!");
            scan.next();
            }
            notas[c] = scan.nextDouble();
        }
        return notas;
    }

    public static double calcMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
