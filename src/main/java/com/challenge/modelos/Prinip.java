package com.challenge.modelos;

import com.challenge.desafio.CalculadorDeClasses;

import java.math.BigDecimal;

public class Prinip {


    public static void main(String[] args){

        CalculadorDeClasses calcs = new CalculadorDeClasses();

        Object caix = new Caixa();

        BigDecimal pesoTotal = new BigDecimal(0);
        pesoTotal =pesoTotal.add(calcs.Somar(caix));
        System.out.println("Peso total é "+pesoTotal);




    }
}
