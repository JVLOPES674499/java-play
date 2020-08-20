package com.company.animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Luna", "Peq");
        Gato gato = new Gato();
        gato.mia();
        cachorro.come();
        gato.anda();
    }
}

