package terraexiladapi;

public enum URL {
    CONTEUDO_BASICO("https://mega.nz/file/EH1CzSLD#KaThOiB5DsSRpmE2kBG9ZpY9l3q0hrV5fv5rYPN_J9A"),
    CONTEUDO_INTERMEDIARIO("https://mega.nz/file/UaVmyCib#c5rqbHuyYOCnzFt3Z3f6MQkpcSCLBaivHB_vCSNsUck"),
    CONTEUDO_AVANCADO("https://mega.nz/file/RaEjGZqS#hIFI1AmnZV7fx3KPANAP4ItCsT3rWmWas9eM8CVul6c"),
    OPERADORES_RELACIONAIS("https://mega.nz/file/5PsF2BiJ#1pFVl29X-nlzUXda2ZSfaANXm1pfPvTnMh06LaqyzMI"),
    ;
    private final String url;

    URL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
