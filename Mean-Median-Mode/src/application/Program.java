package application;

import entities.Calculate;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números terão a sua sequência? ");
        int n = input.nextInt();
        int[] vector = new int[n];

        System.out.println();
        System.out.println("Digite a sequência de números: ");
        for (int i = 0; i < vector.length; i++){
            System.out.print(" - ");
            vector[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Sequência númerica digitada: ");
        for (int vt : vector) {
            System.out.print(vt + " ");
        }
        System.out.println();

        System.out.printf("Média: %.2f\n", Calculate.mean(vector));
        System.out.println("Mediana: " + Calculate.median(vector));
        System.out.println("Moda: " + Calculate.mode(vector));

        input.close();
    }
}
