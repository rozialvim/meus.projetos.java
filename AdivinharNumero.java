import java.util.Random;
import java.util.Scanner;
public class AdivinharNumero {
    public static void main(String[]args){
        Random  random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroQualquer; int numeroUsuario = 0;
        numeroQualquer = random.nextInt(10);
        while(numeroQualquer!=numeroUsuario); {
            System.out.print(" Tente acertar o número de 0 a 10:");
            numeroUsuario = scanner.nextInt();
        }
        if (numeroQualquer==numeroUsuario); {
               System.out.println("Você acertou!");
               scanner.close();
    }
    }
}
