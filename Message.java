package com.mycompany.terraexiladapi;

public enum Message {
    UM("""
            Bem-vindo a um mundo chamado de [Terra Exilada],
            onde uma guerra devastadora deixou metade do
            planeta em ruínas.
            Os sobreviventes encontraram refúgio em um
            local isolado, buscando proteção e esperança
            nem meio à destruição.."""),
    DOIS("""
            No entanto, a promessa de segurança se transformou
            em opressão quando um grupo de pessoas começou a
            abusar de sua autoridade, exercendo poder sobre os
            desarmados.
            Essas pessoas são o governo, que controla a todos
            e os mantêm aprisionados com um portão fechado."""),
    TRES("""
            Aqueles sem armas são tratados como segunda
            classe, sujeitos a abusos e privados de seus
            direitos básicos.
            A liberdade se tornou uma ilusão distante,
            e a vida na cidade é marcada pela opressão
            e desespero."""),
    QUATRO("""
            No entanto, um grupo  destemido está determinado a derrubar o governo
            em prol de uma causa: a liberdade.
            O líder %s nomeou o grupo de [Rebeldes], os membros estão dispostos
            a lutar e acabar com as injustiças. A resistência está se formando e a
            batalha para conquistar a verdadeira liberdade está prestes a COMEÇAR.
            ------> CHEGOU A SUA HORA <------"""),
    CINCO("""
            Um dia, %s começa a ouvir rumores sobre um misterioso programador
            chamado %s, ele está ensinando o que é necessário para abrir o portão.
            As pessoas que se cansaram do governo conhecem %s através de várias
            maneiras, desde mensagens secretas em fóruns de programação até encontros
            noturnos em lugares isolados. Porém, Ninguém sabe sua verdadeira identidade
            mas todos reconhecem sua habilidade em programação."""),
    SEIS("""
            %s estava a caminho de casa após um longo dia de trabalho quando avistou
            %s andando pela rua.\s
            Curioso(a), você decidiu segui-lo, pensando que ele poderia estar a caminho de
            algum encontro com os rebeldes.\s
            Acompanhando-o, vocês chegam a um beco escuro e isolado, quando %s finalmente
            te percebe a sua presença e vira-se bruscamente para você."""),
    SETE("Quem é você e por que está me seguindo?"),
    OITO("""
            Desculpe, não foi minha intenção assustá-lo.
            Eu ouvi falar sobre você e seu trabalho com programação,
            e estou interessado(a) em ajudar a sua causa.
            Me chamo %s"""),
    NOVE("""
            %s: Hum... não é todo dia que alguém me segue até
            um beco escuro às dez da noite %s.
            Mas tudo bem, vou dar o benefício da dúvida.
            Como você pode ajudar ?"""),
    DEZ("""
            %s: Bem, eu não sou experiente, mas estou
            interessado(a) nem aprender e contribuir com o que
            for necessário.\s
            Tenho algumas noções básicas de Java e acredito que
            posso ser útil para abrir o portão, se for ensinado."""),
    ONZE("""
            %s: Ah, entendi. Bom, nós precisamos de pessoas
            com vontade de aprender e ajudar. Mas não podemos nos arriscar
            com desconhecidos, se você quiser se juntar a nós,
            terá que provar."""),
    DOZE("%s: O que devo fazer?"),
    TREZE("""
            %s: Eu quero que você prove que está do nosso lado.
            Tire o chip que o governo implantou na sua orelha.
            Se você é mesmo um rebelde, não deveria estar usando
            essas tecnologias de rastreamento."""),
    QUATORZE("""
            Você sente um arrepio percorrer seu corpo, mas decide
            que está disposto a provar sua lealdade.
            Com as mãos trêmulas, você aceita a proposta e retira
            o chip da sua orelha, sentindo-se vulnerável sem ele."""),
    QUINZE("""
            %s faz um olhar penetrante e avaliador antes de dizer:
            Muito bem, você passou no teste.
            Mas ainda não posso confiar completamente em você."""),
    DEZESSEIS("""
            Ele pega o chip da sua mão e guarda em seu bolso, e em seguida,
            começa a caminhar em direção a um prédio abandonado nas
            proximidades.
            Você segue-o com hesitação, se perguntando o que vai acontecer."""),
    DEZESSETE("""
            Vocês chegam ao prédio abandonado, %s pega uma lanterna
            de sua mochila.
            Ele acende, em seguida aponta para um corredor escuro
            e empoeirado."""),
    DEZOITO("%s: Vamos entrar aqui. Há algo que eu preciso te mostrar."),
    DEZENOVE("""
            Você segue %s pelo corredor enquanto a luz da lanterna
            ilumina o caminho.
            O ar é úmido e o cheiro de mofo é forte.
            Você começa a sentir que algo estranho está acontecendo."""),
    VINTE("De repente, você ouve um ruído. Algo parece estar se movendo na escuridão."),
    VINTE_E_UM("%s: O que é isso?"),
    VINTE_E_DOIS("%s: Não se preocupe. É só o vento."),
    VINTE_E_TRES("Você olha para trás e percebe que não\nhá janelas naquele corredor."),
    VINTE_E_QUATRO("%s: Como pode ser o vento?\nNão há janelas aqui!"),
    VINTE_E_CINCO("%s: Eu disse não se preocupe.\nVamos continuar."),
    VINTE_E_SEIS("Vocês caminham até uma porta no final do corredor.\nDebug a abre e vocês entram em uma sala escura."),
    VINTE_E_SETE("""
            Você fica perplexo ao ver um cômodo escuro, com apenas
            uma cadeira no centro do local e uma luz fraca no teto.
            %s te puxa para dentro e fecha a porta atrás de si."""),
    VINTE_E_OITO("%s: O que é isso? O que está acontecendo ?"
            + "\nvocê pergunta, sentindo seu coração acelerar."),
    VINTE_E_NOVE("""
            %s coloca a mão em seu ombro, tentando te acalmar.
            Eu preciso que você entenda que essa é uma situação séria.\s
            O governo não pode saber. É por isso que precisamos de
            pessoas sigilosas, que estão dispostas a arriscar tudo
            para ajudar nossa causa."""),
    TRINTA("Ele caminha até a cadeira e aponta para ela."
            + "\nSente-se, ele diz."),
    TRINTA_E_UM("""
            %s começa a explicar como será o treinamento e
            como você poderá contribuir com a causa.
            Ele entrega uma apostila sobre loop for."""),
    TRINTA_E_DOIS("""
            %s: Para abrir o portão, você precisa saber sobre
            Loop For, o governo colocou um sistema de segurança
            baseado nisso. Então, montei um material com tudo que
            você precisa para quebrar esse sistema."""),
    TRINTA_E_TRES("""
            Continuar com opção 1:
            %s: Surgiu uma curiosidade...
            Como você sabe exatamente o que precisa para quebrar o sistema de segurança?"""),
    TRINTA_E_QUATRO("""
            %s: Isso não é importante, a partir de agora você
            precisa se dedicar, não podemos perder tempo.\s
            Temos que abrir o portão antes que seja tarde demais."""),

