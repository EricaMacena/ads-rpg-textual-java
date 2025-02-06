/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terraexiladapi;

import java.awt.Desktop;
import java.net.URI;
import java.util.*;

/**
 * @author Erica
 */
public class TerraExiladaPI {
    private static final Scanner ler = new Scanner(System.in);
    private static final List<String> options = List.of("A", "B", "C", "D", "a", "b", "c", "d");
    private static final Map<DesafioId, String[]> mapaDeAlternativas = new HashMap<>();

    static {
        mapaDeAlternativas.put(DesafioId.A1, new String[]{
                "for (int i = 0; i <= 8; i = i + 1)",
                Message.OITENTA_E_SEIS.toString(),
                "for (int i = 2; i < 8;  i = i + 2)",
                "for (int i = 2; i <= 8; i = i + 1)"
        });
        mapaDeAlternativas.put(DesafioId.A2, new String[]{
                "for (int i = 13; i <= 35; i = i + 11)",
                "for (int i = 13; i < 35; i = i + 9)",
                "for (int i = 13; i > 35;  i = i + 15)",
                "for (int i = 13; i = 35; i = i + 6)"
        });
        mapaDeAlternativas.put(DesafioId.B2, new String[]{
                "for (int i = 29; i <= 47; i = i + 9)",
                "for (int i = 29; i < 47; i = i + 9)",
                "for (int i = 29; i > 47;  i = i + 10)",
                "for (int i = 29; i = 47; i = i + 6)"
        });
        mapaDeAlternativas.put(DesafioId.D1, new String[]{
                "Comparar dois valores",
                "Criar uma função matemática",
                "Realizar operações matemáticas com variáveis",
                "Repetir uma sequência de comandos por um número determinado de vezes"
        });
        mapaDeAlternativas.put(DesafioId.D2, new String[]{
                "for(inicialização; atualização; incrementar ou decrementar)",
                "for(condição de continuação; inicialização; incrementar ou decrementar)",
                Message.OITENTA_E_TRES.toString(),
                "for(inicialização; incrementar ou decrementar; condição de continuação)"
        });
        mapaDeAlternativas.put(DesafioId.D3, new String[]{
                "Determinar o valor inicial da variável de controle do loop",
                Message.OITENTA_E_QUATRO.toString(),
                "Atualizar o valor da variável de controle do loop em cada iteração",
                "Definir a ação a ser realizada em cada iteração do loop"
        });
        mapaDeAlternativas.put(DesafioId.D4, new String[]{
                "for (int i = 0; i <= 10; i++)",
                "for (int i = 1; i <= 10; i++)",
                Message.OITENTA_E_CINCO.toString(),
                "for (int i = 1; i < 10; i++)"
        });

    }

    private static String[] alternativasDoDesafio(DesafioId desafioId) {
        if (desafioId == null) throw new IllegalArgumentException("Desafio passado como argumento não pode ser nulo!");
        return mapaDeAlternativas.get(desafioId);
    }

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

    //1° Desafio sobre conteúdo básico do 'For'
    public static void Desafio1() {
        //Alternativas
        String[] alternativas = alternativasDoDesafio(DesafioId.D1);

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

        //Exibe as alternativas
        System.out.println("\n--- Desafio 1 ---");
        System.out.println(Message.SETENTA_E_SEIS);
        System.out.println(listarAlternativas(alternativas));

        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            String resposta = validarAlternativa(options);

            int escolha = resposta.toUpperCase().charAt(0) - 65;

            if (alternativas[escolha].contains(Message.SETENTA_E_SETE.toString())) {
                System.out.println(Message.OITENTA);
                break;
            } else {
                erros++;
                System.out.printf(Message.SETENTA_E_CINCO + "\n", erros);
                Collections.shuffle(Arrays.asList(alternativas));
                System.out.println("\n\n" + Message.SETENTA_E_SEIS);
                System.out.println(listarAlternativas(alternativas));
                tentativas++;
            }
        }

