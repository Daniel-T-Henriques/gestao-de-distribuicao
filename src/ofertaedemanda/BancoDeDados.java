package ofertaedemanda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class BancoDeDados {

    ArrayList<String> registroConsole;

    public BancoDeDados() {

    }

    public RedeDist carregarDadosDoArquivo(
            String nomeArquivo, String tipo, RedeDist redeDist
    ) throws FileNotFoundException, IOException {
        System.out.println("Lendo arquivo de " + tipo + ": " + nomeArquivo);
        FileReader reader = new FileReader(nomeArquivo);

        BufferedReader buffer = new BufferedReader(reader);
        String linha;

        if (tipo == "fabrica") {
            while ((linha = buffer.readLine()) != null) {
                // Lendo proxima linha e dividindo em campos
                String[] campos = linha.split(";");

                // Atribuindo os valores dos campos a vars
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int oferta = Integer.parseInt(campos[2]);

                Fabrica fabrica = new Fabrica(id, nome, oferta);
                redeDist.fabricas.add(fabrica);
            }
        }

        if (tipo == "centrosDist") {
            while ((linha = buffer.readLine()) != null) {
                // Lendo proxima linha e dividindo em campos
                String[] campos = linha.split(";");

                // Atribuindo os valores dos campos a vars
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int demanda = Integer.parseInt(campos[2]);

                CentroDist centroDist = new CentroDist(id, nome, demanda);
                redeDist.centros.add(centroDist);
                redeDist.conectarCentro();
            }
        }
        reader.close();
        buffer.close();
        return redeDist;
    }

    public void salvarDados(RedeDist redeDist) throws FileNotFoundException, IOException {
        System.out.println("Salvando dados...");

        String id, nome, ofertaOuDemanda;

        FileWriter writerFabrica = new FileWriter("fabricas.csv", false);
        Fabrica fabrica;

        for (int i = 0; i < redeDist.fabricas.size(); i++) {
            fabrica = redeDist.fabricas.get(i);

            id = String.valueOf(fabrica.getId());
            nome = String.valueOf(fabrica.getNome());
            ofertaOuDemanda = String.valueOf(fabrica.getOferta());

            writerFabrica.append(id + ";" + nome + ";" + ofertaOuDemanda + "\n");
        }
        writerFabrica.close();

        FileWriter writerCentros = new FileWriter("centrosDist.csv", false);
        CentroDist centro;

        for (int i = 0; i < redeDist.centros.size(); i++) {
            centro = redeDist.centros.get(i);

            id = String.valueOf(centro.getId());
            nome = String.valueOf(centro.getNome());
            ofertaOuDemanda = String.valueOf(centro.getDemanda());

            writerCentros.append(id + ";" + nome + ";" + ofertaOuDemanda + "\n");
        }
        writerCentros.close();

    }

    public float[][] calcularRoteamento(float[][] custos, float[][] rotas) {
        int altura = custos.length;
        int largura = custos[0].length;
        int numElementos = altura + largura;
        
        var solucao = new float[altura][largura];
        
        ArrayList<Float> custosEmOrdemDecrescente = new ArrayList<>();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                custosEmOrdemDecrescente.add(custos[i][j]);
            }
        }
        Collections.sort(custosEmOrdemDecrescente);
        System.out.println(custosEmOrdemDecrescente);
        
        // Rodar algoritmo para todos os elementos
        for (int i = 0; i < numElementos; i++) {
            
        }

        solucao[0][0] = 1;
        System.out.println("");

        return solucao;
    }
}