    TRINTA_E_CINCO("Continuação opção 2:\n%s: Detalhe um pouco mais."),
    TRINTA_E_SEIS("""
            Vamos começar, fiz essa apostila dividida em 3 módulos,
            cada um com um nível de complexidade diferente.
            O primeiro módulo aborda conceitos básicos sobre
            estrutura de repetição.
            Leia, quando terminar faça os dois testes que está
            no seu computador."""),
    TRINTA_E_SETE("Você concorda balançado a cabeça e começa a ler o material."),
    TRINTA_E_OITO("""
            %s: Segundo módulo é intermediário, com tópicos
            mais específicos sobre cada parte que compõem o for.
            Lembre-se, quando terminar digite %d para fazer outro teste."""),
    TRINTA_E_NOVE("Digite %d para ler %dº material: "),
    QUARENTA("%s: Já o terceiro módulo é avançado, com conteúdo"
            + "\ntécnico e detalhado sobre cada iteração do for."),
    QUARENTA_E_UM("Digite %d para fazer o %dº teste: "),
    QUARENTA_E_DOIS("""
            %s pega o celular e manda um áudio aos rebeldes
            informando que o momento para invadir o prédio do
            governo chegou, e há duas opções:"""),

    QUARENTA_E_TRES("""
            Continuar com opção 1:
            %s: Como assim??
            Não estou pronto agora!"""),
    QUARENTA_E_QUATRO("%s: Está sim. Inclusive, você terá o material"
            + "\ntodo em mãos para consultar, se acalme."),
    QUARENTA_E_CINCO("""
            Continuar com opção %d:
            %s: Estou pronto para invadir o sistema,
            está na hora de alcançarmos nossa liberdade e justiça."""),
    QUARENTA_E_SEIS("%s sorri e diz: Ótimo! Sua coragem será fundamental nessa missão."
            + "\nVamos lá, juntos venceremos essa batalha."),
    QUARENTA_E_SETE("""
            %s, você e os rebeldes chegam ao prédio do governo no meio da noite.
            Enquanto alguns grupos espalham bombas de fumaça e gás para neutralizar
            os guardas, vocês se infiltram no prédio."""),
    QUARENTA_E_OITO("""
            %s consegue despistar os seguranças e continua em direção à sala do
            governador.
            Chegando lá, ele encontra o governador e começa uma discussão sobre a
            opressão do povo.
            Nesse momento, a esposa do governador entra na sala e se junta à discussão."""),
    QUARENTA_E_NOVE("""
            A esposa revela que não apoia o que o marido está fazendo com as pessoas,
            mantendo-as em escravidão sem poderem dormir mais de 4 horas por noite e
            comendo menos de 2 refeições diárias. Ela conta que já tentou convencê-lo a
            mudar, mas ele não ouviu."""),
    CINQUENTA("""
            O governador rebate, dizendo que ela deveria apoia-lo por ser mulher dele.
            Nesse momento, você é surpreendido(a) quando a esposa do governador revela
            que está tendo um caso com o %s."""),
    CINQUENTA_E_UM("%s: %s ajude ele enquanto mantenho o governador amarrado aqui..."),
    CINQUENTA_E_DOIS("""
            %s, acompanha você até o computador do governador, explicando a gravidade
            da situação. Ela revela que o sistema de segurança é extremamente sensível e
            permite apenas quatro tentativas de senha antes de acionar o alarme."""),
    CINQUENTA_E_TRES("""
            Com cada tentativa mal sucedida, o risco de ser descoberto aumenta.
            %s destaca que, no quinto erro, os seguranças de outros prédios
            serão alertados e invadirão imediatamente o local."""),
    CINQUENTA_E_QUATRO("%s: %s, essa é a senha para logar."),
    CINQUENTA_E_CINCO("Diante do computador, você se prepara mentalmente para enfrentar o desafio que se apresenta."),
    CINQUENTA_E_SEIS("""
            LOGIN: GOVERNO
            SENHA: %s
            LOGANDO ......
                       

            Depois de acessar o sistema do governo, você se depara com uma série de
            arquivos e começa a vasculhar para encontrar informações que possam
            ajudar abrir o portão."""),
    CINQUENTA_E_SETE("""

            Após horas de busca, tem um arquivo suspeito que parece estar codificado.
            Usando suas habilidades em programação, conseguiu descriptografá-lo e
            descobriu que se trata de um documento com informações sobre o sistema
            de segurança do governo."""),
    CINQUENTA_E_OITO("""

            O arquivo contém várias informações sobre os departamentos do prédio.
            Porém, uma parte específica chamou sua atenção: A combinação numérica
            para abrir o portão.
            Era um mistério até aquele momento, mas agora está diante de seus olhos,
            como uma chave para a liberdade.\s
            A senha é: %s."""),
    CINQUENTA_E_NOVE("Qual \"for\" gera a sequência da senha para abrir o portão? "),
    SESSENTA("""
            ----------> SENHA CORRETA
            ----------> ABRINDO PORTÃO"""),
    SESSENTA_E_UM("""
            ----> Tentativa %s
            ----> Acesso Negado"""),
    SESSENTA_E_DOIS("""
            %s Tentativas de Invasão:
            SISTEMA DE SEGURANÇA ATIVADO"""),
    SESSENTA_E_TRES("""

            Com a senha correta, o portão é aberto e uma onda de alívio
            percorre o ambiente.
            Os rebeldes aproveitam a oportunidade para fugir, correndo em direção
            à liberdade que tanto almejavam. A sensação de dever cumprido e a
            gratidão pelo sucesso do plano de fuga se misturam em seus corações."""),
    SESSENTA_E_QUATRO("""

            Enquanto vocês observam os rebeldes desaparecendo no horizonte,
            seguindo seus caminhos individuais em busca de liberdade, você se
            sente profundamente satisfeito por ter desempenhado um papel importante
            na transformação de suas vidas."""),
    SESSENTA_E_CINCO("""

            Enquanto se afastam do local, rumo a um futuro incerto, vocês olham
            para trás e sorriem, agradecendo a força da parceria que os levou até ali.
            Uma amizade forte e duradoura foi formada, e vocês sabem que sempre poderão
            contar um com o outro nas adversidades que ainda estão por vir.
            Juntos, vocês caminham em direção a um novo horizonte."""),
    SESSENTA_E_SEIS("-----> FIM <-----"),
    SESSENTA_E_SETE("""

            Após a ativação do alarme e a invasão dos guardas,\s
            a situação se torna caótica.
            Tiros por todo local, crianças choram e você sente o peso
            da responsabilidade e da falha.
            Em meio ao tumulto, você e %s se veem encurralados,
            buscando uma saída para a situação desesperadora."""),
    SESSENTA_E_OITO("""

            Durante a tentativa de fuga em meio ao caos
            %s e você acaba sendo capturados pelos guardas."""),
    SESSENTA_E_NOVE("""

            Governador: Não quero eles vivos e quanto a\s
            %s, coloque-a em cativeiro."""),
    SETENTA("""
            Embora a história tenha tomado um rumo sombrio
            e triste, a coragem e determinação que você e %s
            demonstraram ao longo da jornada não serão esquecidas.
            Os rebeldes continuarão em busca da liberdade e vingança."""),

