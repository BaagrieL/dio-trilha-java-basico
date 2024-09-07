import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // TODO: Exibir as mensagens para o usuário

        // TODO: Obter pelo scanner os valores de entrada

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo(a)!");

        String nomeCompleto = getNomeSobrenome(ler);

        if(nomeCompleto == null){
            System.out.println("Por favor, informe um nome e sobrenome");
        } else {
            System.out.println("Ola, ".concat(nomeCompleto).concat(", sua conta foi aberta!"));
        }
         
        ler.close();
    }


    /**
     * Retorna o nome e sobrenome concatenados, ou nulo
     * caso o nome ou sobrenome estejam vazios.
     * @param scanner
     * @return nome completo/null
     */
    public static String getNomeSobrenome(Scanner scanner) {
        System.out.println("Por favor, informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        if (nome.isEmpty() || sobrenome.isEmpty()) {
            return null;
        }
        return nome.concat(" ").concat(sobrenome);
    }
}

