import java.util.Random;

public class ExmploDoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(10);
        int tentativas = 0;
        do {
            numero = random.nextInt(10);
            tentativas++;
            System.out.println("Tentativa: " + tentativas + " - Número: " + numero);
        } while (numero != 7);
        System.out.println("Número de tentativas: " + tentativas);
    }
    
}
