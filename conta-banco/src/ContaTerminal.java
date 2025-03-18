import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args)  {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agencia: ");
         int agencia = scanner.nextInt();

        System.out.println("Nome: ");
        String nome = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Limite: ");
        double limite = scanner.nextDouble();

        Conta conta = new Conta(nome, numero, saldo, limite);
        System.out.println("Conta criada com sucesso!");
        scanner.close();
    }
}








        
        
                
        
        
                
        
                //TODO: Exibir mensagem  para o novo usuário
        
                //TODO: Obter pela scanner os valores digitado no treminal
        
                                //TODO; Exibir a mensagem conta criada
                    
                
        