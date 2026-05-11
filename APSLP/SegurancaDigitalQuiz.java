import java.util.Scanner;

public class SegurancaDigitalQuiz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        // Identificação da Equipe
        System.out.println("==============================================");
        System.out.println("   PROJETO APS: GUIA DE SEGURANÇA DIGITAL    ");
        System.out.println("==============================================");
        System.out.println("DESENVOLVIDO POR:");
        System.out.println("- SAMANTHA PINTO RABELO");
        System.out.println("- ROBERTA RAYCA DE OLIVERIA MENEZES");
        System.out.println("- JULIANNY ALBUQUERQUE LIMA");
        System.out.println("==============================================\n");

        // Pedindo o nome do jogador
        System.out.print("Para começar, digite o seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("\nOlá, " + nomeUsuario + "! Vamos testar os seus conhecimentos.");

        // REQUISITO: Uso de WHILE para manter o programa rodando
        while (opcao != 4) {
            System.out.println("\n---------- MENU PRINCIPAL (" + nomeUsuario + ") ----------");
            System.out.println("1. Quiz: Senhas e Proteção (Fácil, Médio, Difícil)");
            System.out.println("2. Quiz: Golpes e Phishing (Fácil, Médio, Difícil)");
            System.out.println("3. Dica: Mito ou Verdade");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = leitor.nextInt();

            // REQUISITO: Uso de SWITCH para o menu
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
                    System.out.println("\nAté logo, " + nomeUsuario + "! Proteja os seus dados sempre.");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        leitor.close();
    }

    // TÓPICO 1: SENHAS (3 Níveis)
    public static void executarQuizSenhas(Scanner leitor, String nome) {
        int pontos = 0;
        System.out.println("\n--- QUIZ: SENHAS E PROTEÇÃO (" + nome + ") ---");

        // Questão 1 - Fácil
        System.out.println("1. [FÁCIL] Qual destas senhas é mais difícil de hackear?");
        System.out.println("1) 123456 | 2) G@to_Azul_2026");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 2) {
            System.out.println("Muito bem, " + nome + "! Misturar caracteres é o ideal.");
            pontos += 10;
        } else {
            System.out.println("Errado. Senhas sequenciais são muito fáceis de descobrir.");
        }

        // Questão 2 - Médio
        System.out.println("\n2. [MÉDIO] O que é a Autenticação de Dois Fatores (2FA)?");
        System.out.println("1) Um segundo código de segurança | 2) Uma senha de apenas duas letras");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 1) {
            System.out.println("Correto! É uma camada extra de proteção.");
            pontos += 20;
        } else {
            System.out.println("Incorreto. É um código extra enviado ao telemóvel ou e-mail.");
        }

        // Questão 3 - Difícil
        System.out.println("\n3. [DIFÍCIL] Qual a função de um Gerenciador de Senhas?");
        System.out.println("1) Escrever as senhas num papel | 2) Guardar senhas únicas e fortes de forma segura");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 2) {
            System.out.println("Excelente! Assim não precisa de repetir senhas em vários sites.");
            pontos += 30;
        } else {
            System.out.println("Errado. Ele serve para gerir as suas credenciais com segurança.");
        }

        System.out.println("\n>>> Pontuação Final em Senhas: " + pontos + " pontos!");
    }

    // TÓPICO 2: GOLPES (3 Níveis)
    public static void executarQuizPhishing(Scanner leitor, String nome) {
        int pontos = 0;
        System.out.println("\n--- QUIZ: GOLPES E PHISHING (" + nome + ") ---");

        // Questão 1 - Fácil
        System.out.println("1. [FÁCIL] Recebeu um link de 'promoção' de um desconhecido. O que faz?");
        System.out.println("1) Clica para ver | 2) Apaga a mensagem e ignora");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 2) {
            System.out.println("Correto! Prevenção é a melhor defesa.");
            pontos += 10;
        } else {
            System.out.println("Cuidado! Isso pode ser um golpe para roubar dados.");
        }

        // Questão 2 - Médio
        System.out.println("\n2. [MÉDIO] Como se identifica geralmente um e-mail de Phishing?");
        System.out.println("1) Erros gramaticais e tom urgente | 2) Pelo horário em que foi enviado");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 1) {
            System.out.println("Exato! Os criminosos usam urgência para o fazer agir sem pensar.");
            pontos += 20;
        } else {
            System.out.println("Errado. Analise sempre o remetente e o conteúdo do texto.");
        }

        // Questão 3 - Difícil
        System.out.println("\n3. [DIFÍCIL] O que é a técnica de 'Typosquatting'?");
        System.out.println("1) Criar sites com nomes parecidos aos originais (ex: g00gle) | 2) É um antivírus");
        System.out.print("Resposta: ");
        if (leitor.nextInt() == 1) {
            System.out.println("Perfeito! Serve para enganar quem digita o endereço errado.");
            pontos += 30;
        } else {
            System.out.println("Incorreto. É a criação de domínios falsos muito similares aos reais.");
        }

        System.out.println("\n>>> Pontuação Final em Golpes: " + pontos + " pontos!");
    }

    // EXTRA: MITO OU VERDADE
    public static void exibirMitoVerdade(Scanner leitor) {
        System.out.println("\n--- MITO OU VERDADE ---");
        System.out.println("Escolha um tema:\n1. Cadeado no Browser | 2. Wi-Fi Público");
        System.out.print("Escolha: ");
        int escolha = leitor.nextInt();

        // REQUISITO: Uso de IF para feedback educativo
        if (escolha == 1) {
            System.out.println("\n[VERDADE]: O cadeado indica que a ligação é segura, mas o site pode ser falso.");
        } else if (escolha == 2) {
            System.out.println("\n[MITO]: 'Wi-Fi gratuito é sempre seguro'. Na verdade, hackers podem ler os seus dados.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
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

        // REQUISITO: Uso de IF para feedback
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
