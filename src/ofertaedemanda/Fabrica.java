package ofertaedemanda;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Fabrica {
    private int id;
    private String nome;
    private int oferta;
    private int ofertaAtual;
    public ArrayList<Float> custosTransporte = new ArrayList<>();
    public ArrayList<Integer> quantsTransporte = new ArrayList<>();

    public Fabrica(int id, String nome, int oferta) {
        this.id = id;
        this.nome = nome;
        this.oferta = oferta;
        ofertaAtual = oferta;
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

    public int getOferta() {
        return oferta;
    }
    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

    public int getOfertaAtual() {
        return ofertaAtual;
    }
    public void setOfertaAtual(int ofertaAtual) {
        this.ofertaAtual = ofertaAtual;
    }
}
