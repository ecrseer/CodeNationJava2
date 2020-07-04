package com.challenge.nani;

import com.challenge.desafio.CalculadorDeClasses;

import java.math.BigDecimal;

public class Prinip {

    public static void main(String[] args){

        CalculadorDeClasses calus = new CalculadorDeClasses();
        Tempero farofa = new Tempero("Leve",420,12);

        BigDecimal oiz = new BigDecimal(4);
        oiz =oiz.add(calus.Somar(farofa.getClass()));
        System.out.println("BigD "+oiz);
        System.out.println("Big2 "+farofa.getQtd());

    }
}
