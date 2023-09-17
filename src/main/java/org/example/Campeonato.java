package org.example;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import java.util.ArrayList;

public class Campeonato {

    private int totalGols = 0;
    private int totalEquipes = 0;


    private Campeonato() {};
    private static final Campeonato instance = new Campeonato();
    public static  Campeonato getInstance() {
        return instance;
    }



    public int getTotalGols() {
        return totalGols;
    }

    public void setTotalGols(int totalGols) {
        this.totalGols += totalGols;
    }

    public int getTotalEquipes() {
        return totalEquipes;
    }

    public void addEquipe(int equipes) {
        this.totalEquipes += equipes;
    }
}
