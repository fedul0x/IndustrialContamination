/*
 * Copyright 2014 Ivashin Alexey <ivashin.alexei@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.fedul0x.ic.gui;

import ru.fedul0x.ic.dataaccess.HibernateUtil;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public LoginFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbtnCancelConnectionSettings = new javax.swing.JButton();
        jbtnSaveConnectionSettings = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtDatabaseServerAddress = new javax.swing.JTextField();
        jpasDatabasePassword = new javax.swing.JPasswordField();

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Порт сервера БД ");
        jLabel2.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Настройки соединения с БД");
        setMinimumSize(new java.awt.Dimension(320, 280));

        java.awt.GridBagLayout jPanel6Layout = new java.awt.GridBagLayout();
        jPanel6Layout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel6Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel6.setLayout(jPanel6Layout);

        jbtnCancelConnectionSettings.setAlignmentX(0.5F);
        jbtnCancelConnectionSettings.setLabel("Отмена");
        jbtnCancelConnectionSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelConnectionSettingsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(jbtnCancelConnectionSettings, gridBagConstraints);

        jbtnSaveConnectionSettings.setText("Войти");
        jbtnSaveConnectionSettings.setAlignmentX(0.5F);
        jbtnSaveConnectionSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveConnectionSettingsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        jPanel6.add(jbtnSaveConnectionSettings, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Пароль пользователя");
        jLabel3.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel3, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jlblMessage)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jlblMessage)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jPanel1, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Имя пользователя");
        jLabel4.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel4, gridBagConstraints);

        jtxtDatabaseServerAddress.setText("admin");
        jtxtDatabaseServerAddress.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jtxtDatabaseServerAddress.setMinimumSize(new java.awt.Dimension(59, 20));
        jtxtDatabaseServerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDatabaseServerAddressActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(jtxtDatabaseServerAddress, gridBagConstraints);

        jpasDatabasePassword.setText("admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(jpasDatabasePassword, gridBagConstraints);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveConnectionSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveConnectionSettingsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbtnSaveConnectionSettingsActionPerformed

    private void jtxtDatabaseServerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDatabaseServerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDatabaseServerAddressActionPerformed

    private void jbtnCancelConnectionSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelConnectionSettingsActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnCancelConnectionSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnCancelConnectionSettings;
    private javax.swing.JButton jbtnSaveConnectionSettings;
    private javax.swing.JLabel jlblMessage;
    private javax.swing.JPasswordField jpasDatabasePassword;
    private javax.swing.JTextField jtxtDatabaseServerAddress;
    // End of variables declaration//GEN-END:variables
}