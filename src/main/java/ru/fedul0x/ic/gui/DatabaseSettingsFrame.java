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

import ru.fedul0x.ic.SystemSettings;
import ru.fedul0x.ic.dataaccess.HibernateUtil;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class DatabaseSettingsFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public DatabaseSettingsFrame() {
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
        jbtnCheckConnection = new javax.swing.JButton();
        jbtnCancelConnectionSettings = new javax.swing.JButton();
        jbtnSaveConnectionSettings = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtDatabaseUsername = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jlblMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtDatabaseHost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtDatabasePort = new javax.swing.JTextField();
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
        jPanel6Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel6.setLayout(jPanel6Layout);

        jbtnCheckConnection.setText("Проверить соединение");
        jbtnCheckConnection.setAlignmentX(0.5F);
        jbtnCheckConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheckConnectionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(jbtnCheckConnection, gridBagConstraints);

        jbtnCancelConnectionSettings.setAlignmentX(0.5F);
        jbtnCancelConnectionSettings.setLabel("Отмена");
        jbtnCancelConnectionSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelConnectionSettingsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(jbtnCancelConnectionSettings, gridBagConstraints);

        jbtnSaveConnectionSettings.setAlignmentX(0.5F);
        jbtnSaveConnectionSettings.setLabel("Сохранить");
        jbtnSaveConnectionSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveConnectionSettingsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        jPanel6.add(jbtnSaveConnectionSettings, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Пользователь БД");
        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel1, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setLabelFor(jtxtDatabaseUsername);
        jLabel3.setText("Пароль БД");
        jLabel3.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel3, gridBagConstraints);

        jtxtDatabaseUsername.setText("postgres");
        jtxtDatabaseUsername.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jtxtDatabaseUsername.setMinimumSize(new java.awt.Dimension(59, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jPanel6.add(jtxtDatabaseUsername, gridBagConstraints);

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
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jPanel1, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Адрес сервера БД ");
        jLabel4.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel4, gridBagConstraints);

        jtxtDatabaseHost.setText("192.168.0.101");
        jtxtDatabaseHost.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jtxtDatabaseHost.setMinimumSize(new java.awt.Dimension(59, 20));
        jtxtDatabaseHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDatabaseHostActionPerformed(evt);
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
        jPanel6.add(jtxtDatabaseHost, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setLabelFor(jtxtDatabaseUsername);
        jLabel5.setText("Порт сервера БД");
        jLabel5.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel6.add(jLabel5, gridBagConstraints);

        jtxtDatabasePort.setText("5432");
        jtxtDatabasePort.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jtxtDatabasePort.setMinimumSize(new java.awt.Dimension(59, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(jtxtDatabasePort, gridBagConstraints);

        jpasDatabasePassword.setText("postgres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(jpasDatabasePassword, gridBagConstraints);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveConnectionSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveConnectionSettingsActionPerformed
        SystemSettings.getSettings().setHost(jtxtDatabaseHost.getText());
        SystemSettings.getSettings().setPort(Integer.valueOf(jtxtDatabasePort.getText()));
        SystemSettings.getSettings().setUsername(jtxtDatabaseUsername.getText());
        SystemSettings.getSettings().setPassword(jpasDatabasePassword.getText());
        dispose();
        
    }//GEN-LAST:event_jbtnSaveConnectionSettingsActionPerformed

    private void jbtnCheckConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheckConnectionActionPerformed
        // TODO add your handling code here:
//        System.out.print(jtxtDatabaseHost.getText());
//        System.out.print(jtxtDatabasePort.getText());
//        System.out.print(jtxtDatabaseUsername.getText());
//        System.out.print(jpasDatabasePassword.getText());
//        System.out.print(Integer.valueOf(jtxtDatabasePort.getText()));
        
//        HibernateUtil.getSessionFactory(jtxtDatabaseHost.getText(), 
//                Integer.valueOf(jtxtDatabasePort.getText()), jtxtDatabaseUsername.getText(), jpasDatabasePassword.getText());
        Boolean flag = ! HibernateUtil.getSessionFactory().getCurrentSession().isOpen();
        jlblMessage.setText(flag.toString());
    }//GEN-LAST:event_jbtnCheckConnectionActionPerformed

    private void jtxtDatabaseHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDatabaseHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDatabaseHostActionPerformed

    private void jbtnCancelConnectionSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelConnectionSettingsActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnCancelConnectionSettingsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(DatabaseSettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseSettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseSettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseSettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseSettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnCancelConnectionSettings;
    private javax.swing.JButton jbtnCheckConnection;
    private javax.swing.JButton jbtnSaveConnectionSettings;
    private javax.swing.JLabel jlblMessage;
    private javax.swing.JPasswordField jpasDatabasePassword;
    private javax.swing.JTextField jtxtDatabaseHost;
    private javax.swing.JTextField jtxtDatabasePort;
    private javax.swing.JTextField jtxtDatabaseUsername;
    // End of variables declaration//GEN-END:variables
}
