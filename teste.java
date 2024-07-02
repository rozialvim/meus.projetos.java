import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco números.");
        int contador = 0, numero = 0, soma = 0;
        while(contador < 5){
            numero = scanner.nextInt();
            contador++;
            soma = numero + soma;
        } scanner.close();
        System.out.println("A soma dos cinco números é:" + soma);
    } 
}
