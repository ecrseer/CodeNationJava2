package com.challenge.annotation;


import org.graalvm.compiler.word.Word;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.BigDecimal;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Somar {

}
