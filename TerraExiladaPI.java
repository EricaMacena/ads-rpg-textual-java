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

    //---------> Material em PDF Loop For
    public static void conteudoBasico() {
        try {
            Desktop.getDesktop().browse(new URI(Urls.CONTEUDO_BASICO.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void conteudoIntermediario() {
        try {
            Desktop.getDesktop().browse(new URI(Urls.CONTEUDO_INTERMEDIARIO.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void conteudoAvançado() {
        try {
            Desktop.getDesktop().browse(new URI(Urls.CONTEUDO_AVANCADO.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Material sobre operadores relacionais 
    public static void operadoresRelacionais() {
        try {
            Desktop.getDesktop().browse(new URI(Urls.OPERADORES_RELACIONAIS.getUrl()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    //Continua pedindo uma alternativa válida
    public static void validarAlternativa(String resposta){
        Scanner scanner = new Scanner(System.in);
     while (!resposta.equalsIgnoreCase("A") && !resposta.equalsIgnoreCase("B") && !resposta.equalsIgnoreCase("C") && !resposta.equalsIgnoreCase("D")) {
            System.out.print("\nDigite (a, b, c ou d): ");
            resposta = scanner.nextLine();
        }
    
    }
    
    
   
    public static void continuarEnredo(){
        Scanner ler = new Scanner(System.in);
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

    // Alternativas
    String[] alternativas = {"Comparar dois valores", "Criar uma função matemática",
            "Realizar operações matemáticas com variáveis", "Repetir uma sequência de comandos por um número determinado de vezes"};

    // Muda a ordem 
    Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

    // Exibe as alternativas 
    System.out.println("\n--- Desafio 1 ---");
    System.out.println("Qual a função do comando \"for\" em linguagens de programação? ");
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
    
    
    
     
    //2° Desafio sobre conteúdoBasico do For 
      public static void Desafio2() {
    Scanner scanner = new Scanner(System.in);

    // Alternativas
    String[] alternativas = {"for(inicialização; atualização; incrementar ou decrementar)", "for(condição de continuação; inicialização; incrementar ou decrementar)",
            "for(inicialização; condição de continuação; incrementar ou decrementar)", "for(inicialização; incrementar ou decrementar; condição de continuação)"};

    // Muda a ordem 
    Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

    // Exibe as alternativas 
    System.out.println("\n--- Desafio 2 ---");
    System.out.println("Quais são as 3 partes que compõem a estrutura for ? ");
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
    
    
    
      
      // 3° Desafio sobre o ConteúdoIntermediaro do For 
     public static void Desafio3() {
     Scanner scanner = new Scanner(System.in);

     // Array com as alternativas
     String[] alternativas = {"Determinar o valor inicial da variável de controle do loop", "Verificar se o loop deve continuar executando",
            "Atualizar o valor da variável de controle do loop em cada iteração", "Definir a ação a ser realizada em cada iteração do loop"};

     // Muda a ordem 
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

     // Array com as alternativas
     String[] alternativas = {"for (int i = 0; i <= 10; i++)", "for (int i = 1; i <= 10; i++)",
            "for (int i = 0; i < 10; i++)", "for (int i = 1; i < 10; i++)"};

     // Muda a ordem 
     Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

     // Exibe as alternativas
      System.out.println("\n--- Desafio 4 ---");
      System.out.println("Como você define um loop for que mostre 10 números, começando com o zero ? ");
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
      
       
       
       
       public static void DesafioFinalA1(){
       Scanner scanner = new Scanner(System.in);
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
  


        public static void DesafioFinalA2(int tentativas){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nQual for gera a senha para abrir o portão ? ");
        System.out.print("""
                a)for (int i = 13; i <= 35; i = i + 11)
                b)for (int i = 13; i < 35; i = i + 9)
                c)for (int i = 13; i > 35;  i = i + 15)
                d)for (int i = 13; i = 35; i = i + 6)
                """);
        String resposta1 = scanner.nextLine();


        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta1);
        
        
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
            System.out.println("\n----------> SENHA CORRETA");
            System.out.println("----------> ABRINDO PORTÃO");
            ConclusaoFinal1();
            } else if(!resposta1.equalsIgnoreCase("a") && (tentativas == 5))  {
             System.out.println(tentativas + " Tentativas de Invasão:");
             System.out.println("SISTEMA DE SEGURANÇA ATIVADO"); 
             ConclusaoFinal2();
        }
       
        
        
        }
            
        
        
    
        // Desafio final 2 parte 1
        public static void DesafioFinalB1(){
         Scanner scanner = new Scanner(System.in);
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
        
        
        
    
    
   
    
    public static void DesafioFinalB2(int tentativas){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nQual for gera a senha para abrir o portão ? ");
        System.out.print("""
                a)for (int i = 29; i <= 47; i = i + 9)
                b)for (int i = 29; i < 47; i = i + 9)
                c)for (int i = 29; i > 47;  i = i + 10)
                d)for (int i = 29; i = 47; i = i + 6)
                """);
        String resposta1 = scanner.nextLine();


        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta1);
        
        
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
                resposta1 = scanner.nextLine();

                // Enquanto a resposta não for uma alternativa válida, continua pedindo.
                validarAlternativa(resposta1);

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
     
      
    
    
       
    
    
    
         public static void main(String[] args) {
         Scanner ler = new Scanner(System.in); 
         int continuar = 0;
        
         System.out.println("Bem-vindo a um mundo chamado de [Terra Exilada],"
                        + "\nonde uma guerra devastadora deixou metade do"
                        + "\nplaneta em ruínas."
                        + "\nOs sobreviventes encontraram refúgio em um"
                        + "\nlocal isolado, buscando proteção e esperança"
                        + "\nem meio à destruição..");
         
         System.out.println("\nNo entanto, a promessa de segurança se transformou"
                          + "\nem opressão quando um grupo de pessoas começou a"
                          + "\nabusar de sua autoridade, exercendo poder sobre os"
                          + "\ndesarmados."
                          + "\nEssas pessoas são o governo, que controla a todos"
                          + "\ne os mantêm aprisionados com um portão fechado.");
         
         
         System.out.println("\nAqueles sem armas são tratados como segunda"
                          + "\nclasse, sujeitos a abusos e privados de seus"
                          + "\ndireitos básicos."
                          + "\nA liberdade se tornou uma ilusão distante,"
                          + "\ne a vida nacidade é marcada pela opressão"
                          + "\ne desespero.");
         
         
         
         
         continuarEnredo();
         
         
         System.out.println("\nNo entanto, um grupo  destemido está determinado a derrubar o governo"
                          + "\nem prol de uma causa: a liberdade."
                          + "\nO líder Debug nomeou o grupo de [Rebeldes], os membros estão dispostos"
                          + "\na lutar e acabar com as injustiças. A resistência está se formando e a"
                          + "\nbatalha para conquistar a verdadeira liberdade está prestes a COMEÇAR."
                          + "\n------> CHEGOU A SUA HORA <------");
         
         
       
         
         System.out.println("\nQUAL O NOME DO SEU PERSONAGEM ?");
         String nome = ler.next();
        
         
         
         System.out.println("\n\nUm dia, "+nome+" começa a ouvir rumores sobre um misterioso programador"
                          + "\nchamado Debug, ele está ensinando o que é necessário para abrir o portão."
                          + "\nAs pessoas que se cansaram do governo conhecem Debug através de várias"
                          + "\nmaneiras, desde mensagens secretas em fóruns de programação até encontros"
                          + "\nnoturnos em lugares isolados. Porém, Ninguém sabe sua verdadeira identidade"
                          + "\nmas todos reconhecem sua habilidade em programação.");


         System.out.println("\n"+nome+" estava a caminho de casa após um longo dia de trabalho quando avistou"
                          + "\nDebug andando pela rua. "
                          + "\nCurioso(a), você decidiu segui-lo, pensando que ele poderia estar a caminho de"
                          + "\nalgum encontro com os rebeldes. "
                          + "\nAcompanhando-o, vocês chegam a um beco escuro e isolado, quando Debug finalmente"
                          + "\nte percebe a sua presença e vira-se bruscamente para você.");
     
          continuarEnredo();

        System.out.println("\n\nDebug: " + Message.SETE);
        System.out.printf("\n" + nome + ": " + Message.OITO + "\n", nome);
        System.out.printf("\n" + Message.NOVE + "\n", "Debug", nome);
        System.out.printf("\n" + Message.DEZ + "\n", nome);

        continuarEnredo();

        System.out.printf("\n\n" + Message.ONZE + "\n", "Debug");
        System.out.printf("\n" + Message.DOZE + "\n", nome);
        System.out.printf("\n" + Message.TREZE + "\n", "Debug");

        continuarEnredo();

        System.out.println("\n\n" + Message.QUATORZE);
        System.out.printf("\n" + Message.QUINZE + "\n", "Debug");
        System.out.println("\n" + Message.DEZESSEIS);

        continuarEnredo();

        System.out.printf("\n\n" + Message.DEZESSETE + "\n", "Debug");
        System.out.printf("\n" + Message.DEZOITO + "\n", "Debug");
        System.out.printf("\n" + Message.DEZENOVE + "\n", "Debug");
        System.out.println(Message.VINTE);

        continuarEnredo();

        System.out.printf("\n\n" + Message.VINTE_E_UM + "\n", nome);
        System.out.printf("\n" + Message.VINTE_E_DOIS + "\n", "Debug");
        System.out.println("\n" + Message.VINTE_E_TRES);
        System.out.printf("\n" + Message.VINTE_E_QUATRO + "\n", nome);
        System.out.printf("\n" + Message.VINTE_E_CINCO + "\n", "Debug");
        System.out.println("\n" + Message.VINTE_E_SEIS);

        continuarEnredo();

        System.out.printf("\n\n" + Message.VINTE_E_SETE + "\n", "Debug");
        System.out.printf("\n" + Message.VINTE_E_OITO + "\n", nome);
        System.out.printf("\n" + Message.VINTE_E_NOVE + "\n", "Debug");
        System.out.println("\n" + Message.TRINTA);

        continuarEnredo();

        System.out.printf("\n" + Message.TRINTA_E_UM + "\n", "Debug");
        System.out.printf("\n" + Message.TRINTA_E_DOIS + "\n", "Debug");
        System.out.println("\n" + TextMenus.UM);

        // TODO transformar num método
        int opcao = ler.nextInt();

        while (opcao != 1 && opcao != 2) {
            System.out.print("Digite 1 ou 2: ");
            opcao = ler.nextInt();
        }

        //Opção 1
        if (opcao == 1) {
            System.out.printf("\n\n" + Message.TRINTA_E_TRES + "\n", nome);
            System.out.printf("\n" + Message.TRINTA_E_QUATRO + "\n", "Debug");
        }
        //Opção 2
        else {
            System.out.printf("\n\n" + Message.TRINTA_E_CINCO + "\n", nome);
        }

        System.out.println("\n" + Message.TRINTA_E_SEIS);
        System.out.println("\n" + Message.TRINTA_E_SETE + "\n");

        //Acessar material
        System.out.println("Digite 1 para ler o material: ");
        // TODO transformar num método
        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.print("Digite 1 para ler o material: ");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            conteudoBasico();
        }


        //Fazer 1° Desafio
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 1, 1, "SIM");

        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.print("Digite 1 para fazer o 1º teste: ");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            Desafio1();
        }

        //Fazer 2° Desafio
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 2, 1, "SIM");
        // TODO transformar em método
        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.print("Digite 1 para fazer o 2º teste: ");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            Desafio2();
        }


        System.out.printf("\n\n" + Message.TRINTA_E_OITO + "\n", "Debug", 1);

        //Ler o conteúdo intermediário sobre 'For'
        System.out.println("Digite 1 para ler 2º material: ");
        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.printf(Message.TRINTA_E_NOVE.toString(), 1, 2);
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            conteudoIntermediario();
        }


        //Fazer o 3° teste
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 3, 1, "SIM");

        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.printf("\n\n" + TextMenus.DOIS + "\n", 3, 1, "SIM");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            Desafio3();
        }

        System.out.printf("\n\n" + Message.QUARENTA + "\n", "Debug");

        //Ler o conteúdo avançado sobre 'For'
        System.out.printf(Message.TRINTA_E_NOVE.toString(), 1, 3);
        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.print("Digite 1 para ler 3º material: ");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            conteudoAvançado();
        }


        //Fazer 4° Teste
        System.out.printf("\n\n" + TextMenus.DOIS + "\n", 4, 1, "SIM");
        opcao = ler.nextInt();
        System.out.println("\n");
        while (opcao != 1) {
            System.out.printf(Message.QUARENTA_E_UM.toString(), 1, 4);
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            Desafio4();
        }


        System.out.printf("\n" + Message.QUARENTA_E_DOIS + "\n", "Debug");
        System.out.printf(TextMenus.TRES + "\n", 1, 2, 1, 1, 2, 2);

        opcao = ler.nextInt();

        while (opcao != 1 && opcao != 2) {
            System.out.print("Digite 1 ou 2: ");
            opcao = ler.nextInt();
        }


        if (opcao == 1) {
            System.out.printf("\n\n" + Message.QUARENTA_E_TRES + "\n", 1, nome);
            System.out.printf("\n" + Message.QUARENTA_E_QUATRO + "\n", "Debug");
        } else {
            System.out.printf("\n\n" + Message.QUARENTA_E_CINCO + "\n", 2, nome);
            System.out.printf("\n" + Message.QUARENTA_E_SEIS + "\n", "Debug");
        }

        continuarEnredo();

        System.out.printf("\n" + Message.QUARENTA_E_SETE + "\n", "Debug");
        System.out.printf("\n" + Message.QUARENTA_E_OITO + "\n", "Debug");
        System.out.println("\n" + Message.QUARENTA_E_NOVE);
        System.out.printf("\n" + Message.CINQUENTA + "\n", "Debug");

        continuarEnredo();

        System.out.printf("\n\n" + Message.CINQUENTA_E_UM + "\n", "Debug", "Cibelle");
        System.out.printf("\n" + Message.CINQUENTA_E_DOIS + "\n", "Cibelle");
        System.out.printf("\n" + Message.CINQUENTA_E_TRES + "\n", "Cibelle");
        System.out.printf("\n" + Message.CINQUENTA_E_QUATRO + "\n", "Cibelle", "2 4 6 8");
        System.out.println("\n\n" + Message.CINQUENTA_E_CINCO);

        //------> (sorteia o desafio final)
        Random random = new Random();
        int numeroSorteado = random.nextInt(2) + 1; // Gera um número aleatório entre 1

         //Se for 1 vai jogar desafio final 1
         if (numeroSorteado == 1) {
            System.out.println("\n\n----> DESAFIO FINAL SORTEADO (1) <------");
            DesafioFinalA1();
            
         //Se for 2 vai jogar o desafio final 2
          } else if (numeroSorteado == 2) {
          System.out.println("\n\n----> DESAFIO FINAL SORTEADO (2) <------");
          DesafioFinalB1();
         }
     
 }
  
     }

