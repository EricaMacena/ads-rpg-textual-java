/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terraexiladapi;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class TerraExiladaPI {
    private static final Scanner ler = new Scanner(System.in);

    //---------> Material em PDF Loop For
    public static void conteudoBasico() {
        conteudo(Urls.CONTEUDO_BASICO);
    }

    public static void conteudoIntermediario() {
        conteudo(Urls.CONTEUDO_INTERMEDIARIO);
    }

    public static void conteudoAvancado() {
        conteudo(Urls.CONTEUDO_AVANCADO);
    }

    //Material sobre operadores relacionais
    public static void operadoresRelacionais() {
        conteudo(Urls.OPERADORES_RELACIONAIS);
    }

    private static void conteudo(Urls url) {
        if (url == null) throw new IllegalArgumentException("Url informada não pode ser nula");
        try {
            Desktop.getDesktop().browse(new URI(url.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Continua pedindo uma alternativa válida
    public static String validarAlternativa(List<String> options) {
        String resposta = "";
        while (!options.contains(resposta)) {
            System.out.printf("Digite %s: ", String.join(", ", options.subList(0, options.size() / 2)));
            resposta = ler.nextLine().trim().toLowerCase();
        }
        return resposta;
    }

    public static void continuarEnredo(Scanner ler) {
        if (ler == null) throw new IllegalArgumentException("Objeto do tipo Scanner não pode ser nulo.");
        int continuar = 0;
        System.out.println();
        while (continuar != 1) {
            System.out.print("\nDIGITE 1 PARA CONTINUAR: ");
            try {
                continuar = Integer.parseInt(ler.nextLine());
            } catch (NumberFormatException ignored) {
                System.out.println("Informe um valor relevante.");
            }
        }
    }

    //----> 4 DESAFIOS INICIAIS (TREINAMENTO PARA O DESAFIO FINAL)
   
    //1° Desafio sobre conteúdoBasico do For 
     public static void Desafio1() {    
    Scanner scanner = new Scanner(System.in);


    //1° Desafio sobre conteúdo básico do 'For'
    public static void Desafio1() {
        //Alternativas
        String[] alternativas = {
                "Comparar dois valores",
                "Criar uma função matemática",
                "Realizar operações matemáticas com variáveis",
                "Repetir uma sequência de comandos por um número determinado de vezes"
        };

        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

    // Exibe as alternativas 
    System.out.println("\n--- Desafio 1 ---");
    System.out.println("Qual a função do comando \"for\" em linguagens de programação? ");
    System.out.println("a) " + alternativas[0] + "\n" +
            "b) " + alternativas[1] + "\n" +
            "c) " + alternativas[2] + "\n" +
            "d) " + alternativas[3] + "\n");
        //Exibe as alternativas

    int tentativas = 0;
    int erros = 0;
        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            String resposta = validarAlternativa(options);

            int escolha = resposta.toUpperCase().charAt(0) - 65;

        if (alternativas[escolha].contains("Repetir uma sequência de comandos por um número determinado de vezes")) {
            System.out.println("Parabéns, você acertou!");
            break;
        } else {
            erros++;
            System.out.println("Você errou.");
            System.out.println("----> Tentativa " + erros);
            Collections.shuffle(Arrays.asList(alternativas));
            System.out.println("\n\nQual a função do comando \"for\" em linguagens de programação? ");
            System.out.println("a) " + alternativas[0] + "\n" +
                    "b) " + alternativas[1] + "\n" +
                    "c) " + alternativas[2] + "\n" +
                    "d) " + alternativas[3] + "\n");
            tentativas++;
        }
    }

        if (tentativas >= 3) {
            System.out.println("-----> Você esgotou suas tentativas. \nA resposta correta é: Repetir uma sequência de comandos por um número determinado de vezes.");
        }

    }

    //2° Desafio sobre conteúdo básico do 'For'
    public static void Desafio2() {
        //Alternativas
        String[] alternativas = {
                "for(inicialização; atualização; incrementar ou decrementar)",
                "for(condição de continuação; inicialização; incrementar ou decrementar)",
                "for(inicialização; condição de continuação; incrementar ou decrementar)",
                "for(inicialização; incrementar ou decrementar; condição de continuação)"
        };

        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

    // Exibe as alternativas 
    System.out.println("\n--- Desafio 2 ---");
    System.out.println("Quais são as 3 partes que compõem a estrutura for ? ");
    System.out.println("a) " + alternativas[0] + "\n" +
            "b) " + alternativas[1] + "\n" +
            "c) " + alternativas[2] + "\n" +
            "d) " + alternativas[3] + "\n");
        //Exibe as alternativas

        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            String resposta = validarAlternativa(options);

            int escolha = resposta.toUpperCase().charAt(0) - 65;

        if (alternativas[escolha].contains(  "for(inicialização; condição de continuação; incrementar ou decrementar)")) {
            System.out.println("Parabéns, você acertou!");
            break;
        } else {
            erros++;
            System.out.println("Você errou.");
            System.out.println("----> Tentativa " + erros);
            Collections.shuffle(Arrays.asList(alternativas));
            System.out.println("\n\nQuais são as 3 partes que compõem a estrutura for ? ");
            System.out.println("a) " + alternativas[0] + "\n" +
                    "b) " + alternativas[1] + "\n" +
                    "c) " + alternativas[2] + "\n" +
                    "d) " + alternativas[3] + "\n");
            tentativas++;
        }
    }

    if (tentativas >= 3) {
        System.out.println("------> Você esgotou suas tentativas.\n\nAs partes que compõem o for são:"
                + "\n1. Inicialização\n" +
        "2. Condição de continuação\n" +
        "3. Incremento/Decremento");
        
    }

    }

    //3º Desafio sobre o conteúdo intermediário do 'For'
    public static void Desafio3() {
        //Array com as alternativas
        String[] alternativas = {
                "Determinar o valor inicial da variável de controle do loop",
                "Verificar se o loop deve continuar executando",
                "Atualizar o valor da variável de controle do loop em cada iteração",
                "Definir a ação a ser realizada em cada iteração do loop"
        };

        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

     // Exibe as alternativas
     System.out.println("\n--- Desafio 3 ---");
     System.out.println("Qual é o papel da \"condição\" em um loop for ? ");
     System.out.println("a) " + alternativas[0] + "\n" +
            "b) " + alternativas[1] + "\n" +
            "c) " + alternativas[2] + "\n" +
            "d) " + alternativas[3] + "\n");

    int tentativas = 0;
    int erros = 0;

    while (tentativas < 3) {
        String resposta = scanner.nextLine();

       // Enquanto a resposta não for uma alternativa válida, continua pedindo.
         validarAlternativa(resposta);
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.

            int escolha = resposta.toUpperCase().charAt(0) - 65;

        if (alternativas[escolha].contains(  "Verificar se o loop deve continuar executando")) {
            System.out.println("Parabéns, você acertou!");
            break;
        } else {
            erros++;
            System.out.println("Você errou.");
            System.out.println("----> Tentativa " + erros);
            Collections.shuffle(Arrays.asList(alternativas));
            System.out.println("\n\nQual é o papel da \"condição\" em um loop for ? ");
            System.out.println("a) " + alternativas[0] + "\n" +
                    "b) " + alternativas[1] + "\n" +
                    "c) " + alternativas[2] + "\n" +
                    "d) " + alternativas[3] + "\n");
            tentativas++;
        }
    }

    if (tentativas >= 3) {
        System.out.println("-------> Você esgotou suas tentativas."
                + "\nA condição de continuação em um loop \"for\" é uma expressão"
                + "\nque determina se o loop deve continuar executando ou se deve"
                + "\nser encerrado."
                + "\nEssa condição é verificada a cada iteração do loop e, se for"
                + "\navaliada como falsa, o loop será interrompido e a execução"
                + "\nserá transferida para o próximo trecho após o loop.");
        
    }

}
      
      
      
       
      //4° Teste sobre o conteudoAvançado do For
       public static void Desafio4() {
     Scanner scanner = new Scanner(System.in);

    }

    //4º Teste sobre o conteúdo avançado do 'For'
        //Array com as alternativas
        String[] alternativas = {
                "for (int i = 0; i <= 10; i++)",
                "for (int i = 1; i <= 10; i++)",
                "for (int i = 0; i < 10; i++)",
                "for (int i = 1; i < 10; i++)"
        };

        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

     // Exibe as alternativas
      System.out.println("\n--- Desafio 4 ---");
      System.out.println("Como você define um loop for que mostre 10 números, começando com o zero ? ");
      System.out.println("a) " + alternativas[0] + "\n" +
            "b) " + alternativas[1] + "\n" +
            "c) " + alternativas[2] + "\n" +
            "d) " + alternativas[3] + "\n");
        //Exibe as alternativas

        int tentativas = 0;
        int erros = 0;

     while (tentativas < 3) {
        String resposta = scanner.nextLine();

        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta);
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.

            int escolha = resposta.toUpperCase().charAt(0) - 65;

        if (alternativas[escolha].contains(  "for (int i = 0; i < 10; i++)")) {
            System.out.println("Parabéns, você acertou!");
            break;
        } else {
            erros++;
            System.out.println("Você errou.");
            System.out.println("----> Tentativa " + erros);
            Collections.shuffle(Arrays.asList(alternativas));
            System.out.println("\n\nComo você define um loop for que mostre 10 números, começando com o zero ? ");
            System.out.println("a) " + alternativas[0] + "\n" +
                    "b) " + alternativas[1] + "\n" +
                    "c) " + alternativas[2] + "\n" +
                    "d) " + alternativas[3] + "\n");
            tentativas++;
        }
    }

        if (tentativas >= 3) {
            System.out.println("------> Você esgotou suas tentativas.");
        }

    }

    public static void DesafioFinalA1() {
        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        int tentativas = 0;

        System.out.println("\n\nLOGIN: GOVERNO");
        System.out.println("SENHA: _ _ _ _");

        System.out.println("\nComo você define um loop for que faça a senha: 2 4 6 8 ");
        System.out.print("""
                a)for (int i = 0; i <= 8; i = i + 1)
                b)for (int i = 2; i <= 8; i = i + 2)
                c)for (int i = 2; i < 8;  i = i + 2)
                d)for (int i = 2; i <= 8; i = i + 1)
                """);

        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        String resposta = validarAlternativa(options);

        if (resposta.equalsIgnoreCase("b")) {
            System.out.println("\n\nLOGIN: GOVERNO");
            System.out.println("SENHA: 2 4 6 8");
            System.out.println("LOGANDO ......\n");
            System.out.println("\nDepois de acessar o sistema do governo, você se depara com uma série de"
                    + "\narquivos e começa a vasculhar para encontrar informações que possam"
                    + "\najudar abrir o portão.");
            System.out.println("\nApós horas de busca, tem um arquivo suspeito que parece esta codificado."
                    + "\nUsando suas habilidades em programação, conseguiu descriptografá-lo e"
                    + "\ndescobriu que se trata de um documento com informações sobre o sistema"
                    + "\nde segurança do governo.");
            System.out.println("\nO arquivo contém várias informações sobre os departamentos do prédio."
                    + "\nPorém, uma parte específica chamou sua atenção: A combinação numérica"
                    + "\npara abrir o portão."
                    + "\nEra um mistério até aquele momento, mas agora está diante de seus olhos,"
                    + "\ncomo uma chave para a liberdade. "
                    + "\nA senha é: 13, 24 e 31.");
            DesafioFinalA2(tentativas);
        } else {
            tentativas = tentativas + 1;
            System.out.println("----> Tentativa " + tentativas);
            System.out.println("----> Acesso Negado");
            while (tentativas < 5) {
                System.out.println("\nComo você define um loop for que faça a senha: 2 4 6 8 ");
                System.out.print("""
                        a)for (int i = 0; i <= 8; i = i + 1)
                        b)for (int i = 2; i <= 8; i = i + 2)
                        c)for (int i = 2; i < 8;  i = i + 2)
                        d)for (int i = 2; i <= 8; i = i + 1)
                        """);

                // Enquanto a resposta não for uma alternativa válida, continua pedindo.
                resposta = validarAlternativa(options);

                if (resposta.equalsIgnoreCase("b")) {
                    System.out.println("\n\nLOGIN: GOVERNO");
                    System.out.println("SENHA: 2 4 6 8");
                    System.out.println("LOGANDO ......\n");
                    System.out.println("\nDepois de acessar o sistema do governo, você se depara com uma série de"
                            + "\narquivos e começa a vasculhar para encontrar informações que possam"
                            + "\najudar abrir o portão.");
                    System.out.println("\nApós horas de busca, tem um arquivo suspeito que parece esta codificado."
                            + "\nUsando suas habilidades em programação, conseguiu descriptografá-lo e"
                            + "\ndescobriu que se trata de um documento com informações sobre o sistema"
                            + "\nde segurança do governo.");
                    System.out.println("\nO arquivo contém várias informações sobre os departamentos do prédio."
                            + "\nPorém, uma parte específica chamou sua atenção: A combinação numérica"
                            + "\npara abrir o portão."
                            + "\nEra um mistério até aquele momento, mas agora está diante de seus olhos,"
                            + "\ncomo uma chave para a liberdade. "
                            + "\nA senha é: 13, 24 e 31.");
                    DesafioFinalA2(tentativas);
                    break;
                } else {
                    tentativas = tentativas + 1;
                    System.out.println("----> Tentativa " + tentativas);
                    System.out.println("----> Acesso Negado");
                }
            }
        }


        if (resposta.equalsIgnoreCase("b") && (tentativas == 5)) {
            System.out.println("----> Você atingiu o limite máximo de erros:" +tentativas);
               System.out.println("\n\nLOGIN: GOVERNO");
             System.out.println("SENHA: 2 4 6 8");
             System.out.println("LOGANDO ......\n"); 
             System.out.println("\nDepois de acessar o sistema do governo, você se depara com uma série de"
                     +"\narquivos e começa a vasculhar para encontrar informações que possam"
                     + "\najudar abrir o portão.");
             System.out.println("\nApós horas de busca, tem um arquivo suspeito que parece esta codificado."
                     +"\nUsando suas habilidades em programação, conseguiu descriptografá-lo e"
                     + "\ndescobriu que se trata de um documento com informações sobre o sistema"
                     + "\nde segurança do governo.");
             System.out.println("\nO arquivo contém várias informações sobre os departamentos do prédio."
                     + "\nPorém, uma parte específica chamou sua atenção: A combinação numérica"
                     + "\npara abrir o portão."
                     + "\nEra um mistério até aquele momento, mas agora está diante de seus olhos,"
                     + "\ncomo uma chave para a liberdade. "
                     + "\nA senha é: 13, 24 e 31.");
                DesafioFinalA2(tentativas);
            } else if(!resposta.equalsIgnoreCase("b") && (tentativas == 5))  {
             System.out.println(tentativas + " Tentativas de Invasão:");
             System.out.println("SISTEMA DE SEGURANÇA ATIVADO"); 
             ConclusaoFinal2();
        }

    }

    public static void DesafioFinalA2(int tentativas) {
        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        System.out.println("\nQual for gera a senha para abrir o portão ? ");
        System.out.print("""
                a)for (int i = 13; i <= 35; i = i + 11)
                b)for (int i = 13; i < 35; i = i + 9)
                c)for (int i = 13; i > 35;  i = i + 15)
                d)for (int i = 13; i = 35; i = i + 6)
                """);

        //Enquanto a resposta não for uma alternativa válida, continua pedindo.
        String resposta1 = validarAlternativa(options);

        if (resposta1.equalsIgnoreCase("a")) {
            System.out.println("\n----------> SENHA CORRETA");
            System.out.println("----------> ABRINDO PORTÃO");
            ConclusaoFinal1(); 
         }else{
            tentativas = tentativas+1;
             System.out.println("----> Tentativa " + tentativas);
             System.out.println("----> Acesso Negado");
            while (tentativas < 5) {
            System.out.println("\nQual for gera a sequência da senha para abrir o portão ? ");
            System.out.printf("a)for (int i = 13; i <= 35; i = i + 11)\n" +
            "b)for (int i = 13; i < 35; i = i + 9)\n" +
            "c)for (int i = 13; i > 35;  i = i + 15)\n" +
            "d)for (int i = 13; i = 35; i = i + 6)\n"); 
             resposta1 = scanner.nextLine();
          
           // Enquanto a resposta não for uma alternativa válida, continua pedindo.
           validarAlternativa(resposta1);
            
              if (resposta1.equalsIgnoreCase("a")) {
                 System.out.println("\n----------> SENHA CORRETA");
                 System.out.println("----------> ABRINDO PORTÃO");
                 ConclusaoFinal1();
               break;
            } else {
               tentativas = tentativas+1;
               System.out.println("----> Tentativa " + tentativas);
               System.out.println("----> Acesso Negado");
            } 
           
         }
            
      }
         
             if (resposta1.equalsIgnoreCase("a") && (tentativas == 5)) {
                //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            System.out.println("\n----------> SENHA CORRETA");
            System.out.println("----------> ABRINDO PORTÃO");
            ConclusaoFinal1();
            } else if(!resposta1.equalsIgnoreCase("a") && (tentativas == 5))  {
             System.out.println(tentativas + " Tentativas de Invasão:");
             System.out.println("SISTEMA DE SEGURANÇA ATIVADO"); 
             ConclusaoFinal2();
        }

    }

    //Desafio final 2 parte 1
    public static void DesafioFinalB1() {
        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        int tentativas = 0;

        System.out.println("\n\nLOGIN: GOVERNO");
        System.out.println("SENHA: _ _ _ _");

        System.out.println("\nComo você define um loop for que faça a senha: 2 4 6 8 ");
        System.out.print("""
                a)for (int i = 0; i <= 8; i = i + 1)
                b)for (int i = 2; i <= 8; i = i + 2)
                c)for (int i = 2; i < 8;  i = i + 2)
                d)for (int i = 2; i <= 8; i = i + 1)
                """);
        String resposta = scanner.nextLine();


        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta);
        
        
        if(resposta.equalsIgnoreCase("b")){
             System.out.println("\n\nLOGIN: GOVERNO");
             System.out.println("SENHA: 2 4 6 8");
             System.out.println("LOGANDO ......\n"); 
             System.out.println("\nDepois de acessar o sistema do governo, você se depara com uma série de"
                              + "\narquivos e começa a vasculhar para encontrar informações que possam"
                              + "\najudar abrir o portão.");
             System.out.println("\nApós horas de busca, tem um arquivo suspeito que parece esta codificado."
                              + "\nUsando suas habilidades em programação, conseguiu descriptografá-lo e"
                              + "\ndescobriu que se trata de um documento com informações sobre o sistema"
                              + "\nde segurança do governo.");
             System.out.println("\nO arquivo contém várias informações sobre os departamentos do prédio."
                              + "\nPorém, uma parte específica chamou sua atenção: A combinação numérica"
                              + "\npara abrir o portão."
                              + "\nEra um mistério até aquele momento, mas agora está diante de seus olhos,"
                              + "\ncomo uma chave para a liberdade. "
                              + "\nA senha é: 29, 38 e 47.");
             DesafioFinalB2(tentativas);
         }else{
            tentativas = tentativas+1;
             System.out.println("----> Tentativa " + tentativas);
             System.out.println("----> Acesso Negado");
        while (tentativas < 5) {
            System.out.println("\nComo você define um loop for que faça a senha: 2 4 6 8 ");
            System.out.printf("a)for (int i = 0; i <= 8; i = i + 1)\n" +
            "b)for (int i = 2; i <= 8; i = i + 2)\n" +
            "c)for (int i = 2; i < 8;  i = i + 2)\n" +
            "d)for (int i = 2; i <= 8; i = i + 1)\n");
            resposta = scanner.nextLine();
          
              
       // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta);
            
            if (resposta.equalsIgnoreCase("b")) {
             System.out.println("\n\nLOGIN: GOVERNO");
             System.out.println("SENHA: 2 4 6 8");
             System.out.println("LOGANDO ......\n"); 
             System.out.println("\nDepois de acessar o sistema do governo, você se depara com uma série de"
                              + "\narquivos e começa a vasculhar para encontrar informações que possam"
                              + "\najudar abrir o portão.");
             System.out.println("\nApós horas de busca, tem um arquivo suspeito que parece esta codificado."
                              + "\nUsando suas habilidades em programação, conseguiu descriptografá-lo e"
                              + "\ndescobriu que se trata de um documento com informações sobre o sistema"
                              + "\nde segurança do governo.");
             System.out.println("\nO arquivo contém várias informações sobre os departamentos do prédio."
                              + "\nPorém, uma parte específica chamou sua atenção: A combinação numérica"
                              + "\npara abrir o portão."
                              + "\nEra um mistério até aquele momento, mas agora está diante de seus olhos,"
                              + "\ncomo uma chave para a liberdade. "
                              + "\nA senha é: 29, 38 e 47.");
                DesafioFinalB2(tentativas);
                break;
            } else {
               tentativas = tentativas+1;
               System.out.println("----> Tentativa " + tentativas);
               System.out.println("----> Acesso Negado");
            }
         }
      }
        
         
        //Enquanto a resposta não for uma alternativa válida, continua pedindo.
        if (resposta.equalsIgnoreCase("b") && (tentativas == 5)) {
             System.out.println("----> Você atingiu o limite máximo de erros:" +tentativas);
             System.out.println("\n\nLOGIN: GOVERNO");
             System.out.println("SENHA: 2 4 6 8");
             System.out.println("LOGANDO ......\n"); 
             System.out.println("\nDepois de acessar o sistema do governo, você se depara com uma série de"
                              + "\narquivos e começa a vasculhar para encontrar informações que possam"
                              + "\najudar abrir o portão.");
             System.out.println("\nApós horas de busca, tem um arquivo suspeito que parece esta codificado."
                              + "\nUsando suas habilidades em programação, conseguiu descriptografá-lo e"
                              + "\ndescobriu que se trata de um documento com informações sobre o sistema"
                              + "\nde segurança do governo.");
             System.out.println("\nO arquivo contém várias informações sobre os departamentos do prédio."
                              + "\nPorém, uma parte específica chamou sua atenção: A combinação numérica"
                              + "\npara abrir o portão."
                              + "\nEra um mistério até aquele momento, mas agora está diante de seus olhos,"
                              + "\ncomo uma chave para a liberdade. "
                              + "\nA senha é: 29, 38 e 47.");
                DesafioFinalB2(tentativas);
            } else if(!resposta.equalsIgnoreCase("b") && (tentativas == 5))  {
             System.out.println(tentativas + " Tentativas de Invasão:");
             System.out.println("SISTEMA DE SEGURANÇA ATIVADO"); 
             ConclusaoFinal2();
        }

    }

    public static void DesafioFinalB2(int tentativas) {
        List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");

        System.out.println("\nQual for gera a senha para abrir o portão ? ");
        System.out.print("""
                a)for (int i = 29; i <= 47; i = i + 9)
                b)for (int i = 29; i < 47; i = i + 9)
                c)for (int i = 29; i > 47;  i = i + 10)
                d)for (int i = 29; i = 47; i = i + 6)
                """);

        //Enquanto a resposta não for uma alternativa válida, continua pedindo.
        String resposta1 = validarAlternativa(options);

        if (resposta1.equalsIgnoreCase("a")) {
            System.out.println("\n----------> SENHA CORRETA");
            System.out.println("----------> ABRINDO PORTÃO");
            ConclusaoFinal1(); 
         }else{
            tentativas = tentativas+1;
             System.out.println("----> Tentativa " + tentativas);
             System.out.println("----> Acesso Negado");
            while (tentativas < 5) {
            System.out.println("\nQual for gera a sequência da senha para abrir o portão ? ");
            System.out.printf("a)for (int i = 29; i <= 47; i = i + 9)\n" +
            "b)for (int i = 29; i < 47; i = i + 9)\n" +
            "c)for (int i = 29; i > 47;  i = i + 10)\n" +
            "d)for (int i = 29; i = 47; i = i + 6)\n"); 
             resposta1 = scanner.nextLine();
          
        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta1);
            
              if (resposta1.equalsIgnoreCase("a")) {
                 System.out.println("\n----------> SENHA CORRETA");
                 System.out.println("----------> ABRINDO PORTÃO");
                 ConclusaoFinal1();
               break;
            } else {
               tentativas = tentativas+1;
               System.out.println("----> Tentativa " + tentativas);
               System.out.println("----> Acesso Negado");
            } 
           
         }
            
      }
         
             if (resposta1.equalsIgnoreCase("a") && (tentativas == 5)) {
                System.out.print("""
                        a)for (int i = 29; i <= 47; i = i + 9)
                        b)for (int i = 29; i < 47; i = i + 9)
                        c)for (int i = 29; i > 47;  i = i + 10)
                        d)for (int i = 29; i = 47; i = i + 6)
                        """);

                //Enquanto a resposta não for uma alternativa válida, continua pedindo.
                resposta1 = validarAlternativa(options);

                if (resposta1.equalsIgnoreCase("a")) {
                    System.out.println("\n----------> SENHA CORRETA");
                    System.out.println("----------> ABRINDO PORTÃO");
                    ConclusaoFinal1();
                    break;
                } else {
                    tentativas = tentativas + 1;
                    System.out.println("----> Tentativa " + tentativas);
                    System.out.println("----> Acesso Negado");
                }

            }

        }

        if (resposta1.equalsIgnoreCase("a") && (tentativas == 5)) {
            System.out.println("\n----------> SENHA CORRETA");
            System.out.println("----------> ABRINDO PORTÃO");
            ConclusaoFinal1();
            } else if(!resposta1.equalsIgnoreCase("a") && (tentativas == 5))  {
             System.out.println(tentativas + " Tentativas de Invasão:");
             System.out.println("SISTEMA DE SEGURANÇA ATIVADO"); 
             ConclusaoFinal2();
        }
    }
        
        
        
        
        
        public static void ConclusaoFinal1(){
        System.out.println("\nCom a senha correta, o portão é aberto e uma onda de alívio"
                + "\npercorre o ambiente."
                + "\nOs rebeldes aproveitam a oportunidade para fugir, correndo em direção"
                + "\nà liberdade que tanto almejavam. A sensação de dever cumprido e a"
                + "\ngratidão pelo sucesso do plano de fuga se misturam em seus corações.");
        
        System.out.println("\nEnquanto vocês observam os rebeldes desaparecendo no horizonte,"
                + "\nseguindo seus caminhos individuais em busca de liberdade, você se"
                + "\nsente profundamente satisfeito por ter desempenhado um papel importante"
                + "\nna transformação de suas vidas.");
        
        System.out.println("\nEnquanto se afastam do local, rumo a um futuro incerto, vocês olham"
                + "\npara trás e sorriem, agradecendo a força da parceria que os levou até ali."
                + "\nUma amizade forte e duradoura foi formada, e vocês sabem que sempre poderão"
                + "\ncontar um com o outro nas adversidades que ainda estão por vir."
                + "\nJuntos, vocês caminham em direção a um novo horizonte.");
        
        System.out.println("""

                Enquanto vocês observam os rebeldes desaparecendo no horizonte,
                seguindo seus caminhos individuais em busca de liberdade, você se
                sente profundamente satisfeito por ter desempenhado um papel importante
                na transformação de suas vidas.""");

        System.out.println("""

                Enquanto se afastam do local, rumo a um futuro incerto, vocês olham
                para trás e sorriem, agradecendo a força da parceria que os levou até ali.
                Uma amizade forte e duradoura foi formada, e vocês sabem que sempre poderão
                contar um com o outro nas adversidades que ainda estão por vir.
                Juntos, vocês caminham em direção a um novo horizonte.""");

        System.out.println("\n\n-----> FIM <-----");

    }
    
    
    
    
         public static void ConclusaoFinal2(){
        
         System.out.println("\nApós a ativação do alarme e a invasão dos guardas, "
                 + "\na situação se torna caótica."
                 + "\nTiros por todo local, crianças choram e você sente o peso"
                 + "\nda responsabilidade e da falha."
                 + "\nEm meio ao tumulto, você e Debbuging se veem encurralados,"
                 + "\nbuscando uma saída para a situação desesperadora.");  
     
         System.out.println("\nDurante a tentativa de fuga em meio ao caos"
                 + "\nDebbuging e você acaba sendo capturados pelos guardas."); 
      
         System.out.println("\nGovernador: Não quero eles vivos e quanto a "
                 + "\nCibelle, coloque-a em cativeiro.");
         
         
         System.out.println("Embora a história tenha tomado um rumo sombrio"
                 + "\ne triste, a coragem e determinação que você e Debbuging"
                 + "\ndemonstraram ao longo da jornada não serão esquecidas."
                 + "\nOs rebeldes continuarão em busca da liberdade e vingança.");
         
         System.out.println("\n\n-----> FIM <-----");
    public static void ConclusaoFinal2() {
        System.out.println("""

                Após a ativação do alarme e a invasão dos guardas,\s
                a situação se torna caótica.
                Tiros por todo local, crianças choram e você sente o peso
                da responsabilidade e da falha.
                Em meio ao tumulto, você e Debug se veem encurralados,
                buscando uma saída para a situação desesperadora.""");

        System.out.println("""

                Durante a tentativa de fuga em meio ao caos
                Debug e você acaba sendo capturados pelos guardas.""");

        System.out.println("""

                Governador: Não quero eles vivos e quanto a\s
                Cibelle, coloque-a em cativeiro.""");


        System.out.println("""
                Embora a história tenha tomado um rumo sombrio
                e triste, a coragem e determinação que você e Debug
                demonstraram ao longo da jornada não serão esquecidas.
                Os rebeldes continuarão em busca da liberdade e vingança.""");

        System.out.println("\n\n-----> FIM <-----");
    }

    private static int obterOpcao(String mensagem, String mensagemErro, int minIncluso, int maxIncluso) {
        if (mensagemErro == null || mensagemErro.trim().isEmpty()) mensagemErro = "Valor informado Inválido!";
        if (maxIncluso < minIncluso) {
            int auxiliar = maxIncluso;
            maxIncluso = minIncluso;
            minIncluso = auxiliar;
        }

        int opcao = Integer.MIN_VALUE;
        do {
            try {
                System.out.print(mensagem);
                opcao = Integer.parseInt(ler.nextLine());
                if (opcao < minIncluso || opcao > maxIncluso)
                    throw new IllegalArgumentException("Valores fora da faixa permitida!");
            } catch (IllegalArgumentException ex) {
                System.err.println(mensagemErro);
                System.err.flush();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException ignored) {
                }
            }
        } while (opcao < minIncluso || opcao > maxIncluso);
        return opcao;
    }

    public static void main(String[] args) {
        System.out.println(Message.UM);
        System.out.println("\n" + Message.DOIS);
        System.out.println("\n" + Message.TRES);

        continuarEnredo(ler);

        System.out.printf("\n" + Message.QUATRO + "\n", "Debug");
        System.out.println("\nQUAL O NOME DO SEU PERSONAGEM ?");
        String nome = ler.nextLine().split(" ")[0];

        System.out.printf("\n\n" + Message.CINCO + "\n", nome, "Debug", "Debug");
        System.out.printf("\n" + Message.SEIS + "\n", nome, "Debug", "Debug");

        continuarEnredo(ler);

        System.out.println("\n\nDebug: " + Message.SETE);
        System.out.printf("\n" + nome + ": " + Message.OITO + "\n", nome);
        System.out.printf("\n" + Message.NOVE + "\n", "Debug", nome);
        System.out.printf("\n" + Message.DEZ + "\n", nome);

        continuarEnredo(ler);

        System.out.printf("\n\n" + Message.ONZE + "\n", "Debug");
        System.out.printf("\n" + Message.DOZE + "\n", nome);
        System.out.printf("\n" + Message.TREZE + "\n", "Debug");

        continuarEnredo(ler);

        System.out.println("\n\n" + Message.QUATORZE);
        System.out.printf("\n" + Message.QUINZE + "\n", "Debug");
        System.out.println("\n" + Message.DEZESSEIS);

        continuarEnredo(ler);

        System.out.printf("\n\n" + Message.DEZESSETE + "\n", "Debug");
        System.out.printf("\n" + Message.DEZOITO + "\n", "Debug");
        System.out.printf("\n" + Message.DEZENOVE + "\n", "Debug");
        System.out.println(Message.VINTE);

        continuarEnredo(ler);

        System.out.printf("\n\n" + Message.VINTE_E_UM + "\n", nome);
        System.out.printf("\n" + Message.VINTE_E_DOIS + "\n", "Debug");
        System.out.println("\n" + Message.VINTE_E_TRES);
        System.out.printf("\n" + Message.VINTE_E_QUATRO + "\n", nome);
        System.out.printf("\n" + Message.VINTE_E_CINCO + "\n", "Debug");
        System.out.println("\n" + Message.VINTE_E_SEIS);

        continuarEnredo(ler);

        System.out.printf("\n\n" + Message.VINTE_E_SETE + "\n", "Debug");
        System.out.printf("\n" + Message.VINTE_E_OITO + "\n", nome);
        System.out.printf("\n" + Message.VINTE_E_NOVE + "\n", "Debug");
        System.out.println("\n" + Message.TRINTA);

        continuarEnredo(ler);

        System.out.printf("\n" + Message.TRINTA_E_UM + "\n", "Debug");
        System.out.printf("\n" + Message.TRINTA_E_DOIS + "\n", "Debug");
        System.out.println("\n" + TextMenus.UM);

        int opcao = obterOpcao("Digite 1 ou 2: ", "Valor informado incorreto!\n", 1, 2);

        if (opcao == 1) {
            System.out.printf("\n\n" + Message.TRINTA_E_TRES + "\n", nome);
            System.out.printf("\n" + Message.TRINTA_E_QUATRO + "\n", "Debug");
        } else {
            System.out.printf("\n\n" + Message.TRINTA_E_CINCO + "\n", nome);
        }

        System.out.println("\n" + Message.TRINTA_E_SEIS);
        System.out.println("\n" + Message.TRINTA_E_SETE + "\n");

        //Acessar material
        obterOpcao(Message.TRINTA_E_NOVE.toString().formatted(1, 1), "Informe apenas 1 para ler o material", 1, 1);

        conteudoBasico();

        //Fazer o 1° Desafio
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 1, 1, "SIM");

        obterOpcao("Digite 1 para fazer o 1° teste: ", "Informe apenas 1 para acessar o 1º teste", 1, 1);

        Desafio1();

        //Fazer o 2° Desafio
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 2, 1, "SIM");

        obterOpcao("Digite 1 para fazer o 2° teste: ", "Informe apenas 1 para acessar o 2º teste", 1, 1);

        Desafio2();

        System.out.printf("\n\n" + Message.TRINTA_E_OITO + "\n", "Debug", 1);

        //Ler o conteúdo intermediário sobre 'For'
        obterOpcao(Message.TRINTA_E_NOVE.toString().formatted(1, 2), "Informe apenas 1 para ler o 2º material", 1, 1);

        conteudoIntermediario();

        //Fazer o 3° desafio
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 3, 1, "SIM");

        obterOpcao("Digite 1 para fazer o 3° teste: ", "Informe apenas 1 para acessar o 3º teste", 1, 1);

        Desafio3();

        System.out.printf("\n\n" + Message.QUARENTA + "\n", "Debug");

        //Ler o conteúdo avançado sobre 'For'
        obterOpcao(Message.TRINTA_E_NOVE.toString().formatted(1, 3), "Informe apenas 1 para acessar o 3º teste", 1, 1);

        conteudoAvancado();

        //Fazer o 4° desafio
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 4, 1, "SIM");

        obterOpcao(Message.QUARENTA_E_UM.toString().formatted(1, 4), "Informe apenas 1 para acessar o 4º teste", 1, 1);

        Desafio4();

        System.out.printf("\n" + Message.QUARENTA_E_DOIS + "\n", "Debug");
        System.out.printf(TextMenus.TRES + "\n", 1, 2, 1, 1, 2, 2);

        opcao = obterOpcao("Digite 1 ou 2: ", "Digite apenas 1 ou 2!\n", 1, 2);

        if (opcao == 1) {
            System.out.printf("\n\n" + Message.QUARENTA_E_TRES + "\n", 1, nome);
            System.out.printf("\n" + Message.QUARENTA_E_QUATRO + "\n", "Debug");
        } else {
            System.out.printf("\n\n" + Message.QUARENTA_E_CINCO + "\n", 2, nome);
            System.out.printf("\n" + Message.QUARENTA_E_SEIS + "\n", "Debug");
        }

        continuarEnredo(ler);

        System.out.printf("\n" + Message.QUARENTA_E_SETE + "\n", "Debug");
        System.out.printf("\n" + Message.QUARENTA_E_OITO + "\n", "Debug");
        System.out.println("\n" + Message.QUARENTA_E_NOVE);
        System.out.printf("\n" + Message.CINQUENTA + "\n", "Debug");

        continuarEnredo(ler);

        System.out.printf("\n\n" + Message.CINQUENTA_E_UM + "\n", "Debug", "Cibelle");
        System.out.printf("\n" + Message.CINQUENTA_E_DOIS + "\n", "Cibelle");
        System.out.printf("\n" + Message.CINQUENTA_E_TRES + "\n", "Cibelle");
        System.out.printf("\n" + Message.CINQUENTA_E_QUATRO + "\n", "Cibelle", "2 4 6 8");
        System.out.println("\n\n" + Message.CINQUENTA_E_CINCO);

        //------> (sorteia o desafio final)
        Random random = new Random();
        int numeroSorteado = random.nextInt(2) + 1; // Gera um número aleatório entre 1 e 2

        //Se for 1, vai jogar desafio final 1
        if (numeroSorteado == 1) {
            System.out.println("\n\n----> DESAFIO FINAL SORTEADO (1) <------");
            DesafioFinalA1();
        } else { //Se for 2, vai jogar o desafio final 2
            System.out.println("\n\n----> DESAFIO FINAL SORTEADO (2) <------");
            DesafioFinalB1();
        }

    }

}
