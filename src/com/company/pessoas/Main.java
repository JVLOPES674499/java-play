package com.company.pessoas;

import com.company.pessoas.Adulto;
import com.company.pessoas.Crianca;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Adulto valdir = new Adulto("Valdir", "Masc");
        Adulto vinicius = new Adulto("Vinicius", "Masc");
        Crianca luana = new Crianca();


        luana.setNome("Luana");
        luana.setGenero("fem");


        valdir.trabalha();

        valdir.setNome("Valdir lopes");

        valdir.trabalha();
        valdir.fala();
        luana.brinca();

        //valdir.fala();

        //valdir.anda();

        //luana.brinca();

    }
}
