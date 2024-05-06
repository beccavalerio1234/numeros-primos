package salariomedia;

import java.util.Scanner;

public class intercalado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Preenchendo o primeiro vetor
        int[] vetor1 = new int[10];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }
        
        // Preenchendo o segundo vetor
        int[] vetor2 = new int[10];
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scanner.nextInt();
        }
        
        // Intercalando os vetores
        int[] vetorIntercalado = new int[20];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[index++] = vetor1[i];
            vetorIntercalado[index++] = vetor2[i];
        }
        
        // Mostrando o vetor resultante
        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
        
        scanner.close();
    }
}
