import java.util.Scanner; 

public class SegurancaDigitalQuiz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        // Cabeçalho com identificação das autoras
        System.out.println("==============================================");
        System.out.println("   PROJETO APS: GUIA DE SEGURANÇA DIGITAL    ");
        System.out.println("==============================================");
        System.out.println("DESENVOLVIDO POR:");
        System.out.println("- SAMANTHA PINTO RABELO");
        System.out.println("- ROBERTA RAYCA DE OLIVERIA MENEZES");
        System.out.println("- JULIANNY ALBUQUERQUE LIMA");
        System.out.println("==============================================\n");

        // Interatividade inicial
        System.out.print("Para começar, digite o seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("\nOlá, " + nomeUsuario + "! Vamos testar seus conhecimentos.");

        // Estrutura WHILE obrigatória para navegação
        while (opcao != 4) {
            System.out.println("\n---------- MENU PRINCIPAL (" + nomeUsuario + ") ----------");
            System.out.println("1. Quiz: Senhas e Proteção");
            System.out.println("2. Quiz: Golpes e Phishing");
            System.out.println("3. Dica: Mito ou Verdade");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = leitor.nextInt();

            // Estrutura SWITCH obrigatória
            switch (opcao) {
                case 1:
                    executarQuizSenhas(leitor, nomeUsuario);
                    break;
                case 2:
                    executarQuizPhishing(leitor, nomeUsuario);
                    break;
                case 3:
                    exibirMitoVerdade(leitor);
                    break;
                case 4:
                    System.out.println("\nAté logo, " + nomeUsuario + "! Proteja seus dados.");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        leitor.close();
    }

    // Tópico 1: Senhas
    public static void executarQuizSenhas(Scanner leitor, String nome) {
        int pontos = 0;
        System.out.println("\n--- QUIZ: SENHAS E PROTEÇÃO (" + nome + ") ---");

        System.out.println("1. Qual destas senhas é mais forte?");
        System.out.println("1) 123456 | 2) G@to_Azul_2026");
        System.out.print("Resposta: ");
        
        // Uso de IF obrigatório
        if (leitor.nextInt() == 2) {
            System.out.println("Correto!");
            pontos += 10;
        } else {
            System.out.println("Errado.");
        }

        System.out.println("\n2. O que é Autenticação de Dois Fatores (2FA)?");
        System.out.println("1) Um código extra de segurança | 2) Uma senha curta");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 1) {
            System.out.println("Correto!");
            pontos += 20;
        } else {
            System.out.println("Incorreto.");
        }

        System.out.println("\n>>> Pontuação Final em Senhas: " + pontos + " pontos!");
    }

    // Tópico 2: Golpes
    public static void executarQuizPhishing(Scanner leitor, String nome) {
        int pontos = 0;
        System.out.println("\n--- QUIZ: GOLPES E PHISHING (" + nome + ") ---");

        System.out.println("1. Recebeu um link estranho por SMS. O que faz?");
        System.out.println("1) Clica para ver | 2) Apaga e ignora");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 2) {
            System.out.println("Correto!");
            pontos += 10;
        } else {
            System.out.println("Cuidado! Isso é Phishing.");
        }

        System.out.println("\n2. O que é 'Typosquatting'?");
        System.out.println("1) Site com nome parecido ao real | 2) Um antivírus");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 1) {
            System.out.println("Perfeito!");
            pontos += 30;
        } else {
            System.out.println("Incorreto.");
        }

        System.out.println("\n>>> Pontuação Final em Golpes: " + pontos + " pontos!");
    }

    // Extra: Mito ou Verdade
    public static void exibirMitoVerdade(Scanner leitor) {
        System.out.println("\n--- MITO OU VERDADE ---");
        System.out.println("1. Cadeado no Browser | 2. Wi-Fi Público");
        System.out.print("Escolha: ");
        int escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.println("[VERDADE]: O cadeado indica conexão segura, mas o site pode ser falso.");
        } else if (escolha == 2) {
            System.out.println("[MITO]: Wi-Fi gratuito nem sempre é seguro.");
        }
    }
}
