package ofertaedemanda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class CentroDist {
    private int id;
    private String nome;
    private int demanda;
    private int demandaAtual;
    private int idAtual = 0;

    public CentroDist(String nome, int demanda) {
        this.id = gerarId(idAtual);
        this.nome = nome;
        this.demanda = demanda;
        demandaAtual = demanda;
    }
    
    private static int gerarId(int idAtual) {
        return(idAtual++);
    }

    //<editor-fold desc="Getters e Setters">
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDemanda() {
        return demanda;
    }
    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }
    //</editor-fold>

    public int getDemandaAtual() {
        return demandaAtual;
    }

    public void setDemandaAtual(int demandaAtual) {
        this.demandaAtual = demandaAtual;
    }
}
