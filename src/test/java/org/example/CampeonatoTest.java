package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeonatoTest {

    @Test
    public void deveRetornarTotalGols(){
        Campeonato.getInstance().setTotalGols(50);
        assertEquals(50, Campeonato.getInstance().getTotalGols());
    }

    @Test
    public void deveRetornar2Equipes(){
        Campeonato.getInstance().addEquipe(2);
        assertEquals(2, Campeonato.getInstance().getTotalEquipes());
    }

    @Test
    public void deveRetornarNenhumaEquipe() {
        assertEquals(0, Campeonato.getInstance().getTotalEquipes());
    }

}