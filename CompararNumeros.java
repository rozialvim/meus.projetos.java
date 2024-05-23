import java.util.Scanner;
public class CompararNumeros {

     public static void main(String[] args){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite o primeiro número ");
        num1 = scanner.nextInt();

        System.out.println(" Digite o segundo número ");
        num2 = scanner.nextInt();

        if(num1 < num2){
            System.out.println(" Menor valor:" + num1);
        }else if(num1 > num2){
            System.out.println(" Menor valor: " + num2);
        }else{
            System.out.println(" Dois números iguais foram informados. ");
        }
         
        scanner.close();
     }
}    