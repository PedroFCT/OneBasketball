package com.oneBasketball.onebasketball.Models;

public class CadastroDePartidas {

    private int pontuacao_equipe1;
    private int pontuacao_equipe2;
    private int partida_id;
    private String data;
    private int equipe1_id;
    private int equipe2_id;
    private int tresPontos_equipe1;
    private int tresPontos_equipe2;
    private int doisPontos_equipe1;
    private int doisPontos_equipe2;
    private int lance_livre_equipe1;
    private int lance_livre_equipe2;
    private int lance_livre_convertido_equipe1;
    private int lance_livre_convertido_equipe2;
    private int faltas_equipe1;
    private int faltas_equipe2;

    public CadastroDePartidas(int pontuacao_equipe1, int pontuacao_equipe2, int partida_id, String data, int equipe1_id, int equipe2_id, int tresPontos_equipe1, int tresPontos_equipe2, int doisPontos_equipe1, int doisPontos_equipe2, int lance_livre_equipe1, int lance_livre_equipe2, int lance_livre_convertido_equipe1, int lance_livre_convertido_equipe2, int faltas_equipe1, int faltas_equipe2) {
        this.pontuacao_equipe1 = pontuacao_equipe1;
        this.pontuacao_equipe2 = pontuacao_equipe2;
        this.partida_id = partida_id;
        this.data = data;
        this.equipe1_id = equipe1_id;
        this.equipe2_id = equipe2_id;
        this.tresPontos_equipe1 = tresPontos_equipe1;
        this.tresPontos_equipe2 = tresPontos_equipe2;
        this.doisPontos_equipe1 = doisPontos_equipe1;
        this.doisPontos_equipe2 = doisPontos_equipe2;
        this.lance_livre_equipe1 = lance_livre_equipe1;
        this.lance_livre_equipe2 = lance_livre_equipe2;
        this.lance_livre_convertido_equipe1 = lance_livre_convertido_equipe1;
        this.lance_livre_convertido_equipe2 = lance_livre_convertido_equipe2;
        this.faltas_equipe1 = faltas_equipe1;
        this.faltas_equipe2 = faltas_equipe2;
    }

    // Getters e Setters
    public int getPontuacao_equipe1() {
        return pontuacao_equipe1;
    }

    public void setPontuacao_equipe1(int pontuacao_equipe1) {
        this.pontuacao_equipe1 = pontuacao_equipe1;
    }

    public int getPontuacao_equipe2() {
        return pontuacao_equipe2;
    }

    public void setPontuacao_equipe2(int pontuacao_equipe2) {
        this.pontuacao_equipe2 = pontuacao_equipe2;
    }

    public int getPartida_id() {
        return partida_id;
    }

    public void setPartida_id(int partida_id) {
        this.partida_id = partida_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    
}

    public int getEquipe1_id() {
        return equipe1_id;
    }

    public void setEquipe1_id(int equipe1_id) {
        this.equipe1_id = equipe1_id;
    }

    public int getEquipe2_id() {
        return equipe2_id;
    }

    public void setEquipe2_id(int equipe2_id) {
        this.equipe2_id = equipe2_id;
    }

    public int getTresPontos_equipe1() {
        return tresPontos_equipe1;
    }

    public void setTresPontos_equipe1(int tresPontos_equipe1) {
        this.tresPontos_equipe1 = tresPontos_equipe1;
    }

    public int getTresPontos_equipe2() {
        return tresPontos_equipe2;
    }

    public void setTresPontos_equipe2(int tresPontos_equipe2) {
        this.tresPontos_equipe2 = tresPontos_equipe2;
    }

    public int getDoisPontos_equipe1() {
        return doisPontos_equipe1;
    }

    public void setDoisPontos_equipe1(int doisPontos_equipe1) {
        this.doisPontos_equipe1 = doisPontos_equipe1;
    }

    public int getDoisPontos_equipe2() {
        return doisPontos_equipe2;
    }

    public void setDoisPontos_equipe2(int doisPontos_equipe2) {
        this.doisPontos_equipe2 = doisPontos_equipe2;
    }

    public int getLance_livre_equipe1() {
        return lance_livre_equipe1;
    }

    public void setLance_livre_equipe1(int lance_livre_equipe1) {
        this.lance_livre_equipe1 = lance_livre_equipe1;
    }

    public int getLance_livre_equipe2() {
        return lance_livre_equipe2;
    }

    public void setLance_livre_equipe2(int lance_livre_equipe2) {
        this.lance_livre_equipe2 = lance_livre_equipe2;
    }

    public int getLance_livre_convertido_equipe1() {
        return lance_livre_convertido_equipe1;
    }

    public void setLance_livre_convertido_equipe1(int lance_livre_convertido_equipe1) {
        this.lance_livre_convertido_equipe1 = lance_livre_convertido_equipe1;
    }

    public int getLance_livre_convertido_equipe2() {
        return lance_livre_convertido_equipe2;
    }

    public void setLance_livre_convertido_equipe2(int lance_livre_convertido_equipe2) {
        this.lance_livre_convertido_equipe2 = lance_livre_convertido_equipe2;
    }

    public int getFaltas_equipe1() {
        return faltas_equipe1;
    }

    public void setFaltas_equipe1(int faltas_equipe1) {
        this.faltas_equipe1 = faltas_equipe1;
    }

    public int getFaltas_equipe2() {
        return faltas_equipe2;
    }

    public void setFaltas_equipe2(int faltas_equipe2) {
        this.faltas_equipe2 = faltas_equipe2;
    }
}
