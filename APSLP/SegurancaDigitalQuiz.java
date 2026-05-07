import java.util.Scanner; 

public class SegurancaDigitalQuiz {

    public static void main(String[] args) {
        // Objeto Scanner para receber as entradas do usuário 
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        
        // REQUISITO: Uso obrigatório do WHILE 
        // O loop garante que o usuário possa navegar e retornar ao menu principal
        while (opcao != 4) {
            // SAÍDA CLARA E ORGANIZADA: Uso de divisórias para melhor visualização 
            System.out.println("\n==========================================");
            System.out.println("      GUIA DE SEGURANÇA DIGITAL - APS     ");
            System.out.println("==========================================");
            System.out.println("1. Quiz: Senhas e Segurança de Contas");
            System.out.println("2. Quiz: Golpes e Phishing");
            System.out.println("3. Mito ou Verdade (Dicas Rápidas)");
            System.out.println("4. Sair do Programa");
            System.out.print("\nEscolha uma opção: ");
            
            // Leitura da opção escolhida pelo usuário 
            opcao = leitor.nextInt();

            // REQUISITO: Uso obrigatório do SWITCH 
            // Gerencia a navegação entre as diferentes áreas do tema 
            switch (opcao) {
                case 1:
                    executarQuizSenhas(leitor);
                    break;
                case 2:
                    executarQuizPhishing(leitor);
                    break;
                case 3:
                    // Atende a sugestão de incluir "Mito ou Verdade" 
                    exibirMitoVerdade(leitor);
                    break;
                case 4:
                    System.out.println("\nEncerrando... Lembre-se: Segurança digital se faz todo dia!");
                    break;
                default:
                    // Caso o usuário digite um número que não está no menu 
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        leitor.close(); // Fecha o scanner por boa prática de programação 
    }

    // TÓPICO 1: Aborda a área de Senhas (Requisito de ter pelo menos 2 tópicos) 
    public static void executarQuizSenhas(Scanner leitor) {
        System.out.println("\n--- QUIZ: SENHAS ---");
        System.out.println("Pergunta: Qual destas senhas é considerada a mais forte?");
        System.out.println("1) 12345678\n2) nome@2024\n3) Cafe!Com#Leite2026");
        System.out.print("Sua resposta: ");
        int resp = leitor.nextInt();

        // REQUISITO: Uso obrigatório do IF/ELSE 
        // Fornece feedback educativo imediato sobre o acerto ou erro 
        if (resp == 3) {
            System.out.println("CORRETO! Senhas longas e complexas dificultam ataques.");
        } else {
            System.out.println("ERRADO. Senhas curtas ou com dados pessoais são vulneráveis.");
        }
    }

    // TÓPICO 2: Aborda a área de Phishing 
    public static void executarQuizPhishing(Scanner leitor) {
        System.out.println("\n--- QUIZ: GOLPES E PHISHING ---");
        System.out.println("Pergunta: Recebeu um link estranho por SMS do banco. O que fazer?");
        System.out.println("1) Clicar para conferir.\n2) Ignorar e contatar o banco oficial.");
        System.out.print("Sua resposta: ");
        int resp = leitor.nextInt();

        if (resp == 2) {
            System.out.println("CORRETO! Instituições financeiras não enviam links urgentes por SMS.");
        } else {
            System.out.println("CUIDADO! Isso é Phishing, uma técnica para roubar seus dados.");
        }
    }

    public static void exibirMitoVerdade(Scanner leitor) {
        System.out.println("\n--- MITO OU VERDADE ---");
        System.out.println("Escolha um tema:\n1. Navegação Anônima\n2. Cadeado nos Sites");
        int escolha = leitor.nextInt();

        // Implementação de lógica condicional para educação digital 
        if (escolha == 1) {
            System.out.println("[MITO]: A navegação anônima não impede vírus, apenas não salva o histórico local.");
        } else if (escolha == 2) {
            System.out.println("[VERDADE]: O cadeado indica conexão segura, mas o site ainda pode ser malicioso.");
        }
    }
}
