public class AtividadePratica1 {

    public static void main(String[] args) {

        System.out.println("\nAtividadePratica1");

        while (true) {

            System.out.print("\nDigite o nome do funcionário (ou 'sair' para encerrar): ");
            String nome = Console.lerString();

            // Verificação de saída baseada em um exemplo do CHAT-GPT
            if (nome.equalsIgnoreCase("sair"))
                break;

            System.out.print("\nDigite o número de horas trabalhadas: ");
            int horasTrabalhadas = Console.lerInt();

            System.out.print("\nDigite o valor da hora trabalhada: ");
            float valorHora = Console.lerFloat();

            FolhaPagamento folha = new FolhaPagamento(nome, horasTrabalhadas, valorHora);

            folha.imprimirFolhaPagamento();

        }
    }
}
