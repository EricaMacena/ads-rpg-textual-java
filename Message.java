package com.mycompany.terraexiladapi;

public enum Message {
UM("");

    private String text;

    Message(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