    SETENTA_E_UM("""
            -----> Você esgotou suas tentativas.
            A resposta correta é: Repetir uma sequência de comandos por um número determinado de vezes."""),
    SETENTA_E_DOIS("""
            ------> Você esgotou suas tentativas.

            As partes que compõem o for são:
            1. Inicialização
            2. Condição de continuação
            3. Incremento/Decremento"""),
    SETENTA_E_TRES("""
            -------> Você esgotou suas tentativas.
            A condição de continuação em um loop "for" é uma expressão
            que determina se o loop deve continuar executando ou se deve
            ser encerrado.
            Essa condição é verificada a cada iteração do loop e, se for
            avaliada como falsa, o loop será interrompido e a execução
            será transferida para o próximo trecho após o loop."""),
    SETENTA_E_QUATRO("------> Você esgotou suas tentativas."),
    SETENTA_E_CINCO("""
            Você errou.
            ----> Tentativa %s"""),
    SETENTA_E_SEIS("Qual a função do comando \"for\" em linguagens de programação?"),
    SETENTA_E_SETE("Repetir uma sequência de comandos por um número determinado de vezes"),
    SETENTA_E_OITO("Quais são as 3 partes que compõem a estrutura \"for\"?"),
    SETENTA_E_NOVE("Qual é o papel da \"condição\" em um loop \"for\"?"),
    OITENTA("Parabéns, você acertou!"),
    OITENTA_E_UM("Como você define um loop \"for\" que mostre 10 números, começando com o zero?"),
    OITENTA_E_DOIS("Como você define um loop \"for\" que faça a senha: %s"),
    OITENTA_E_TRES("for(inicialização; condição de continuação; incrementar ou decrementar)"),
    OITENTA_E_QUATRO("Verificar se o loop deve continuar executando"),
    OITENTA_E_CINCO("for (int i = 0; i < 10; i++)"),
    OITENTA_E_SEIS("for (int i = 2; i <= 8; i = i + 2)"),
    OITENTA_E_SETE("----> Você atingiu o limite máximo de erros: %s"),
    ;

    private final String text;

    Message(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
