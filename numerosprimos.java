package salariomedia;

import java.util.Scanner;

public class numerosprimos {
    // Método para verificar se um número é primo
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int[] vetor = new int[9];

			// Preenchendo o vetor com valores fornecidos pelo usuário
			System.out.println("Digite 9 números inteiros:");
			for (int i = 0; i < 9; i++) {
			    vetor[i] = scanner.nextInt();
			}

			System.out.println("Números primos e suas respectivas posições:");

			// Verificando e exibindo os números primos e suas posições
			for (int i = 0; i < 9; i++) {
			    if (isPrime(vetor[i])) {
			        System.out.println("Número primo: " + vetor[i] + ", posição: " + i);
			    }
			}
		}
    }
}
