package com.mycompany.terraexiladapi;

public enum TextMenus {
    UM("""
            -----> ESCOLHA <------
            Opção 1: Perguntar como ele sabe exatamente o que precisa.
            Opção 2: Não questionar. Pedir para continuar com a explicação.
            DIGITE 1 PARA (OPÇÃO 1) OU 2 PARA (OPÇÃO 2): """),
    DOIS("ESTÁ PRONTO PARA FAZER O %dº TESTE ?" +
            "\nDigite %d para <%s>: "),
    TRES("""
            -----> ESCOLHA <------
            Opção %s: Se desesperar e dizer que não se sente pronto para a invasão.
            Opção %s: Se manter calmo e confiante, dizendo que está pronto para invadir o sistema de segurança.
            DIGITE %s PARA (OPÇÃO %s) OU %s PARA (OPÇÃO %s): """),
    ;
    private String menu;

    TextMenus(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return this.menu;
    }
}
