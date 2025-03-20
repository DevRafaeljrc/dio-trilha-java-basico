public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};

        //for (int i = 0; i < alunos.length; i++) {
           
           // System.out.println("O Aluno no indice x= " + i + " é " + alunos[i]);
           
        // for com each
        for (String aluno : alunos) {
            System.out.println("O Aluno é " + aluno);}
        }
    
}
