package ofertaedemanda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class TelaPrincipal extends javax.swing.JFrame {

    RedeDist redeDist = new RedeDist();
    BancoDeDados bancoDeDados = new BancoDeDados();

    public TelaPrincipal() {
        initComponents();
        
        // Lendo fabricas.csv
        try {
            redeDist = bancoDeDados.carregarDadosDoArquivo(
                    "fabricas.csv", "fabrica", redeDist);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //<editor-fold desc="Adicionando ao console">
        for(int i=0; i < redeDist.fabricas.size(); i++) {
            // Adicionando na lista
            txtFabricas.append(redeDist.fabricas.get(i).getNome() + "\n");
        }
        System.out.println(redeDist.fabricas.size() + " fabricas adicionadas");
        System.out.println(redeDist.fabricas.get(0).getNome());
        //</editor-fold>
        
        // Lendo centrosDist.csv
        try {
            redeDist = bancoDeDados.carregarDadosDoArquivo(
                    "centrosDist.csv", "centrosDist", redeDist);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //<editor-fold desc="Adicionando ao console">
        for (int i=0; i<redeDist.centros.size(); i++) {
            redeDist.conectarCentro();
            // Adicionando na lista
            txtCentros.append(redeDist.centros.get(i).getNome() + "\n");
        }
        System.out.println(redeDist.centros.size() + " centros de dist. adicionados");
        System.out.println(redeDist.centros.get(0).getNome());
        //</editor-fold>
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtOfertaOuDemanda = new javax.swing.JTextField();
        btnNovaFabrica = new javax.swing.JButton();
        btnNovoCentroDist = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEditarTabelaDist = new javax.swing.JButton();
        btnTestarCaso = new javax.swing.JButton();
        btnEditarTabelaCustos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCentros = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtFabricas = new javax.swing.JTextArea();
        btnSalvarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("--- Distribuidor ---");

        txtConsole.setEditable(false);
        txtConsole.setColumns(20);
        txtConsole.setRows(5);
        txtConsole.setText("<CONSOLE>");
        jScrollPane1.setViewportView(txtConsole);

        txtId.setToolTipText("Digite o ID do nó da rede");
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNome.setToolTipText("Digite o nome do nó da rede");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtOfertaOuDemanda.setToolTipText("Defina a oferta/demanda inicial do nó");
        txtOfertaOuDemanda.setName(""); // NOI18N
        txtOfertaOuDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfertaOuDemandaActionPerformed(evt);
            }
        });

        btnNovaFabrica.setText("Fabrica");
        btnNovaFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaFabricaActionPerformed(evt);
            }
        });

        btnNovoCentroDist.setText("Centro de Distribuição");
        btnNovoCentroDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCentroDistActionPerformed(evt);
            }
        });

        jLabel3.setText("ID:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Oferta / Demanda:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Novo nó da rede de distribuição:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Administração de transporte:");

        btnEditarTabelaDist.setText("Editar tabela de distribuição");
        btnEditarTabelaDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTabelaDistActionPerformed(evt);
            }
        });

        btnTestarCaso.setText("Testar caso atual");
        btnTestarCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarCasoActionPerformed(evt);
            }
        });

        btnEditarTabelaCustos.setText("Editar tabela de custos");
        btnEditarTabelaCustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTabelaCustosActionPerformed(evt);
            }
        });

        jLabel2.setText("Fábricas");

        jLabel8.setText("Centros de Distribuição");

        txtCentros.setEditable(false);
        txtCentros.setColumns(20);
        txtCentros.setRows(5);
        jScrollPane4.setViewportView(txtCentros);

        txtFabricas.setEditable(false);
        txtFabricas.setColumns(20);
        txtFabricas.setRows(5);
        jScrollPane5.setViewportView(txtFabricas);

        btnSalvarDados.setText("Salvar dados");
        btnSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId)
                                    .addComponent(txtNome)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarTabelaDist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTestarCaso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarTabelaCustos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovaFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNovoCentroDist, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOfertaOuDemanda))
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarDados))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOfertaOuDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovaFabrica)
                            .addComponent(btnNovoCentroDist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnEditarTabelaDist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarTabelaCustos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTestarCaso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaFabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaFabricaActionPerformed

        // Se um dos campos está vazio
        if (txtId.getText().isEmpty() || txtNome.getText().isEmpty() || txtOfertaOuDemanda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(txtId, "Preencha todos os campos para continuar!");
        }
        // Se o id já está em uso
        if (redeDist.idTestFabrica(Integer.parseInt(txtId.getText()))) {
            JOptionPane.showMessageDialog(txtId, "Já existe uma fábica com esse ID!");
        } else {
            // Atribuindo os inputs a variaveis
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText();
            int oferta = Integer.parseInt(txtOfertaOuDemanda.getText());

            // Criando nova Fabrica
            Fabrica novaFabrica = new Fabrica(id, nome, oferta);
            redeDist.addFabrica(novaFabrica);
            
            // Adicionando ao console
            txtConsole.append("\nNova fábrica adicionada: (id=" + id
                    + ", nome=\"" + nome
                    + "\", oferta=" + oferta + ")");
            
            // Adicionando na lista
            txtFabricas.append(nome + "\n");
        }
    }//GEN-LAST:event_btnNovaFabricaActionPerformed

    private void btnNovoCentroDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCentroDistActionPerformed
        // Se um dos campos está vazio
        if (txtId.getText().isEmpty()
                || txtNome.getText().isEmpty()
                || txtOfertaOuDemanda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(txtId, "Preencha todos os campos para continuar!");
        }
        // Se o id inserido já está em uso
        if (redeDist.idTestCentroDist(Integer.parseInt(txtId.getText()))) {
            JOptionPane.showMessageDialog(txtId, "Já existe uma fábica com esse ID!");
        } else {
            // Atribuindo os inputs a variaveis
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText();
            int demanda = Integer.parseInt(txtOfertaOuDemanda.getText());

            // Criando nova Fabrica
            CentroDist novoCentroDist = new CentroDist(id, nome, demanda);
            redeDist.addCentroDist(novoCentroDist);

            // Adicionando Array do centro aos arraylists das fábricas
            redeDist.conectarCentro();
            
            // Adicionando ao console
            txtConsole.append("\nNovo centro de distribuição adicionado: (id=" + id
                    + ", nome=\""+ nome + "\""
                    +", demanda=" + demanda + ")");
            
            // Adicionando na lista
            txtCentros.append(nome + "\n");
        }
    }//GEN-LAST:event_btnNovoCentroDistActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtOfertaOuDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfertaOuDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOfertaOuDemandaActionPerformed

    private void btnEditarTabelaDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTabelaDistActionPerformed

        // Limpando a tabela de distribuição
        redeDist.limparTabelaDist();
        
        for (int i = 0; i < redeDist.fabricas.size(); i++) {

            for (int j = 0; j < redeDist.centros.size(); j++) {
                int quant;
                

                quant = Integer.parseInt(
                    JOptionPane.showInputDialog(btnEditarTabelaDist,
                        redeDist.fabricas.get(i).getNome()
                            + " -> "
                            + redeDist.centros.get(j).getNome()
                            + "\nQuantidade atual: "
                            + redeDist.fabricas.get(i).quantsTransporte.get(j)
                            + "\n\nOferta: " + redeDist.fabricas.get(i).getOfertaAtual()
                            + "\nDemanda: " + redeDist.centros.get(j).getDemandaAtual(),
                        "Editar tabela de transporte",
                        HEIGHT
                    )
                );
                
                // Atribuindo o valor
                redeDist.fabricas.get(i).quantsTransporte.set(j, quant);
                
                // Diminuindo a oferta da fabrica
                redeDist.fabricas.get(i).setOfertaAtual(
                    redeDist.fabricas.get(i).getOfertaAtual() - quant
                );
                
                // Diminuindo a demanda do centro
                redeDist.centros.get(j).setDemandaAtual(
                    redeDist.centros.get(j).getDemandaAtual() - quant
                );
            }
        }
    }//GEN-LAST:event_btnEditarTabelaDistActionPerformed

    private void btnTestarCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarCasoActionPerformed
        // TODO add your handling code here:
        if (redeDist.testarCaso()) {
            JOptionPane.showMessageDialog(btnTestarCaso, "O CASO ATUAL É VÁLIDO!");
        } else {
            JOptionPane.showMessageDialog(btnTestarCaso, "O CASO ATUAL NÃO É VÁLIDO!");
        }
    }//GEN-LAST:event_btnTestarCasoActionPerformed

    private void btnEditarTabelaCustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTabelaCustosActionPerformed
        
        // Limpando tabela de custos
        //redeDist.limparTabelaCustos();
        
        for (int i = 0; i < redeDist.fabricas.size(); i++) {

            for (int j = 0; j < redeDist.centros.size(); j++) {
                float custo;

                custo = Float.parseFloat(
                    JOptionPane.showInputDialog(btnEditarTabelaDist,
                    redeDist.fabricas.get(i).getNome()
                            + " -> "
                            + redeDist.centros.get(j).getNome()
                            + "\nCusto atual: "
                            + redeDist.fabricas.get(i).custosTransporte.get(j),
                    "Editar tabela de custos",
                    HEIGHT
                    )
                );
                redeDist.fabricas.get(i).custosTransporte.set(j, custo);
            }
        }
    }//GEN-LAST:event_btnEditarTabelaCustosActionPerformed

    private void btnSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosActionPerformed
        try {
            bancoDeDados.salvarDados(redeDist);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarTabelaCustos;
    private javax.swing.JButton btnEditarTabelaDist;
    private javax.swing.JButton btnNovaFabrica;
    private javax.swing.JButton btnNovoCentroDist;
    private javax.swing.JButton btnSalvarDados;
    private javax.swing.JButton btnTestarCaso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtCentros;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextArea txtFabricas;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOfertaOuDemanda;
    // End of variables declaration//GEN-END:variables
}
