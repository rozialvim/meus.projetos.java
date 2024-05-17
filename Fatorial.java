import java.util.Scanner;
public class Fatorial {

    public static void main (String[]  args) {
        int  numero = 0, fat = 1;

        //chama a classe Scanner para dentro do programa
        System.out.println(" Digite um número: ");
        Scanner scanner= new Scanner (System.in);
        // capturar o que o usuário digitar
        numero = scanner.nextInt();

        //fazer loop para multiplicar os valores do fatorial
        for(int i = numero; i > 1; i --) {
            fat = fat * i;
            //fat *= i;
        }
        
        //exibindo o resultado
        System.out.print(" O fatorial de " + numero + " é " + fat);

        scanner. close();

    }
}   