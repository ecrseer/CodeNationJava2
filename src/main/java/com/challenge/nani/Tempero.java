package com.challenge.nani;

import com.challenge.annotation.Somar;

import java.math.BigDecimal;

public class Tempero {
    private String odor;
    private BigDecimal gramas;
    private BigDecimal qtd;
    @Somar
    public BigDecimal teta=BigDecimal.valueOf(32);
    @Somar
    public float mega=42;

    public Tempero (String odr,BigDecimal gr,BigDecimal qt){
        this.odor=odr;
        this.gramas=gr;
        this.qtd=qt;

    }

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }


    public BigDecimal getGramas() {
        return gramas;
    }

    public void setGramas(BigDecimal gramas) {
        this.gramas = gramas;
    }


    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }
}
