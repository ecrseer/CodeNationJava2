package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {



    @Override
    public BigDecimal Somar(Class qual) {
         char operador = '+';
        return MrBoilerplate(qual,operador);

    }

    @Override
    public BigDecimal Subtrair(Class qual) {
        return null;
    }

    @Override
    public BigDecimal Totalizar(Class qual) {
        return null;
    }
    private BigDecimal MrBoilerplate(Class qual,char opl){
        Method[] eles = qual.getDeclaredMethods();
        BigDecimal soma = BigDecimal.ZERO;
        BigDecimal subtra = BigDecimal.ZERO;
        Object objeto = null;

        for(Method umdeles: eles)
        {
            System.out.println("Um deles agora é "+umdeles.getName());
            if (umdeles.isAnnotationPresent(Somar.class))
            {
                try
                {
                    BigDecimal somar = (BigDecimal) umdeles.invoke(objeto);
                    soma = somar.add(soma);
                    System.out.println("Soma agora é "+soma);

                }catch (IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();    }
            }else
            if (umdeles.isAnnotationPresent(Subtrair.class))
            {
                try
                {
                    BigDecimal somar = (BigDecimal) umdeles.invoke(qual);
                    subtra = somar.add(subtra);

                }catch (IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();    }
            }
        }

        switch(opl){
            case '+': return soma;
            case '-': return subtra;
            case '=':
                break;
        }
        return soma;
    }
    public BigDecimal MrsBoilerplate(Object qual,char opl){
        Field[] eles = qual.getClass().getDeclaredFields();

        BigDecimal soma = BigDecimal.ZERO;
        BigDecimal subtra = BigDecimal.ZERO;
        //BigDecimal subtrad = qual.getClass().getDeclaredField("dd","d");




        for(Field umdeles: eles)
        {
            System.out.println("Um deles agora é "+umdeles.getName());
            if (umdeles.isAnnotationPresent(Somar.class))
            {
                try
                {
                    BigDecimal somar = (BigDecimal) umdeles.get(umdeles);
                    soma = soma.add(somar);


                }catch (IllegalAccessException  e){
                    e.printStackTrace();    }
            }/*else
            if (umdeles.isAnnotationPresent(Subtrair.class))
            {
                try
                {
                    BigDecimal somar = (BigDecimal) umdeles.invoke(qual);
                    subtra = somar.add(subtra);

                }catch (IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();    }
            }*/
        }

        switch(opl){
            case '+': return soma;
            case '-': //return subtra;
            case '=':
                break;
        }
        return soma;
    }


    private void Socorro(){

    }
}
