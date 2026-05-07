import java.util.Scanner;

public class SegurancaDigitalQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = 0;
        int pontuacao = 0;
        int totalPerguntas = 4; // 2 para cada tópico

        System.out.println("================================================");
        System.out.println("   BEM-VINDO AO QUIZ DE SEGURANÇA DIGITAL!");
        System.out.println("================================================");
        System.out.println("Aprenda a se proteger no mundo virtual.");

        // O 'while' garante que o programa continue rodando até o usuário escolher sair (opção 4)
        while (opcaoMenu != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Jogar Tópico 1: Criação de Senhas Seguras");
            System.out.println("2. Jogar Tópico 2: Prevenção contra Golpes (Phishing)");
            System.out.println("3. Ver minha Pontuação Atual");
            System.out.println("4. Sair do Programa");
            System.out.print("Escolha uma opção: ");

            opcaoMenu = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado após ler o número

            // O 'switch' gerencia a navegação do menu
            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n*** TÓPICO 1: SENHAS SEGURAS ***");
                    
                    System.out.println("\nPergunta 1: Qual das opções abaixo representa a senha mais segura para suas contas?");
                    System.out.println("1) A sua data de nascimento (ex: 15041998)");
                    System.out.println("2) Uma palavra comum seguida de 123 (ex: brasil123)");
                    System.out.println("3) Uma combinação de letras (maiúsculas e minúsculas), números e símbolos (ex: T3rR@#9zL!)");
                    System.out.print("Sua resposta: ");
                    int resp1 = scanner.nextInt();
                    
                    // O 'if' verifica a resposta e dá o feedback
                    if (resp1 == 3) {
                        System.out.println("-> CORRETO! Senhas fortes devem misturar diferentes tipos de caracteres e não conter informações pessoais.");
                        pontuacao++;
                    } else {
                        System.out.println("-> ERRADO. A resposta certa era a 3. Evite dados pessoais ou sequências óbvias que são fáceis de adivinhar por hackers.");
                    }

                    System.out.println("\nPergunta 2: É uma boa prática usar a mesma senha para o seu e-mail, redes sociais e banco?");
                    System.out.println("1) Sim, pois assim é mais fácil de lembrar.");
                    System.out.println("2) Não, pois se um cibercriminoso descobrir a senha, ele terá acesso a todas as suas contas.");
                    System.out.print("Sua resposta: ");
                    int resp2 = scanner.nextInt();

                    if (resp2 == 2) {
                        System.out.println("-> CORRETO! O reuso de senhas é perigoso. Se um site vazar seus dados, todas as outras contas estarão em risco.");
                        pontuacao++;
                    } else {
                        System.out.println("-> ERRADO. A resposta certa era a 2. Nunca reutilize senhas, especialmente em contas importantes.");
                    }
                    break;

                case 2:
                    System.out.println("\n*** TÓPICO 2: PREVENÇÃO CONTRA GOLPES (PHISHING) ***");
                    
                    System.out.println("\nPergunta 3: Você recebeu um e-mail urgente dizendo ser do seu banco, com um link solicitando a atualização imediata da sua senha. O que você faz?");
                    System.out.println("1) Clico no link e atualizo minha senha rapidamente para não bloquear a conta.");
                    System.out.println("2) Ignoro o e-mail, não clico em nada e abro o aplicativo oficial do banco para verificar se há alguma notificação.");
                    System.out.print("Sua resposta: ");
                    int resp3 = scanner.nextInt();

                    if (resp3 == 2) {
                        System.out.println("-> CORRETO! Bancos nunca pedem senhas por link de e-mail ou SMS. Isso é um golpe clássico de Phishing.");
                        pontuacao++;
                    } else {
                        System.out.println("-> ERRADO. A resposta certa era a 2. Clicar em links de e-mails suspeitos pode roubar seus dados bancários.");
                    }

                    System.out.println("\nPergunta 4: O que é a Autenticação de Dois Fatores (2FA)?");
                    System.out.println("1) Uma camada extra de segurança que exige um segundo código (ex: SMS ou app) além da senha.");
                    System.out.println("2) Um antivírus que bloqueia dois tipos de vírus diferentes.");
                    System.out.print("Sua resposta: ");
                    int resp4 = scanner.nextInt();

                    if (resp4 == 1) {
                        System.out.println("-> CORRETO! A 2FA protege sua conta mesmo que alguém descubra sua senha, pois o invasor não terá o segundo código.");
                        pontuacao++;
                    } else {
                        System.out.println("-> ERRADO. A resposta certa era a 1. A 2FA é essencial para proteger contas de redes sociais e e-mails.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- SUA PONTUAÇÃO ---");
                    System.out.println("Você tem " + pontuacao + " ponto(s) de um total de " + totalPerguntas + " possíveis.");
                    if (pontuacao == totalPerguntas) {
                        System.out.println("Parabéns! Você é um especialista em segurança digital!");
                    } else if (pontuacao >= 2) {
                        System.out.println("Muito bem, mas ainda há espaço para melhorar seus hábitos online.");
                    } else {
                        System.out.println("Cuidado! Você precisa estudar mais sobre como se proteger na internet.");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando o Guia de Segurança Digital...");
                    System.out.println("Obrigado por jogar! Pontuação final: " + pontuacao + "/" + totalPerguntas);
                    System.out.println("Lembre-se: Na internet, desconfie sempre e proteja seus dados!");
                    break;

                default:
                    // Caso o usuário digite um número que não está no menu
                    System.out.println("\nOpção inválida! Por favor, digite um número de 1 a 4.");
                    break;
            }
        }
        
        scanner.close(); 
    }
}
