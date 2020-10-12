package com.challenge.modelos;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;

import java.math.BigDecimal;

public class Caixa {
    private String descricao;

    @Somar
     public BigDecimal pesoEstoque=BigDecimal.valueOf(42);
    @Somar
     public BigDecimal peso=BigDecimal.valueOf(4);





    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public BigDecimal getPesoEstoque() {
        return pesoEstoque;
    }

    public void setPesoEstoque(BigDecimal pesoEstoque) {
        this.pesoEstoque = pesoEstoque;
    }


    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){

        return "A "+ getDescricao();
    }
}
