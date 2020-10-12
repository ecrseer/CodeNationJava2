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


        /*
        float fuu = Float.parseFloat(String.valueOf(oiz));
        fuu = fuu+1;
        oiz = BigDecimal.valueOf(fuu);
        //System.out.println("BigD "+calus.MrsBoilerplate(farofa,'+'));
        Class mentos = farofa.getClass();
        String inhai = mentos.getTypeName();
        //Dinossauro.class.
       // Class<?> clazz = Class.forName("com.challenge.nani.Tempero");
        //Object hei = new inhai();
        //inhai = inhai.getClass().getSubclass();
        System.out.println("ave "+inhai);*/



    }
}
