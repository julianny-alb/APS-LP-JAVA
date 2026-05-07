import java.util.Scanner;

public class SegurancaDigitalQuiz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 4) {
            System.out.println("\n==========================================");
            System.out.println("      GUIA DE SEGURANÇA DIGITAL - APS     ");
            System.out.println("==========================================");
            System.out.println("1. Quiz: Senhas e Segurança de Contas");
            System.out.println("2. Quiz: Golpes e Phishing");
            System.out.println("3. Mito ou Verdade (Dicas Rápidas)");
            System.out.println("4. Sair do Programa");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    executarQuizSenhas(leitor);
                    break;
                case 2:
                    executarQuizPhishing(leitor);
                    break;
                case 3:
                    exibirMitoVerdade(leitor);
                    break;
                case 4:
                    System.out.println("\nEncerrando... Lembre-se: Segurança digital se faz todo dia!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        leitor.close();
    }

    public static void main(String[] args) { /* Este método é apenas ilustrativo da estrutura interna */ }
    
    public static void executarQuizSenhas(Scanner leitor) {
        System.out.println("\n--- QUIZ: SENHAS ---");
        System.out.println("Pergunta: Qual destas senhas é considerada a mais forte?");
        System.out.println("1) 12345678\n2) nome@2024\n3) Cafe!Com#Leite2026");
        System.out.print("Sua resposta: ");
        int resp = leitor.nextInt();

        if (resp == 3) {
            System.out.println("CORRETO! Senhas longas, com símbolos e números são muito difíceis de quebrar.");
        } else {
            System.out.println("ERRADO. Senhas óbvias ou curtas podem ser descobertas em segundos por hackers.");
        }
    }

    public static void executarQuizPhishing(Scanner leitor) {
        System.out.println("\n--- QUIZ: GOLPES E PHISHING ---");
        System.out.println("Pergunta: Você recebeu um SMS do 'seu banco' dizendo que sua conta será bloqueada se não clicar num link. O que você faz?");
        System.out.println("1) Clico rápido para não perder a conta.\n2) Ignoro e entro em contato com o banco pelo canal oficial.");
        System.out.print("Sua resposta: ");
        int resp = leitor.nextInt();

        if (resp == 2) {
            System.out.println("CORRETO! Bancos reais nunca pedem ações urgentes via links em SMS.");
        } else {
            System.out.println("CUIDADO! Isso é Phishing. Ao clicar, você entregaria seus dados aos criminosos.");
        }
    }

    public static void exibirMitoVerdade(Scanner leitor) {
        System.out.println("\n--- MITO OU VERDADE ---");
        System.out.println("Escolha um tema para descobrir:");
        System.out.println("1. Navegação Anônima\n2. Cadeado nos Sites");
        int escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.println("\n[MITO]: 'Navegar no modo anônimo me deixa invisível contra vírus'.");
            System.out.println("Realidade: O modo anônimo apenas não salva seu histórico no computador.");
        } else if (escolha == 2) {
            System.out.println("\n[VERDADE]: 'O cadeado não garante que o site é honesto'.");
            System.out.println("Realidade: Ele indica que a conexão é segura, mas o site pode ser de um golpista.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
