import java.util.Scanner;
public class somaNumeros{
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        int numero, soma = 0, contador = 1;
        System.out.println("Digite cinco numeros.");
        numero = scanner.nextInt();
        while ( contador <= 5){
            soma = soma + numero; contador ++
            System.out.println(" A soma dos números é:" + soma);
            
        }
    }   
}  

