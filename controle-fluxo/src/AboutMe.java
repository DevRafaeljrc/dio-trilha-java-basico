import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        
       try {
        System.out.println("Olá, eu sou o AboutMe, um programa que vai te ajudar a se conhecer melhor!");
        Thread.sleep(2000);
        System.out.println("Vamos começar!");
        Thread.sleep(2000);
        System.out.println("Digite seu nome, sobrenome, idade e altura.");
        Thread.sleep(2000);
       } catch (Exception e) {
        // TODO: handle exception
       }

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();



        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        scanner.close();



    }
    
}      