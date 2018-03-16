/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishaw
 */
public class RC4GUI extends javax.swing.JFrame {

    /**
     * Creates new form RC4GUI
     */
    public RC4GUI() {
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

        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        plaintextLabel = new javax.swing.JLabel();
        plainText = new javax.swing.JTextField();
        encryptButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        ciphertextBoxLabel = new javax.swing.JLabel();
        setPasswordButton = new javax.swing.JButton();
        ivLabel = new javax.swing.JLabel();
        ivText = new javax.swing.JTextField();
        decryptButton = new javax.swing.JButton();
        ivDetectedLabel = new javax.swing.JLabel();
        cipherTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RC4 simple tutorial");

        passwordLabel.setText("Password (6 digit number)");

        plaintextLabel.setText("Plaintext Message");

        encryptButton.setText("Encrypt!");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        outputTextArea.setColumns(20);
        outputTextArea.setLineWrap(true);
        outputTextArea.setRows(5);
        jScrollPane1.setViewportView(outputTextArea);

        ciphertextBoxLabel.setText("Output Box");

        setPasswordButton.setText("Set Password");
        setPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPasswordButtonActionPerformed(evt);
            }
        });

        ivLabel.setText("Random Initialisation Vector");

        decryptButton.setText("Decrypt!");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        ivDetectedLabel.setText("Initialisation Vector Detected");

        jLabel1.setText("Ciphertext Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ciphertextBoxLabel)
                        .addGap(870, 870, 870))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(plaintextLabel)
                                    .addComponent(passwordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(setPasswordButton)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(plainText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(encryptButton))))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ivLabel)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cipherTextField)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decryptButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ivText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ivDetectedLabel)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPasswordButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plaintextLabel)
                            .addComponent(plainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encryptButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ivLabel)
                            .addComponent(ivText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ivDetectedLabel))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cipherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(decryptButton)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(ciphertextBoxLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        plainText.setEditable(false);
       
        rc4 = new RC4(this.password.getText(), this.plainText.getText());

        String initialisationVector = String.format("%02d",(int)(Math.random()*99));

        this.ivLabel.setVisible(true);
        this.ivText.setText(initialisationVector);
        this.ivText.setVisible(true);
        
        int[] stateArray = rc4.makeStateArray(initialisationVector);
        
        String cipherText = rc4.makeCipherText(stateArray);

        String IV1 = Integer.toBinaryString(initialisationVector.charAt(0));
        IV1 = IV1.substring(2);
        String IV2 = Integer.toBinaryString(initialisationVector.charAt(1));
        IV2 = IV2.substring(2);
          
        String IVBinary1 = String.format("%08d", Integer.parseInt(IV1));
        String IVBinary2 = String.format("%08d", Integer.parseInt(IV2));

        String cipherTextFinal = IVBinary1 + IVBinary2 + cipherText;
        
        outputTextArea.setText(cipherTextFinal);
        
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void setPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPasswordButtonActionPerformed
        this.password.setEditable(false);
        this.setPasswordButton.setVisible(false);
        this.encryptButton.setVisible(true);
        this.decryptButton.setVisible(true);
        this.plainText.setEditable(true);        
        this.cipherTextField.setEditable(true);        
    }//GEN-LAST:event_setPasswordButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        String cipherTextBinary = this.cipherTextField.getText();
        String initialisationVector = new String();
        initialisationVector += String.valueOf(Integer.parseInt(cipherTextBinary.substring(0,8), 2));
        initialisationVector += String.valueOf(Integer.parseInt(cipherTextBinary.substring(8,16), 2));
        this.ivText.setText(initialisationVector);
        this.ivText.setVisible(true);
        this.ivLabel.setVisible(false);
        this.ivDetectedLabel.setVisible(true);
        
        cipherTextBinary = cipherTextBinary.substring(16);
        String cipherText = new String();

        rc4 = new RC4(this.password.getText(), cipherText);
        
        int[] stateArray = rc4.makeStateArray(initialisationVector);
        
        String decryptedPlainText = rc4.makePlainText(stateArray, cipherTextBinary);
        this.outputTextArea.setText(decryptedPlainText);
                
    }//GEN-LAST:event_decryptButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RC4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RC4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RC4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RC4GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RC4GUI rc4gui = new RC4GUI();
                rc4gui.setVisible(true);
                rc4gui.encryptButton.setVisible(false);
                rc4gui.decryptButton.setVisible(false);
                rc4gui.ivLabel.setVisible(false);
                rc4gui.ivText.setVisible(false);
                rc4gui.ivDetectedLabel.setVisible(false);
                rc4gui.plainText.setEditable(false);
                rc4gui.cipherTextField.setEditable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cipherTextField;
    private javax.swing.JLabel ciphertextBoxLabel;
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JLabel ivDetectedLabel;
    private javax.swing.JLabel ivLabel;
    private javax.swing.JTextField ivText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JTextField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField plainText;
    private javax.swing.JLabel plaintextLabel;
    private javax.swing.JButton setPasswordButton;
    // End of variables declaration//GEN-END:variables
    private RC4 rc4;
}
