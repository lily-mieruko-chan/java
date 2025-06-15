package org.example;

import java.util.Date;

public class Sessao extends Filme{
    private int idSessao;
    private String filme;
    private Date horario;
    private String sala;
    private double preco;
    private int vagasDisponiveia;

    public int getVagasDisponiveia() {
        return vagasDisponiveia;
    }

    public void setVagasDisponiveia(int vagasDisponiveia) {
        this.vagasDisponiveia = vagasDisponiveia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }
}
