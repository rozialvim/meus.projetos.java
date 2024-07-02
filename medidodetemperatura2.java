import java.util.Scanner;
public class medidodetemperatura2 {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura atual.");
        Scanner scanner = new Scanner (System.in);
        Double temp = scanner.nextDouble();
        if (temp>=30) {
            System.out.println("Risco de insolação");
        } else if (temp>20) {
            System.out.println("Tempo agradável durante todo o dia.");
        } else if (temp>0) {
            System.out.println("Tempo frio Possibilidades de ventos fortes.");
        } else {
            System.out.println("Cuidado Poderá nevar.");
        }
        scanner.close();
    }
}