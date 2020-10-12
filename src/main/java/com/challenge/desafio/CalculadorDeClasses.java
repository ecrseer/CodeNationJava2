package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {



    @Override
    public BigDecimal Somar(Object qual) {

        return MrsBoilerplate(qual,'+');

    }

    @Override
    public BigDecimal Subtrair(Object qual) {
        return MrsBoilerplate(qual,'-');    }

    @Override
    public BigDecimal Totalizar(Object qual) {
        return MrsBoilerplate(qual,'=');    }

    public BigDecimal MrsBoilerplate(Object qual,char opl){
        Field[] eles = qual.getClass().getFields();

        BigDecimal soma = BigDecimal.ZERO;
        BigDecimal subtra = BigDecimal.ZERO;

        for(Field umdeles: eles)
        {
            soma=soma.add(RecaudadorDelApuntamiento(qual,umdeles,Somar.class));
            subtra=subtra.add(RecaudadorDelApuntamiento(qual,umdeles,Subtrair.class));

        }

        switch(opl){
            case '+': return soma;
            case '-': return subtra;
            case '=': return subtra.subtract(soma);
                     }
        return soma;
    }


    private BigDecimal RecaudadorDelApuntamiento(Object qual,Field umdeles,
                                                  Class <? extends Annotation>
                                                          apuntamiento){
        BigDecimal somar = BigDecimal.ZERO;
        if (umdeles.isAnnotationPresent(apuntamiento))
        {
            try {
                somar = (BigDecimal) umdeles.get(qual);

            }catch (IllegalAccessException e){
                e.printStackTrace();    }
        }
        return somar;
    }
}
