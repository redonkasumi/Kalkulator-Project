/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulatori;

/**
 *
 * @author Twin
 */
public class Kalkulator extends javax.swing.JFrame {
    
    double numri1;
    double numri2;
    double rezultati;
    String operacionet; 

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
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

        jShfaqjaETekstit = new javax.swing.JTextField();
        jButoni1 = new javax.swing.JButton();
        jButoni3 = new javax.swing.JButton();
        jButoni5 = new javax.swing.JButton();
        jButoni6 = new javax.swing.JButton();
        jButoni7 = new javax.swing.JButton();
        jButoni8 = new javax.swing.JButton();
        jButoni9 = new javax.swing.JButton();
        jButoni10 = new javax.swing.JButton();
        jButoni11 = new javax.swing.JButton();
        jButoni12 = new javax.swing.JButton();
        jButoni13 = new javax.swing.JButton();
        jButoni14 = new javax.swing.JButton();
        jButoni15 = new javax.swing.JButton();
        jButoni16 = new javax.swing.JButton();
        jButoni17 = new javax.swing.JButton();
        jButoni18 = new javax.swing.JButton();
        jButoni19 = new javax.swing.JButton();
        jButoni20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jShfaqjaETekstit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jShfaqjaETekstit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jShfaqjaETekstit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShfaqjaETekstitActionPerformed(evt);
            }
        });

        jButoni1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni1.setText("CE");
        jButoni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni1ActionPerformed(evt);
            }
        });

        jButoni3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni3.setText("=");
        jButoni3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni3ActionPerformed(evt);
            }
        });

        jButoni5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni5.setText("9");
        jButoni5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni5ActionPerformed(evt);
            }
        });

        jButoni6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni6.setText("8");
        jButoni6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni6ActionPerformed(evt);
            }
        });

        jButoni7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni7.setText("7");
        jButoni7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni7ActionPerformed(evt);
            }
        });

        jButoni8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni8.setText("-");
        jButoni8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni8ActionPerformed(evt);
            }
        });

        jButoni9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni9.setText("1");
        jButoni9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni9ActionPerformed(evt);
            }
        });

        jButoni10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni10.setText("2");
        jButoni10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni10ActionPerformed(evt);
            }
        });

        jButoni11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni11.setText("3");
        jButoni11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni11ActionPerformed(evt);
            }
        });

        jButoni12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni12.setText("+");
        jButoni12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni12ActionPerformed(evt);
            }
        });

        jButoni13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni13.setText("6");
        jButoni13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni13ActionPerformed(evt);
            }
        });

        jButoni14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni14.setText("5");
        jButoni14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni14ActionPerformed(evt);
            }
        });

        jButoni15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni15.setText("4");
        jButoni15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni15ActionPerformed(evt);
            }
        });

        jButoni16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni16.setText("*");
        jButoni16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni16ActionPerformed(evt);
            }
        });

        jButoni17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni17.setText("0");
        jButoni17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni17ActionPerformed(evt);
            }
        });

        jButoni18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni18.setText(".");
        jButoni18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni18ActionPerformed(evt);
            }
        });

        jButoni19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButoni19.setText("+/-");
        jButoni19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni19ActionPerformed(evt);
            }
        });

        jButoni20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButoni20.setText("/");
        jButoni20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButoni20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jShfaqjaETekstit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButoni1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButoni3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButoni5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButoni6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButoni9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButoni10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButoni13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButoni14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButoni17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButoni18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButoni20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jShfaqjaETekstit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButoni1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButoni5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButoni13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButoni9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButoni17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButoni20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButoni20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni20ActionPerformed
  numri1 = Double.parseDouble(jShfaqjaETekstit.getText());
        jShfaqjaETekstit.setText("");
        operacionet="/";         
    }//GEN-LAST:event_jButoni20ActionPerformed

    private void jButoni19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni19ActionPerformed
           double ops = Double.parseDouble(String.valueOf(jShfaqjaETekstit.getText()));
          ops = ops * (-1);
          jShfaqjaETekstit.setText(String.valueOf(ops));        
    }//GEN-LAST:event_jButoni19ActionPerformed

    private void jButoni9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni9ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni9.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni9ActionPerformed

    private void jButoni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni1ActionPerformed
        jShfaqjaETekstit.setText("");
    }//GEN-LAST:event_jButoni1ActionPerformed

    private void jShfaqjaETekstitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShfaqjaETekstitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jShfaqjaETekstitActionPerformed

    private void jButoni12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni12ActionPerformed
       numri1 = Double.parseDouble(jShfaqjaETekstit.getText());
        jShfaqjaETekstit.setText("");
        operacionet="+";
    }//GEN-LAST:event_jButoni12ActionPerformed

    private void jButoni8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni8ActionPerformed
    numri1 = Double.parseDouble(jShfaqjaETekstit.getText());
        jShfaqjaETekstit.setText("");
        operacionet="-";         
    }//GEN-LAST:event_jButoni8ActionPerformed

    private void jButoni16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni16ActionPerformed
         numri1 = Double.parseDouble(jShfaqjaETekstit.getText());
        jShfaqjaETekstit.setText("");
        operacionet="*";
    }//GEN-LAST:event_jButoni16ActionPerformed

    private void jButoni3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni3ActionPerformed

        String pergjigja;
        numri2 = Double.parseDouble(jShfaqjaETekstit.getText());
        if(operacionet.equals("+"))
         rezultati = numri1 + numri2;
        pergjigja = String.format("%.0f", rezultati);
        jShfaqjaETekstit.setText(rezultati + ""); 
         
        if(operacionet.equals("-"))
         rezultati = numri1 - numri2;
        pergjigja = String.format("%.0f", rezultati);
        jShfaqjaETekstit.setText(rezultati + ""); 
        if(operacionet.equals("*"))
         rezultati = numri1 * numri2;
        pergjigja = String.format("%.0f", rezultati);
           jShfaqjaETekstit.setText(rezultati + "");          
        if(operacionet.equals("/"))
         rezultati = numri1 / numri2;
        pergjigja = String.format("%.0f", rezultati);
          jShfaqjaETekstit.setText(rezultati + "");       
                     
    }//GEN-LAST:event_jButoni3ActionPerformed

    private void jButoni5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni5ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni5.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni5ActionPerformed

    private void jButoni6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni6ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni6.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni6ActionPerformed

    private void jButoni7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni7ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni7.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni7ActionPerformed

    private void jButoni13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni13ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni13.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni13ActionPerformed

    private void jButoni14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni14ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni14.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni14ActionPerformed

    private void jButoni15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni15ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni15.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni15ActionPerformed

    private void jButoni10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni10ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni10.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni10ActionPerformed

    private void jButoni11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni11ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni11.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni11ActionPerformed

    private void jButoni17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni17ActionPerformed
        String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni17.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni17ActionPerformed

    private void jButoni18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButoni18ActionPerformed
       String Shfaqnumrin = jShfaqjaETekstit.getText() + jButoni18.getText();
        jShfaqjaETekstit.setText(Shfaqnumrin);
    }//GEN-LAST:event_jButoni18ActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButoni1;
    private javax.swing.JButton jButoni10;
    private javax.swing.JButton jButoni11;
    private javax.swing.JButton jButoni12;
    private javax.swing.JButton jButoni13;
    private javax.swing.JButton jButoni14;
    private javax.swing.JButton jButoni15;
    private javax.swing.JButton jButoni16;
    private javax.swing.JButton jButoni17;
    private javax.swing.JButton jButoni18;
    private javax.swing.JButton jButoni19;
    private javax.swing.JButton jButoni20;
    private javax.swing.JButton jButoni3;
    private javax.swing.JButton jButoni5;
    private javax.swing.JButton jButoni6;
    private javax.swing.JButton jButoni7;
    private javax.swing.JButton jButoni8;
    private javax.swing.JButton jButoni9;
    private javax.swing.JTextField jShfaqjaETekstit;
    // End of variables declaration//GEN-END:variables
}
