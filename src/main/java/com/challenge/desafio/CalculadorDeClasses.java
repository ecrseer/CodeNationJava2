package com.challenge.desafio;

import com.challenge.interfaces.Calculavel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {



    @Override
    public BigDecimal Somar(Class qual) {


        Method[] eles = getClass().getDeclaredMethods();
        BigDecimal soma = BigDecimal.ZERO;


        for(Method umdeles: eles){

            if(umdeles.getName()
                    .toLowerCase()
                    .contains("get")){
                try {
                    BigDecimal somar = (BigDecimal) umdeles.invoke(qual) ;
                    soma = somar.add(soma);

                }catch (IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();
                }
                                         }
                                  }
        return soma;
    }

    @Override
    public BigDecimal Subtrair(Class qual) {
        return null;
    }

    @Override
    public BigDecimal Totalizar(Class qual) {
        return null;
    }
}
