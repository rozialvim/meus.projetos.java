import java.util.Scanner;

public class Aula1505ex01 {
    public static void main (String[] args){
            int num1, num2; 
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número ");
            num1 = scanner.nextInt();

            System.out.println("Digite o segundo número ");
            num2 = scanner.nextInt();

            System.out.println("resultado");
            System.out.println("A soma dos números é :" + ( num1 + num2));
            System.out.println("A subtração dos números é :" + ( num1 - num2));
            System.out.println("A multiplicação dos números é :" + ( num1 * num2));
            System.out.println("A divisão dos números é :" + ( num1 / num2));

            scanner.close();
    }
}            


        


    
     
    

