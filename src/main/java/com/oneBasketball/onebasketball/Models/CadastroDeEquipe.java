package com.oneBasketball.onebasketball.Models;

import java.util.ArrayList;

public class CadastroDeEquipe {
    
    private int equipe_id;
    private String nome_equipe;
    private String sigla_equipe;
    private ArrayList<String> jogadores;
    
    public int getEquipe_id() {
        return equipe_id;
    }
    
    public void setEquipe_id(int equipe_id) {
        this.equipe_id = equipe_id;
    }
    
    public String getNome_equipe() {
        return nome_equipe;
    }
    
    public void setNome_equipe(String nome_equipe) {
        this.nome_equipe = nome_equipe;
    }
    
    public String getSigla_equipe() {
        return sigla_equipe;
    }
    
    public void setSigla_equipe(String sigla_equipe) {
        this.sigla_equipe = sigla_equipe;
    }
    
    public ArrayList<String> getJogadores() {
        return jogadores;
    }
    
    public void setJogadores(ArrayList<String> jogadores) {
        this.jogadores = jogadores;
    }
    
}


