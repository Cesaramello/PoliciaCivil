/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.view;

/**
 *
 * @author Asus
 */
public class CadastrarOcorrencia extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarOcorrencia
     */
    public CadastrarOcorrencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfracaoLabel = new javax.swing.JLabel();
        InfracaoTextField = new javax.swing.JTextField();
        LocalDoCrimeLabel = new javax.swing.JLabel();
        CidadeTextField = new javax.swing.JTextField();
        CidadeLabel = new javax.swing.JLabel();
        EstadoLabel = new javax.swing.JLabel();
        EstadoTextField = new javax.swing.JTextField();
        LogradouroLabel = new javax.swing.JLabel();
        LogradouroTextField = new javax.swing.JTextField();
        NumeroLabel = new javax.swing.JLabel();
        NumeroTextField = new javax.swing.JTextField();
        CepLabel = new javax.swing.JLabel();
        CepTextField = new javax.swing.JTextField();
        BairroLabel = new javax.swing.JLabel();
        BairroTextField = new javax.swing.JTextField();
        ReferenciaLabel = new javax.swing.JLabel();
        ReferenciaTextField = new javax.swing.JTextField();
        ComplementoLabel = new javax.swing.JLabel();
        ComplementoTextField = new javax.swing.JTextField();
        DataLabel = new javax.swing.JLabel();
        DiaTextField = new javax.swing.JTextField();
        Barra1Label = new javax.swing.JLabel();
        MesTextField = new javax.swing.JTextField();
        Barra2Label = new javax.swing.JLabel();
        AnoTextField = new javax.swing.JTextField();
        HoraLabel = new javax.swing.JLabel();
        HoraTextField = new javax.swing.JTextField();
        DoisPontosLabel = new javax.swing.JLabel();
        MinutosTextField = new javax.swing.JTextField();
        VitimaLabel = new javax.swing.JLabel();
        AdicionarVitimaButton = new javax.swing.JButton();
        ComunicanteLabel = new javax.swing.JLabel();
        AdicionarComunicanteButton = new javax.swing.JButton();
        TestemunhaLabel = new javax.swing.JLabel();
        AdicionarTestemunhaButton = new javax.swing.JButton();
        AutorLabel = new javax.swing.JLabel();
        AdicionarAutorButton = new javax.swing.JButton();
        EvidenciaLabel = new javax.swing.JLabel();
        AdicionarEvidenciaButton = new javax.swing.JButton();
        DelegadoLabel = new javax.swing.JLabel();
        AdicionarDelegadoButton = new javax.swing.JButton();
        EquipePolicialLabel = new javax.swing.JLabel();
        AdicionarEquipeButton = new javax.swing.JButton();
        SegredoDeJustiçaRadioButton = new javax.swing.JRadioButton();
        SalvarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InfracaoLabel.setText("Infração");

        InfracaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfracaoTextFieldActionPerformed(evt);
            }
        });

        LocalDoCrimeLabel.setText("Local do Crime");

        CidadeLabel.setText("Cidade");

        EstadoLabel.setText("Estado");

        EstadoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoTextFieldActionPerformed(evt);
            }
        });

        LogradouroLabel.setText("Logradouro");

        LogradouroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogradouroTextFieldActionPerformed(evt);
            }
        });

        NumeroLabel.setText("Nº");

        NumeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroTextFieldActionPerformed(evt);
            }
        });

        CepLabel.setText("CEP");

        BairroLabel.setText("Bairro");

        BairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroTextFieldActionPerformed(evt);
            }
        });

        ReferenciaLabel.setText("Referencia");

        ReferenciaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReferenciaTextFieldActionPerformed(evt);
            }
        });

        ComplementoLabel.setText("Complemento");

        DataLabel.setText("Data");

        DiaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaTextFieldActionPerformed(evt);
            }
        });

        Barra1Label.setText("/");

        Barra2Label.setText("/");

        AnoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoTextFieldActionPerformed(evt);
            }
        });

        HoraLabel.setText("Hora");

        HoraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraTextFieldActionPerformed(evt);
            }
        });

        DoisPontosLabel.setText(":");

        VitimaLabel.setText("Vítima");

        AdicionarVitimaButton.setText("Adicionar Vítima");
        AdicionarVitimaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarVitimaButtonActionPerformed(evt);
            }
        });

        ComunicanteLabel.setText("Comunicante");

        AdicionarComunicanteButton.setText("Adicionar Comunicante");

        TestemunhaLabel.setText("Testemunha");

        AdicionarTestemunhaButton.setText("Adicionar Testemunha");
        AdicionarTestemunhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarTestemunhaButtonActionPerformed(evt);
            }
        });

        AutorLabel.setText("Autor");

        AdicionarAutorButton.setText("Adicionar Autor");

        EvidenciaLabel.setText("Evidência");

        AdicionarEvidenciaButton.setText("AdicionarEvidência");

        DelegadoLabel.setText("Delegado");

        AdicionarDelegadoButton.setText("Adicionar Delegado");
        AdicionarDelegadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarDelegadoButtonActionPerformed(evt);
            }
        });

        EquipePolicialLabel.setText("Equipe Policial");

        AdicionarEquipeButton.setText("Adicionar Equipe");

        SegredoDeJustiçaRadioButton.setText("Segredo de justiça");
        SegredoDeJustiçaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegredoDeJustiçaRadioButtonActionPerformed(evt);
            }
        });

        SalvarButton.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CidadeLabel)
                        .addGap(32, 32, 32)
                        .addComponent(CidadeTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LogradouroLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DataLabel)
                                        .addComponent(BairroLabel))
                                    .addComponent(VitimaLabel))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LogradouroTextField)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumeroLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CepLabel)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ReferenciaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ReferenciaTextField)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComplementoLabel)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Barra1Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Barra2Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(HoraLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DoisPontosLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MinutosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocalDoCrimeLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComunicanteLabel)
                                            .addComponent(TestemunhaLabel)
                                            .addComponent(AutorLabel))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AdicionarComunicanteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AdicionarVitimaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AdicionarAutorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AdicionarTestemunhaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(236, 236, 236)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EvidenciaLabel)
                                                    .addComponent(DelegadoLabel))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(AdicionarEvidenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(AdicionarDelegadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(EquipePolicialLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(AdicionarEquipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(SegredoDeJustiçaRadioButton, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CepTextField)
                            .addComponent(ComplementoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SalvarButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(InfracaoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(InfracaoTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InfracaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InfracaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LocalDoCrimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CidadeLabel)
                            .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstadoLabel)
                            .addComponent(EstadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogradouroLabel)
                            .addComponent(LogradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroLabel)
                            .addComponent(NumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CepLabel)
                            .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BairroLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ReferenciaLabel)
                                .addComponent(ReferenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComplementoLabel)
                                .addComponent(ComplementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataLabel)
                            .addComponent(DiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Barra1Label)
                            .addComponent(MesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Barra2Label)
                            .addComponent(AnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoraLabel)
                            .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoisPontosLabel)
                            .addComponent(MinutosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VitimaLabel)
                            .addComponent(AdicionarVitimaButton)
                            .addComponent(EvidenciaLabel)
                            .addComponent(AdicionarEvidenciaButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdicionarComunicanteButton)
                            .addComponent(ComunicanteLabel)
                            .addComponent(DelegadoLabel)
                            .addComponent(AdicionarDelegadoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdicionarTestemunhaButton)
                            .addComponent(TestemunhaLabel)
                            .addComponent(EquipePolicialLabel)
                            .addComponent(AdicionarEquipeButton))
                        .addGap(18, 18, 18)
                        .addComponent(AutorLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdicionarAutorButton)
                        .addComponent(SegredoDeJustiçaRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(SalvarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfracaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfracaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfracaoTextFieldActionPerformed

    private void EstadoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoTextFieldActionPerformed

    private void LogradouroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogradouroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogradouroTextFieldActionPerformed

    private void NumeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroTextFieldActionPerformed

    private void BairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroTextFieldActionPerformed

    private void ReferenciaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReferenciaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReferenciaTextFieldActionPerformed

    private void DiaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaTextFieldActionPerformed

    private void AnoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoTextFieldActionPerformed

    private void HoraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraTextFieldActionPerformed

    private void AdicionarVitimaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarVitimaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdicionarVitimaButtonActionPerformed

    private void AdicionarTestemunhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarTestemunhaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdicionarTestemunhaButtonActionPerformed

    private void AdicionarDelegadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarDelegadoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdicionarDelegadoButtonActionPerformed

    private void SegredoDeJustiçaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegredoDeJustiçaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegredoDeJustiçaRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarOcorrencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarAutorButton;
    private javax.swing.JButton AdicionarComunicanteButton;
    private javax.swing.JButton AdicionarDelegadoButton;
    private javax.swing.JButton AdicionarEquipeButton;
    private javax.swing.JButton AdicionarEvidenciaButton;
    private javax.swing.JButton AdicionarTestemunhaButton;
    private javax.swing.JButton AdicionarVitimaButton;
    private javax.swing.JTextField AnoTextField;
    private javax.swing.JLabel AutorLabel;
    private javax.swing.JLabel BairroLabel;
    private javax.swing.JTextField BairroTextField;
    private javax.swing.JLabel Barra1Label;
    private javax.swing.JLabel Barra2Label;
    private javax.swing.JLabel CepLabel;
    private javax.swing.JTextField CepTextField;
    private javax.swing.JLabel CidadeLabel;
    private javax.swing.JTextField CidadeTextField;
    private javax.swing.JLabel ComplementoLabel;
    private javax.swing.JTextField ComplementoTextField;
    private javax.swing.JLabel ComunicanteLabel;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JLabel DelegadoLabel;
    private javax.swing.JTextField DiaTextField;
    private javax.swing.JLabel DoisPontosLabel;
    private javax.swing.JLabel EquipePolicialLabel;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JTextField EstadoTextField;
    private javax.swing.JLabel EvidenciaLabel;
    private javax.swing.JLabel HoraLabel;
    private javax.swing.JTextField HoraTextField;
    private javax.swing.JLabel InfracaoLabel;
    private javax.swing.JTextField InfracaoTextField;
    private javax.swing.JLabel LocalDoCrimeLabel;
    private javax.swing.JLabel LogradouroLabel;
    private javax.swing.JTextField LogradouroTextField;
    private javax.swing.JTextField MesTextField;
    private javax.swing.JTextField MinutosTextField;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JTextField NumeroTextField;
    private javax.swing.JLabel ReferenciaLabel;
    private javax.swing.JTextField ReferenciaTextField;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JRadioButton SegredoDeJustiçaRadioButton;
    private javax.swing.JLabel TestemunhaLabel;
    private javax.swing.JLabel VitimaLabel;
    // End of variables declaration//GEN-END:variables
}
