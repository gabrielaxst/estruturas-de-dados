import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tamanho da sequência fibonacci: ");
        int n = input.nextInt();

        System.out.println("Sequência de fibonacci: ");
        printFibonacci(fibonacci(n));

        System.out.println("Sequência de finabonacci apenas dos nº pares: ");
        printEvenFibonacci(fibonacci(n));

    }
    public static int[] fibonacci(int x){
        int[] vector = new int[x];

        for (int i =0; i < x; i++){
            if (i <= 1 ){
                vector[i] = i;
            }
            else {
                vector[i] = vector[i - 1] + vector[i - 2];
            }

        }
        return vector;
    }
    public static void printEvenFibonacci(int[] vector){
        for (int i = 0; i < vector.length; i++){
            if (i <= 1){
                System.out.print(vector[i] + " ");
            }
            else {
                boolean verification = (vector[i -1] + vector[i -2]) % 2 == 0;
                if (verification) {
                    System.out.print(vector[i] + " ");
                }
            }

        }
    }
    public static void printFibonacci(int[] vect){
        for (int vt : vect){
            System.out.print(vt + " ");
        }
        System.out.println();
    }
}


