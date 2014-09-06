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

import ru.fedul0x.ic.dataaccess.dataobject.ContaminationByFederalClassification;
import ru.fedul0x.ic.view.component.model.HibernateRowTableModel;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtablFKKO = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuLogin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jitemLogin = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jitemExit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmenuHandbook = new javax.swing.JMenu();
        jitemFKKO = new javax.swing.JMenuItem();
        jmenuAbout = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jtablFKKO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtablFKKO);

        getContentPane().add(jScrollPane1);

        jmenuLogin.setText("Вход");

        jMenuItem1.setText("Настройки БД");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmenuLogin.add(jMenuItem1);

        jitemLogin.setText("Авторизация");
        jitemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitemLoginActionPerformed(evt);
            }
        });
        jmenuLogin.add(jitemLogin);
        jmenuLogin.add(jSeparator2);

        jitemExit.setText("Выход из программы");
        jmenuLogin.add(jitemExit);
        jmenuLogin.add(jSeparator1);

        jMenuBar1.add(jmenuLogin);

        jmenuHandbook.setText("Справочники");

        jitemFKKO.setText("ФККО");
        jitemFKKO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitemFKKOActionPerformed(evt);
            }
        });
        jmenuHandbook.add(jitemFKKO);

        jMenuBar1.add(jmenuHandbook);

        jmenuAbout.setText("О программе");

        jMenuItem2.setText("jMenuItem2");
        jmenuAbout.add(jMenuItem2);

        jMenuBar1.add(jmenuAbout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jitemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitemLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jitemLoginActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DatabaseSettingsFrame mainFrame = new DatabaseSettingsFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jitemFKKOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitemFKKOActionPerformed
        HibernateRowTableModel<ContaminationByFederalClassification> hrtm = new HibernateRowTableModel(ContaminationByFederalClassification.class);
        jtablFKKO.setModel(hrtm);
// TODO add your handling code here:
    }//GEN-LAST:event_jitemFKKOActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jitemExit;
    private javax.swing.JMenuItem jitemFKKO;
    private javax.swing.JMenuItem jitemLogin;
    private javax.swing.JMenu jmenuAbout;
    private javax.swing.JMenu jmenuHandbook;
    private javax.swing.JMenu jmenuLogin;
    private javax.swing.JTable jtablFKKO;
    // End of variables declaration//GEN-END:variables
}
