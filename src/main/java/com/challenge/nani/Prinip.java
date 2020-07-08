package com.challenge.nani;

import com.challenge.desafio.CalculadorDeClasses;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public class Prinip {

     static class Dinossauro{
        public int oil=0;

    }

    public static void main(String[] args){

        CalculadorDeClasses calus = new CalculadorDeClasses();
        Object farofa = new Tempero("Leve",
                BigDecimal.valueOf(420),BigDecimal.valueOf(12));

        BigDecimal oiz = new BigDecimal(4);
        //oiz =oiz.add(calus.Somar(farofa.getClass()));
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
        System.out.println("ave "+inhai);



    }
}
