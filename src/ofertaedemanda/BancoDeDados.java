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

    public void carregarDadosDoArquivo(String nomeArquivo, String tipo) throws FileNotFoundException, IOException {
        System.out.println("Lendo arquivo de " + tipo + ": " + nomeArquivo);
        BufferedReader buffer = new BufferedReader(new FileReader(nomeArquivo));
        String linha;

        while ((linha = buffer.readLine()) != null) {
            System.out.println("Linha lida: " + linha);
            String[] campos = linha.split(";");

            if(tipo == "fabrica") {
                String nome = campos[1];
                int oferta = Integer.parseInt(campos[2]);
                Fabrica fabrica = new Fabrica(nome, oferta);
            }
//            if(tipo == "centroDist") {
//                String nome = campos[1];
//                int oferta = Integer.parseInt(campos[2]);
//                CentroDist centroDist = new CentroDist(nome, oferta);
//            }
//            if(tipo == "dadosTransporte") {
//                String nome = campos[1];
//                int oferta = Integer.parseInt(campos[2]);
//                CentroDist centroDist = new CentroDist(nome, oferta);
//            }
//            if(tipo == "dadosOfertaEDemanda"){
//                String desc = campos[1];
//            }
        }
    }
        
}