        if (tentativas >= 3) {
            System.out.println(Message.SETENTA_E_UM);
        }

    }

    //2° Desafio sobre conteúdo básico do 'For'
    public static void Desafio2() {
        //Alternativas
        String[] alternativas = alternativasDoDesafio(DesafioId.D2);

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

        //Exibe as alternativas
        System.out.println("\n--- Desafio 2 ---");
        System.out.println(Message.SETENTA_E_OITO);
        System.out.println(listarAlternativas(alternativas));

        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            String resposta = validarAlternativa(options);

            int escolha = resposta.toUpperCase().charAt(0) - 65;

            if (alternativas[escolha].contains(Message.OITENTA_E_TRES.toString())) {
                System.out.println(Message.OITENTA);
                break;
            } else {
                erros++;
                System.out.printf(Message.SETENTA_E_CINCO + "\n", erros);
                Collections.shuffle(Arrays.asList(alternativas));
                System.out.println("\n\n" + Message.SETENTA_E_OITO);
                System.out.println(listarAlternativas(alternativas));
                tentativas++;
            }
        }

        if (tentativas >= 3) {
            System.out.println(Message.SETENTA_E_DOIS);
        }

    }

    //3º Desafio sobre o conteúdo intermediário do 'For'
    public static void Desafio3() {
        //Array com as alternativas
        String[] alternativas = alternativasDoDesafio(DesafioId.D3);

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

        //Exibe as alternativas
        System.out.println("\n--- Desafio 3 ---");
        System.out.println(Message.SETENTA_E_NOVE);
        System.out.println(listarAlternativas(alternativas));

        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            String resposta = validarAlternativa(options);

            int escolha = resposta.toUpperCase().charAt(0) - 65;

            if (alternativas[escolha].contains(Message.OITENTA_E_QUATRO.toString())) {
                System.out.println(Message.OITENTA);
                break;
            } else {
                erros++;
                System.out.printf(Message.SETENTA_E_CINCO + "\n", erros);
                Collections.shuffle(Arrays.asList(alternativas));
                System.out.println("\n\n" + Message.SETENTA_E_NOVE);
                System.out.println(listarAlternativas(alternativas));
                tentativas++;
            }
        }

        if (tentativas >= 3) {
            System.out.println(Message.SETENTA_E_TRES);
        }

    }

    //4º Teste sobre o conteúdo avançado do 'For'
    public static void Desafio4() {
        //Array com as alternativas
        String[] alternativas = alternativasDoDesafio(DesafioId.D4);

        //Muda a ordem
        Collections.shuffle(new ArrayList<>(Arrays.asList(alternativas)));

        //Exibe as alternativas
        System.out.println("\n--- Desafio 4 ---");
        System.out.println(Message.OITENTA_E_UM);
        System.out.println(listarAlternativas(alternativas));

        int tentativas = 0;
        int erros = 0;

        while (tentativas < 3) {
            //Enquanto a resposta não for uma alternativa válida, continua pedindo.
            String resposta = validarAlternativa(options);

            int escolha = resposta.toUpperCase().charAt(0) - 65;

            if (alternativas[escolha].contains(Message.OITENTA_E_CINCO.toString())) {
                System.out.println(Message.OITENTA);
                break;
            } else {
                erros++;
                System.out.printf(Message.SETENTA_E_CINCO + "\n", erros);
                Collections.shuffle(Arrays.asList(alternativas));
                System.out.println("\n\n" + Message.OITENTA_E_UM);
                System.out.println(listarAlternativas(alternativas));
                tentativas++;
            }
        }

        if (tentativas >= 3) {
            System.out.println(Message.SETENTA_E_QUATRO);
        }

    }

    private static void desafioFinalA2eB2(int tentativas, DesafioId desafioId) {
        if (desafioId == null) throw new IllegalArgumentException("DesafioId informado não deve ser nulo");
        String[] alternativas = alternativasDoDesafio(desafioId);
        System.out.println("\n" + Message.CINQUENTA_E_NOVE);
        System.out.println(listarAlternativas(alternativas));

        //Enquanto a resposta não for uma alternativa válida, continua pedindo.
        String resposta1 = validarAlternativa(options);

        if (resposta1.equalsIgnoreCase("a")) {
            System.out.println("\n" + Message.SESSENTA);
            ConclusaoFinal1();
        } else {
            tentativas = tentativas + 1;
            System.out.printf(Message.SESSENTA_E_UM + "\n", tentativas);
            while (tentativas < 5) {
                System.out.println("\n" + Message.CINQUENTA_E_NOVE);

                System.out.println(listarAlternativas(alternativas));

                //Enquanto a resposta não for uma alternativa válida, continua pedindo.
                resposta1 = validarAlternativa(options);

                if (resposta1.equalsIgnoreCase("a")) {
                    System.out.println("\n" + Message.SESSENTA);
                    ConclusaoFinal1();
                    break;
                } else {
                    tentativas = tentativas + 1;
                    System.out.printf(Message.SESSENTA_E_UM + "\n", tentativas);
                }

            }

        }

        if (resposta1.equalsIgnoreCase("a") && (tentativas == 5)) {
            System.out.println("\n" + Message.SESSENTA);
            ConclusaoFinal1();
        } else if (!resposta1.equalsIgnoreCase("a") && (tentativas == 5)) {
            System.out.printf(Message.SESSENTA_E_DOIS + "\n", tentativas);
            ConclusaoFinal2();
        }

    }

    public static void DesafioFinalA1() {
        String[] alternativas = alternativasDoDesafio(DesafioId.A1);
        String[] sequences = {"2 4 6 8", "13, 24 e 35"};

        String resposta = obterResposta(sequences, alternativas);

        int tentativas = 0;
        if (resposta.equalsIgnoreCase("b")) {
            System.out.printf("\n\n" + Message.CINQUENTA_E_SEIS + "\n", sequences[0]);
            System.out.println(Message.CINQUENTA_E_SETE);
            System.out.printf(Message.CINQUENTA_E_OITO + "\n", sequences[1]);
            DesafioFinalA2(tentativas);
        } else {
            tentativas = tentativas + 1;
            System.out.printf(Message.SESSENTA_E_UM + "\n", tentativas);
            while (tentativas < 5) {
                System.out.printf("\n" + Message.OITENTA_E_DOIS + "\n", sequences[0]);
                System.out.println(listarAlternativas(alternativas));

                //Enquanto a resposta não for uma alternativa válida, continua pedindo.
                resposta = validarAlternativa(options);

                if (resposta.equalsIgnoreCase("b")) {
                    System.out.printf("\n\n" + Message.CINQUENTA_E_SEIS + "\n", sequences[0]);
                    System.out.println(Message.CINQUENTA_E_SETE);
                    System.out.printf(Message.CINQUENTA_E_OITO + "\n", sequences[1]);
                    DesafioFinalA2(tentativas);
                    break;
                } else {
                    tentativas = tentativas + 1;
                    System.out.printf(Message.SESSENTA_E_UM + "\n", tentativas);
                }
            }
        }

        if (resposta.equalsIgnoreCase("b") && (tentativas == 5)) {
            System.out.printf(Message.OITENTA_E_SETE + "\n", tentativas);
            System.out.printf("\n\n" + Message.CINQUENTA_E_SEIS + "\n", sequences[0]);
            System.out.println(Message.CINQUENTA_E_SETE);
            System.out.printf(Message.CINQUENTA_E_OITO + "\n", sequences[1]);
            DesafioFinalA2(tentativas);
        } else if (!resposta.equalsIgnoreCase("b") && (tentativas == 5)) {
            System.out.printf(Message.SESSENTA_E_DOIS + "\n", tentativas);
            ConclusaoFinal2();
        }

    }

    public static void DesafioFinalA2(int tentativas) {
        desafioFinalA2eB2(tentativas, DesafioId.A2);
    }

    public static void DesafioFinalB1() {
        String[] alternativas = alternativasDoDesafio(DesafioId.A1);
        String[] sequences = {"2 4 6 8", "29, 38 e 47"};

        String resposta = obterResposta(sequences, alternativas);

        int tentativas = 0;
        if (resposta.equalsIgnoreCase("b")) {
            System.out.printf("\n\n" + Message.CINQUENTA_E_SEIS + "\n", sequences[0]);
            System.out.println(Message.CINQUENTA_E_SETE);
            System.out.printf(Message.CINQUENTA_E_OITO + "\n", sequences[1]);
            DesafioFinalB2(tentativas);
        } else {
            tentativas = tentativas + 1;
            System.out.printf(Message.SESSENTA_E_UM + "\n", tentativas);
            while (tentativas < 5) {
                System.out.printf("\n" + Message.OITENTA_E_DOIS + "\n", sequences[0]);
                System.out.println(listarAlternativas(alternativas));

                //Enquanto a resposta não for uma alternativa válida, continua pedindo.
                resposta = validarAlternativa(options);

                if (resposta.equalsIgnoreCase("b")) {
                    System.out.printf("\n\n" + Message.CINQUENTA_E_SEIS + "\n", sequences[0]);
                    System.out.println(Message.CINQUENTA_E_SETE);
                    System.out.printf(Message.CINQUENTA_E_OITO + "\n", sequences[1]);
                    DesafioFinalB2(tentativas);
                    break;
                } else {
                    tentativas = tentativas + 1;
                    System.out.printf(Message.SESSENTA_E_UM + "\n", tentativas);
                }

            }

        }

        if (resposta.equalsIgnoreCase("b") && (tentativas == 5)) {
            System.out.printf(Message.OITENTA_E_SETE + "\n", tentativas);
            System.out.printf("\n\n" + Message.CINQUENTA_E_SEIS + "\n", sequences[0]);
            System.out.println(Message.CINQUENTA_E_SETE);
            System.out.printf(Message.CINQUENTA_E_OITO + "\n", sequences[1]);
            DesafioFinalB2(tentativas);
        } else if (!resposta.equalsIgnoreCase("b") && (tentativas == 5)) {
            System.out.printf(Message.SESSENTA_E_DOIS + "\n", tentativas);
            ConclusaoFinal2();
        }

    }

    private static String obterResposta(String[] sequences, String[] alternativas) {
        System.out.println("\n\nLOGIN: GOVERNO");
        System.out.println("SENHA:" + " _".repeat(sequences[0].split(" ").length));

        System.out.printf("\n" + Message.OITENTA_E_DOIS + "\n", sequences[0]);
        System.out.println(listarAlternativas(alternativas));

        //Enquanto a resposta não for uma alternativa válida, continua pedindo.
        return validarAlternativa(options);
    }

    public static void DesafioFinalB2(int tentativas) {
        desafioFinalA2eB2(tentativas, DesafioId.B2);
    }

    public static void ConclusaoFinal1() {
        System.out.println(Message.SESSENTA_E_TRES);
        System.out.println(Message.SESSENTA_E_QUATRO);
        System.out.println(Message.SESSENTA_E_CINCO);
        System.out.println("\n\n" + Message.SESSENTA_E_SEIS);
    }

    public static void ConclusaoFinal2() {
        System.out.printf(Message.SESSENTA_E_SETE + "\n", "Debug");
        System.out.printf(Message.SESSENTA_E_OITO + "\n", "Debug");
        System.out.printf(Message.SESSENTA_E_NOVE + "\n", "Cibelle");
        System.out.printf(Message.SETENTA + "\n", "Debug");
        System.out.println("\n\n" + Message.SESSENTA_E_SEIS);
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

    private static String listarAlternativas(String[] array) {
        StringBuilder resultado = new StringBuilder();
        char letter = 'a';
        for (String str : array) {
            resultado.append("\n%s) %s".formatted(letter++, str));
        }
        return resultado.substring(1);
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
