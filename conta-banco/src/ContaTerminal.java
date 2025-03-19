import java.util.Scanner;
//foi usaso o import java.util.Scanner; para que o programa possa receber dados do usuário
public class ContaTerminal {
    Scanner scanner = new Scanner(System.in);
//foi criado um objeto scanner para que o programa possa receber dados do usuário
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número da conta: ");
            String contaNumero = scanner.nextLine();
            System.out.print("Digite a agência: ");
            String agencia = scanner.nextLine();
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o saldo da conta: ");
            double saldo = scanner.nextDouble();
            scanner.close();

            //Usaso o System.out.println para que o programa possa imprimir na tela as informações do cliente
            System.out.println("Olá, " + nome + "! " + "obrigado por abrir sua conta na agência " + agencia + " e sua conta é " + contaNumero + ". Seu saldo atual é de R$ " + saldo + ". Já está disponível para saque.");
        }
    }
    
}
