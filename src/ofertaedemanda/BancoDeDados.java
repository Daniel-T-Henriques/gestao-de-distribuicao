package ofertaedemanda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class BancoDeDados {
    ArrayList<String> registroConsole;
    
    public BancoDeDados(){
        
    }

    public void carregarDadosDoArquivo(String nomeArquivo, String tipo, RedeDist redeDist) throws FileNotFoundException, IOException {
        System.out.println("Lendo arquivo de " + tipo + ": " + nomeArquivo);
        FileReader reader = new FileReader(nomeArquivo);
        
        BufferedReader buffer = new BufferedReader(reader);
        String linha;

        if(tipo == "fabrica") {
            while ((linha = buffer.readLine()) != null) {
                // Lendo proxima linha e dividindo em campos
                System.out.println("Linha lida: " + linha);
                String[] campos = linha.split(";");

                // Atribuindo os valores dos campos a vars
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int oferta = Integer.parseInt(campos[2]);

                Fabrica fabrica = new Fabrica(id, nome, oferta);
                redeDist.fabricas.add(fabrica);

                System.out.println("Fabrica lida: " + fabrica);
            }
        }

        if(tipo == "centrosDist") {
            while ((linha = buffer.readLine()) != null) {
                // Lendo proxima linha e dividindo em campos
                System.out.println("Linha lida: " + linha);
                String[] campos = linha.split(";");

                // Atribuindo os valores dos campos a vars
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int demanda = Integer.parseInt(campos[2]);

                CentroDist centroDist = new CentroDist(id, nome, demanda);
                redeDist.centros.add(centroDist);

                System.out.println("CentroDist lido: " + centroDist);
            }
        }
        reader.close();
        buffer.close();
    }
}
