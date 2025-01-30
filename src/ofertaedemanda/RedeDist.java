package ofertaedemanda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class RedeDist {
    ArrayList<Fabrica> fabricas = new ArrayList<>();
    ArrayList<CentroDist> centros = new ArrayList<>();

    public RedeDist() {
    
    }
    
    public void conectarCentro(){
        for (int i=0; i<this.fabricas.size(); i++){
            this.fabricas.get(i).custosTransporte.add(Float.NaN);
            this.fabricas.get(i).quantsTransporte.add(0);
        }
    }
        
    public boolean testarCaso(){
        // Para cada fabrica
        for (int i=0; i < this.fabricas.size(); i++){
            // Valor de oferta
            int oferta = this.fabricas.get(i).getOferta();
            
            // Valor total de demanda
            int demandaTotal = 0;
            for (int j=0; j < this.centros.size(); j++){
                demandaTotal += this.fabricas.get(i).quantsTransporte.get(j);
            }
            
            // Teste
            if (demandaTotal > oferta){
                return false;
            }
        }
        return true;
    }
    
    // Testar se o id ja foi atribuido
    public boolean idTestFabrica(int id){
        for(int i=0; i<fabricas.size(); i++){
            if(id == fabricas.get(i).getId()){
                return true;
            }
        }
        return false;
    }
    public boolean idTestCentroDist(int id){
        for(int i=0; i<centros.size(); i++){
            if(id == centros.get(i).getId()){
                return true;
            }
        }
        return false;
    }

    public void limparTabelaDist() {
        for (int i = 0; i < fabricas.size(); i++) {

            for (int j = 0; j < centros.size(); j++) {
                fabricas.get(i).setOfertaAtual(fabricas.get(i).getOferta());
                centros.get(j).setDemandaAtual(centros.get(j).getDemanda());
            }
        }
    }
    
    public void limparTabelaCustos() {
        for (int i=0; i < fabricas.size(); i++) {
            fabricas.get(i).custosTransporte.clear();
        }
    }

    //<editor-fold desc="Getters e Setters">
    public void addFabrica(Fabrica fabrica) {
        fabricas.add(fabrica);
    }

    public void addCentroDist(CentroDist centroDist) {
        centros.add(centroDist);
    }
    
    //</editor-fold>
}
