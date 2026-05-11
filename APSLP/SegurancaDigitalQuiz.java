import java.util.Scanner;

public class SegurancaDigitalQuiz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        //Identificação da Equipe
        System.out.println("==============================================");
        System.out.println("   PROJETO APS: GUIA DE SEGURANÇA DIGITAL    ");
        System.out.println("==============================================");
        System.out.println("DESENVOLVIDO POR:");
        System.out.println("- SAMANTHA PINTO RABELO");
        System.out.println("- ROBERTA RAYCA DE OLIVERIA MENEZES");
        System.out.println("- JULIANNY ALBUQUERQUE LIMA");
        System.out.println("==============================================\n");

        //Uso de WHILE para navegação e retorno ao menu
        while (opcao != 4) {
            System.out.println("---------- MENU PRINCIPAL ----------");
            System.out.println("1. Quiz: Senhas e Proteção (3 Níveis)");
            System.out.println("2. Quiz: Golpes e Phishing (3 Níveis)");
            System.out.println("3. Dica: Mito ou Verdade");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = leitor.nextInt();

            // Uso de SWITCH para guiar o usuário
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
                    System.out.println("\nEncerrando... Proteja seus dados sempre!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        leitor.close();
    }

    // TÓPICO 1: SENHAS (Com 3 níveis de dificuldade)
    public static void executarQuizSenhas(Scanner leitor) {
        int pontos = 0;
        System.out.println("\n--- QUIZ: SENHAS E PROTEÇÃO ---");

        // Nível Fácil
        System.out.println("1. [FÁCIL] Qual destas senhas é mais difícil de hackear?");
        System.out.println("1) 123456 | 2) G@to_Azul_2026");
        if (leitor.nextInt() == 2) {
            System.out.println("Correto! Misturar caracteres é essencial.");
            pontos += 10;
        } else {
            System.out.println("Errado. Senhas sequenciais são muito vulneráveis.");
        }

        // Nível Médio
        System.out.println("\n2. [MÉDIO] O que é a Autenticação de Dois Fatores (2FA)?");
        System.out.println("1) Um segundo código de segurança | 2) Uma senha de duas letras");
        if (leitor.nextInt() == 1) {
            System.out.println("Correto! É uma camada extra fundamental.");
            pontos += 20;
        } else {
            System.out.println("Errado. É um código enviado ao seu celular ou app.");
        }

        // Nível Difícil
        System.out.println("\n3. [DIFÍCIL] Qual a vantagem de usar um Gerenciador de Senhas?");
        System.out.println("1) Deixar as senhas salvas num post-it | 2) Criar e guardar senhas únicas e fortes");
        if (leitor.nextInt() == 2) {
            System.out.println("Excelente! Assim você não repete senhas em vários sites.");
            pontos += 30;
        } else {
            System.out.println("Errado. O gerenciador criptografa suas senhas com segurança.");
        }

        System.out.println("\n>>> Pontuação Final em Senhas: " + pontos + " pontos!");
    }

    // TÓPICO 2: GOLPES (Com 3 níveis de dificuldade)
    public static void executarQuizPhishing(Scanner leitor) {
        int pontos = 0;
        System.out.println("\n--- QUIZ: GOLPES E PHISHING ---");

        // Nível Fácil
        System.out.println("1. [FÁCIL] O que fazer ao receber um link de 'promoção imperdível' de número desconhecido?");
        System.out.println("1) Clicar na hora | 2) Apagar e ignorar");
        if (leitor.nextInt() == 2) {
            System.out.println("Correto! Nunca clique em links suspeitos.");
            pontos += 10;
        } else {
            System.out.println("Cuidado! Isso costuma ser Phishing.");
        }

        // Nível Médio
        System.out.println("\n2. [MÉDIO] Como identificar um e-mail falso?");
        System.out.println("1) Erros de português e remetente estranho | 2) Pela cor do fundo");
        if (leitor.nextInt() == 1) {
            System.out.println("Correto! Golpistas costumam cometer erros de escrita.");
            pontos += 20;
        } else {
            System.out.println("Errado. Analise sempre o endereço do remetente.");
        }

        // Nível Difícil
        System.out.println("\n3. [DIFÍCIL] O que é 'Typosquatting'?");
        System.out.println("1) Um site com nome quase igual ao original (ex: g00gle) | 2) Um tipo de antivírus");
        if (leitor.nextInt() == 1) {
            System.out.println("Perfeito! É o uso de domínios parecidos para enganar o usuário.");
            pontos += 30;
        } else {
            System.out.println("Errado. É uma técnica de criar sites falsos com nomes parecidos.");
        }

        System.out.println("\n>>> Pontuação Final em Golpes: " + pontos + " pontos!");
    }

    // EXTRA: MITO OU VERDADE (Dica do Dia)
    public static void exibirMitoVerdade(Scanner leitor) {
        System.out.println("\n--- MITO OU VERDADE ---");
        System.out.println("Escolha um tema:\n1. Cadeado no Site | 2. Redes Wi-Fi Públicas");
        int escolha = leitor.nextInt();

        [span_9](start_span)// REQUISITO: Uso de IF para feedback
        if (escolha == 1) {
            System.out.println("[VERDADE]: O cadeado significa que a conexão é cifrada, mas o site ainda pode ser golpista.");
        } else if (escolha == 2) {
            System.out.println("[MITO]: 'Wi-Fi de shopping é sempre seguro'. Na verdade, seus dados podem ser interceptados.");
        }
    }
}

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
