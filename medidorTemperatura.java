import java.util.Scanner;
public class medidorTemperatura {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        System.out.println("Digite a temperatura atual em Celsius:");
        temperatura = scanner. nextDouble();

        if (temperatura < 0){
            System.out.println(" Cuidado! Poderá nevar na sua região.");
        }else if (temperatura >0 && temperatura <=20){
            System.out.println(" Tempo frio! Posssibilidade de ventos fortes.");
        }else if(temperatura>=21 && temperatura <=30){
            System.out.println("Tempo agradável durante todo o dia.");
        }else if(temperatura>30){
            System.out.println(" Calor exessivo! Risco de insolação.");
        }

        scanner.close();    }

    
}
 