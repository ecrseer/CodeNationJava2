package com.challenge.nani;

import com.challenge.annotation.Somar;

public class Tempero {
    private String odor;
    private int gramas;
    private int qtd;

    public Tempero (String odr,int gr,int qt){
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

    @Somar public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    @Somar
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
