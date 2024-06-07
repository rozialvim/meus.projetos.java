import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroQualquer;
        int numeroUsuario = -1; // Inicializa com um valor que não seja possível adivinhar.

        numeroQualquer = random.nextInt(11); // Gera um número entre 0 e 10.

        while (numeroQualquer != numeroUsuario) {
            System.out.print("Tente acertar o número de 0 a 10: ");
            numeroUsuario = scanner.nextInt();
            if (numeroQualquer == numeroUsuario) {
                System.out.println("Você acertou, o número qualquer é: " + numeroQualquer);
            } else {
                System.out.println("Você errou!");
            }
        }

        scanner.close();
    }
}
