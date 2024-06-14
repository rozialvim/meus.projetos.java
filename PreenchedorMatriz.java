import java.util.Random;
public class PreenchedorMatriz {
    public static void main(String[]args){
        Random random =  new Random(0);
        int numero [][] = new int[5][5];

        for (int l = 0; l < 5; l++){
            for (int c = 0; c < 5; c++){
                numero[l][c] = random.nextInt(100);
                System.out.print("|" + numero[l][c] +"|");
                }
                System.out.println("");
        }
    } 
}
