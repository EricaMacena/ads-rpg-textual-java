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
    public static void conteudoBasico(){
        try {
            Desktop.getDesktop().browse(new URI("https://mega.nz/file/EH1CzSLD#KaThOiB5DsSRpmE2kBG9ZpY9l3q0hrV5fv5rYPN_J9A"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void conteudoIntermediario(){
          try {
            Desktop.getDesktop().browse(new URI("https://mega.nz/file/UaVmyCib#c5rqbHuyYOCnzFt3Z3f6MQkpcSCLBaivHB_vCSNsUck"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void conteudoAvançado(){
           try {
            Desktop.getDesktop().browse(new URI("https://mega.nz/file/RaEjGZqS#hIFI1AmnZV7fx3KPANAP4ItCsT3rWmWas9eM8CVul6c"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    //Material sobre operadores relacionais 
    public static void operadoresRelacionais(){
                   try {
            Desktop.getDesktop().browse(new URI("https://mega.nz/file/5PsF2BiJ#1pFVl29X-nlzUXda2ZSfaANXm1pfPvTnMh06LaqyzMI"));
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
        System.out.println("\n\nDIGITE 1 PARA CONTINUAR: ");
         int continuar = ler.nextInt();
         
         while(continuar != 1){
         System.out.printf("Digite 1 para continuar: ");
         continuar = ler.nextInt();
       }
     
         if(continuar == 1){
         System.out.println("\n"); 
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
        System.out.printf("a)for (int i = 0; i <= 8; i = i + 1)\n" +
            "b)for (int i = 2; i <= 8; i = i + 2)\n" +
            "c)for (int i = 2; i < 8;  i = i + 2)\n" +
            "d)for (int i = 2; i <= 8; i = i + 1)\n");
             String resposta = scanner.nextLine();
        
        
        
        // Enquanto a resposta não for uma alternativa válida, continua pedindo.
        validarAlternativa(resposta);
        
        
        if(resposta.equalsIgnoreCase("b")){
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
        System.out.printf("a)for (int i = 13; i <= 35; i = i + 11)\n" +
            "b)for (int i = 13; i < 35; i = i + 9)\n" +
            "c)for (int i = 13; i > 35;  i = i + 15)\n" +
            "d)for (int i = 13; i = 35; i = i + 6)\n");
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
        System.out.printf("a)for (int i = 0; i <= 8; i = i + 1)\n" +
            "b)for (int i = 2; i <= 8; i = i + 2)\n" +
            "c)for (int i = 2; i < 8;  i = i + 2)\n" +
            "d)for (int i = 2; i <= 8; i = i + 1)\n");
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
        System.out.printf("a)for (int i = 29; i <= 47; i = i + 9)\n" +
            "b)for (int i = 29; i < 47; i = i + 9)\n" +
            "c)for (int i = 29; i > 47;  i = i + 10)\n" +
            "d)for (int i = 29; i = 47; i = i + 6)\n"); 
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

         System.out.println("\n\nDebug: Quem é você e por que está me seguindo?");

         System.out.println("\n" + nome + ": Desculpe, não foi minha intenção assustá-lo."
                          + "\nEu ouvi falar sobre você e seu trabalho com programação,"
                          + "\ne estou interessado(a) em ajudar a sua causa."
                          + "\nMe chamo " + nome);

         System.out.println("\nDebug: Hum... não é todo dia que alguém me segue até"
                          + "\num beco escuro às dez da noite " + nome +"."
                          + "\nMas tudo bem, vou dar o benefício da dúvida."
                          + "\nComo você pode ajudar ?");

         System.out.println("\n" + nome + ": Bem, eu não sou experiente, mas estou"
                          + "\ninteressado(a) nem aprender e contribuir com o que"
                          + "\nfor necessário. "
                          + "\nTenho algumas noções básicas de Java e acredito que"
                          + "\nposso ser útil para abrir o portão, se for ensinado.");
     
         
         
         continuarEnredo();
     

         System.out.println("\n\nDebug: Ah, entendi. Bom, nós precisamos de pessoas"
                 + "\ncom vontade de aprender e ajudar. Mas não podemos nos arriscar"
                 + "\ncom desconhecidos, se você quiser se juntar a nós,"
                 + "\nterá que provar.");

         System.out.println("\n" + nome + ": O que devo fazer?");
     
     
         System.out.println("\nDebug: Eu quero que você prove que está do nosso lado."
                          + "\nTire o chip que o governo implantou na sua orelha."
                          + "\nSe você é mesmo um rebelde, não deveria estar usando"
                          + "\nessas tecnologias de rastreamento.");
         
         
         continuarEnredo();
         
         

         System.out.println("\n\nVocê sente um arrepio percorrer seu corpo, mas decide"
                          + "\nque está disposto a provar sua lealdade."
                          + "\nCom as mãos trêmulas, você aceita a proposta e retira"
                          + "\no chip da sua orelha, sentindo-se vulnerável sem ele.");

         System.out.println("\nDebug faz um olhar penetrante e avaliador antes de dizer:"
                          + "\nMuito bem, você passou no teste."
                          + "\nMas ainda não posso confiar completamente em você.");
         
         
     
         System.out.println("\nEle pega o chip da sua mão e guarda em seu bolso, e em seguida,"
                          + "\ncomeça a caminhar em direção a um prédio abandonado nas"
                          + "\nproximidades."
                          + "\nVocê segue-o com hesitação, se perguntando o que vai acontecer.");
    
         
         continuarEnredo();
         
         
         System.out.println("\n\nVocês chegam ao prédio abandonado, Debug pega uma lanterna"
                          + "\nde sua mochila."
                          + "\nEle acende, em seguida aponta para um corredor escuro"
                          + "\ne empoeirado.");

         System.out.println("\nDebug: Vamos entrar aqui. Há algo que eu preciso te mostrar.");

         System.out.println("\nVocê segue Debug pelo corredor enquanto a luz da lanterna"
                          + "\nilumina o caminho."
                          + "\nO ar é úmido e o cheiro de mofo é forte."
                          + "\nVocê começa a sentir que algo estranho está acontecendo.");
 
         System.out.println("De repente, você ouve um ruído. Algo parece estar se movendo"
                          + " na escuridão.");
         
         
         
         continuarEnredo();
         
         

         System.out.println("\n\n" + nome + ":O que é isso?");

         System.out.println("\nDebug: Não se preocupe. É só o vento.");
     
         System.out.println("\nVocê olha para trás e percebe que não"
                          + "\nhá janelas naquele corredor.");

         System.out.println("\n" + nome + ": Como pode ser o vento?"
                          + "\nNão há janelas aqui!");
 
         System.out.println("\nDebug: Eu disse não se preocupe."
                          + "\nVamos continuar.");

         System.out.println("Vocês caminham até uma porta no final do corredor."
                          + "\nDebug a abre e vocês entram em uma sala escura.");
         
         
         
         continuarEnredo();
         

           
         System.out.println("\n\nVocê fica perplexo ao ver um cômodo escuro, com apenas"
                          + "\numa cadeira no centro do local e uma luz fraca no teto."
                          + "\nDebug te puxa para dentro e fecha a porta atrás de si.");
     
     
         System.out.println("\n" + nome + ": O que é isso? O que está acontecendo ?"
                          + "\nvocê pergunta, sentindo seu coração acelerar.");

         System.out.println("\nDebug coloca a mão em seu ombro, tentando te acalmar."
                          + "\nEu preciso que você entenda que essa é uma situação séria. "
                          + "\nO governo não pode saber. É por isso que precisamos de"
                          + "\npessoas sigilosas, que estão dispostas a arriscar tudo"
                          + "\npara ajudar nossa causa.");

         System.out.println("\nEle caminha até a cadeira e aponta para ela."
                         + "\nSente-se, ele diz.");
         
         
         
         continuarEnredo();
         

         
         System.out.println("\nDebug começa a explicar como será o treinamento e"
                          + "\ncomo você poderá contribuir com a causa."
                          + "\nEle entrega uma apostila sobre loop for.");

         System.out.println("\nDebug: Para abrir o portão, você precisa saber sobre"
                          + "\nLoop For, o governo colocou um sistema de segurança"
                          + "\nbaseado nisso. Então, montei um material com tudo que"
                          + "\nvocê precisa para quebrar esse sistema.");
     
         System.out.println("\n-----> ESCOLHA <------");
         System.out.println("Opção 1: Perguntar como ele sabe exatamente o que precisa.");
         System.out.println("Opção 2: Não questionar. Pedir para continuar com a explicação.");
         System.out.println("\nDIGITE 1 PARA (OPÇÃO 1) OU 2 PARA (OPÇÃO 2):");

         int opcao = ler.nextInt();
  
         while(opcao != 1 && opcao != 2){
         System.out.printf("Digite 1 ou 2: ");
         opcao = ler.nextInt();
         }
  
  
         //Opção 1
         if(opcao == 1){
         System.out.println("\n\nContinuar com opção 1:\n"+nome+": Surgiu uma curiosidade..."
                          + "\nComo você sabe exatamente o que precisa para quebrar o sistema de segurança ?");
        
         System.out.println("\nDebug: Isso não é importante, a partir de agora você"
                          + "\nprecisa se dedicar, não podemos perder tempo. "
                          + "\nTemos que abrir o portão antes que seja tarde demais.");
     
         System.out.println("Vamos começar, fiz essa apostila dividida em 3 módulos,"
                           + "\ncada um com um nível de complexidade diferente."
                           + "\nO primeiro módulo aborda conceitos básicos sobre"
                           + "\nestrutura de repetição."
                           + "\nLeia, quando terminar faça os dois testes que está"
                           + "\n no seu computador.");
         
         System.out.println("\nVocê concorda balançado a cabeça e começa a ler o material.");
          
         }
  
         
         //Opção 2
         else {
         System.out.println("\n\nContinuação opção 2:\n"+nome+": Detalhe um pouco mais.");
         System.out.println("\nDebug: Fiz essa apostila dividida em 3 módulos,"
                          + "\ncada um com um nível de complexidade diferente."
                          + "\nO primeiro módulo aborda conceitos básicos sobre"
                          + "\nestrutura de repetição."
                          + "\nLeia, quando terminar faça os dois testes que está"
                          + "\nno computador.");
         
           System.out.println("\n\nVocê concorda balançado a cabeça e começa a ler o material.");
         
         }
  
         
         //Acessar material
         System.out.println("Digite 1 para ler o material: ");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){
         System.out.printf("Digite 1 para ler o material: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         conteudoBasico();  
         }
     
   
     
         //Fazer 1° Desafio 
         System.out.println("\n\nESTÁ PRONTO PARA FAZER O 1º TESTE ?");
         System.out.println("Digite 1 para <SIM>");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){
         System.out.printf("Digite 1 para fazer o 1º teste: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         Desafio1();  
         }
     
         //Fazer 2° Desafio 
         System.out.println("\n\nESTÁ PRONTO PARA FAZER O 2º TESTE ?");
         System.out.println("Digite 1 para <SIM>");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){
         System.out.printf("Digite 1 para fazer o 2º teste: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         Desafio2();  
         }
     
     
     
         System.out.println("\n\nDebug: Segundo módulo é intermediário, com tópicos"
                          + "\nmais específicos sobre cada parte que compõem o for."
                          + "\nLembre-se, quando terminar digite 1 para fazer outro teste.");

         
         
         //Ler o ConteudoIntermediario sobre For
         System.out.println("Digite 1 para ler 2º material: ");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){
         System.out.printf("Digite 1 para ler 2º material: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         conteudoIntermediario();  
         }
  
  
       
         //Fazer o 3° teste
         System.out.println("\n\nESTÁ PRONTO PARA FAZER O 3º TESTE ?");
         System.out.println("Digite 1 para <SIM>");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){
         System.out.printf("Digite 1 para fazer o 3º teste: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         Desafio3();  
         }
      
  
  
     
         System.out.println("\n\nDebug: Já o terceiro módulo é avançado, com conteúdo"
                          + "\ntécnico e detalhado sobre cada iteração do for.");
     
         
         //Ler o conteudoAvançado sobre For 
         System.out.println("Digite 1 para ler 3º material: ");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){
         System.out.printf("Digite 1 para ler 3º material: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         conteudoAvançado();  
         }
         
         
     
         //Fazer 4° Teste
         System.out.println("\n\nESTÁ PRONTO PARA FAZER O 4º TESTE ?");
         System.out.println("Digite 1 para <SIM>");
         opcao = ler.nextInt();
         System.out.println("\n");
         while(opcao != 1){ 
         System.out.printf("Digite 1 para fazer o 4º teste: ");
         opcao = ler.nextInt();
         } 
     
         if(opcao == 1){
         Desafio4();  
         }
  
     
     
     
         System.out.println("\nDebug pega o celular e manda um áudio aos rebeldes"
                          + "\ninformando que o momento para invadir o prédio do"
                          + "\ngoverno chegou, e há duas opções:");
         
         System.out.println("\n-----> ESCOLHA <------");
         System.out.println("Opção 1: Se desesperar e dizer que não se sente pronto para a invasão.");
         System.out.println("Opção 2: Se manter calmo e confiante, dizendo que está pronto para invadir o sistema de segurança.");
         System.out.println("\nDIGITE 1 PARA (OPÇÃO 1) OU 2 PARA (OPÇÃO 2):");
     
         opcao = ler.nextInt();
  
         while(opcao != 1 && opcao != 2){
         System.out.printf("Digite 1 ou 2: ");
         opcao = ler.nextInt();
         }
  
  
         if(opcao == 1){
         System.out.println("\n\nContinuar com opção 1:\n"+nome+": Como assim ??"
                          + "\nNão estou pronto agora.");
         System.out.println("\nDebug: Está sim. Inclusive, você terá o material"
                          + "\ntodo em mãos para consultar, se acalme.");
        }
      
         else{
         System.out.println("\n\nContinuar com opção 2:\n"+nome+": Estou pronto para invadir o sistema,"
                          + "\nestá na hora de alcançarmos nossa liberdade e justiça.");
         System.out.println("\nDebug sorri e diz: Ótimo! Sua coragem será fundamental nessa missão."
                          + "\nVamos lá, juntos venceremos essa batalha.");
      }
      
      
      
      
       
         continuarEnredo();
     
      
      
         System.out.println("\n\nDebug, você e os rebeldes chegam ao prédio do governo no meio da noite."
                          + "\nEnquanto alguns grupos espalham bombas de fumaça e gás para neutralizar"
                          + "\nos guardas, vocês se infiltram no prédio.");
         System.out.println("\nDebug consegue despistar os seguranças e continua em direção à sala do"
                          + "\ngovernador."
                          + "\nChegando lá, ele encontra o governador e começa uma discussão sobre a"
                          + "\nopressão do povo."
                          + "\nNesse momento, a esposa do governador entra na sala e se junta à discussão.");
         System.out.println("\nA esposa revela que não apoia o que o marido está fazendo com as pessoas,"
                          + "\nmantendo-as em escravidão sem poderem dormir mais de 4 horas por noite e"
                          + "\ncomendo menos de 2 refeições diárias. Ela conta que já tentou convencê-lo a"
                          + "\nmudar, mas ele não ouviu.");
         System.out.println("\nO governador rebate, dizendo que ela deveria apoia-lo por ser mulher dele."
                          + "\nNesse momento, você é surpreendido(a) quando a esposa do governador revela"
                          + "\nque está tendo um caso com o Debug.");
      
      
      
      

         continuarEnredo();
    
     
     
     
         System.out.println("\n\nDebug: Cibelle ajude ele enquanto mantenho o governador amarrado aqui..");
     
         System.out.println("\nCibelle, acompanha você até o computador do governador, explicando a gravidade"
                          + "\nda situação. Ela revela que o sistema de segurança é extremamente sensível e"
                          + "\npermite apenas quatro tentativas de senha antes de acionar o alarme.");
     
         System.out.println("\nCom cada tentativa mal sucedida, o risco de ser descoberto aumenta."
                          + "\nCibelle destaca que, no quinto erro, os seguranças de outros prédios"
                          + "\nserão alertados e invadirão imediatamente o local.");
     
         System.out.println("\nCibelle: 2 4 6 8, essa é a senha para logar.");
     
     
         System.out.println("\n\nDiante do computador, você se prepara mentalmente para enfrentar o desafio que se apresenta.");
         
         
         
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

