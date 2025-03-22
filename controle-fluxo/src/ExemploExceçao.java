public class ExemploExceçao {
    public static void main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75");
            System.out.println("Valor: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o valor.");
        }
        
        
        }

    }
    

