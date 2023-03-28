package com.oneBasketball.onebasketball.Models;

public class ListarPartidas {

    private Long partida_id;
    private String sigla_equipe1;
    private String sigla_equipe2;
    private int pontuacao_equipe1;
    private int pontuacao_equipe2;
    
    public ListarPartidas(Long partida_id, String sigla_equipe1, String sigla_equipe2, int pontuacao_equipe1, int pontuacao_equipe2) {
        this.partida_id = partida_id;
        this.sigla_equipe1 = sigla_equipe1;
        this.sigla_equipe2 = sigla_equipe2;
        this.pontuacao_equipe1 = pontuacao_equipe1;
        this.pontuacao_equipe2 = pontuacao_equipe2;
    }
    
    public Long getPartida_id() {
        return partida_id;
    }
    
    public void setPartida_id(Long partida_id) {
        this.partida_id = partida_id;
    }
    
    public String getSigla_equipe1() {
        return sigla_equipe1;
    }
    
    public void setSigla_equipe1(String sigla_equipe1) {
        this.sigla_equipe1 = sigla_equipe1;
    }
    
    public String getSigla_equipe2() {
        return sigla_equipe2;
    }
    
    public void setSigla_equipe2(String sigla_equipe2) {
        this.sigla_equipe2 = sigla_equipe2;
    }
    
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
    
}
