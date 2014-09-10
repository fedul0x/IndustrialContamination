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

import java.awt.CardLayout;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;
import ru.fedul0x.ic.dataaccess.DataSourceHibernate;
import ru.fedul0x.ic.dataaccess.dataobject.ContaminationComposition;
import ru.fedul0x.ic.gui.component.model.AutoCompletion;
import ru.fedul0x.ic.gui.component.model.HibernatedComboBoxModel;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class ContaminationCompositionInputPanel extends javax.swing.JPanel {

    private ContaminationComposition contaminationComposition;
    private List<ContaminationComposition> allContaminations;

    /**
     * Creates new form CompanyInputPanel
     */
    public void updateComboBox() {
        DataSourceHibernate<ContaminationComposition> dsh = new DataSourceHibernate<>(ContaminationComposition.class);
        allContaminations = dsh.findAll();
//        jTable1.setDefaultEditor(null, null);
//        jTable1.setDefaultEditor(Integer.class,
//                new IntegerEditor(0, 100));
        TableColumn nameColumn = jTable1.getColumnModel().getColumn(0);
        JComboBox cb = new JComboBox();
        cb.setModel(new HibernatedComboBoxModel());
        cb.setEditable(true);
        AutoCompletion.enable(cb);
        DefaultCellEditor dce = new DefaultCellEditor(cb);

        dce.setClickCountToStart(2);
        nameColumn.setCellEditor(dce);
//        dce.addCellEditorListener(new CellEditorListener() {
//
//            @Override
//            public void editingStopped(ChangeEvent ce) {
//                System.out.println("In key pressed");
//                DefaultCellEditor dce = (DefaultCellEditor) ce.getSource();
//                System.out.println(dce.getCellEditorValue().toString());
//                DataSourceHibernate<ContaminationComposition> dsh = new DataSourceHibernate<>(ContaminationComposition.class);
//                ContaminationComposition cc = new ContaminationComposition(dce.getCellEditorValue().toString());
//                dsh.makePersistent(cc);
//                String[] ep = {"id", "dataSheetContaminationCompositions"};
//                if (dsh.findByExample(cc, ep).size() == 1) {
//                    updateComboBox();
//                }
//            }
//
//            @Override
//            public void editingCanceled(ChangeEvent ce) {
//            }
//        });
        //this is JSpinner
//        TableColumn portionColumn = jTable1.getColumnModel().getColumn(1);
//        JSpinner sp = new JSpinner();
//        portionColumn.setCe  CellEditor(new DefaultCellEditor(sp));
    }

    public ContaminationCompositionInputPanel() {
        initComponents();
        contaminationComposition = null;
        updateComboBox();

//        cb.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("In key pressed");
//                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//                    System.out.println("Delete key hit");
//                    JComboBox cb = ((JComboBox) e.getSource());                    
//                    DataSourceHibernate<ContaminationComposition> dsh = new DataSourceHibernate<>(ContaminationComposition.class);
//                    ContaminationComposition cc = new ContaminationComposition(cb.getSelectedItem().toString());
//                    dsh.makePersistent(cc);
//                    String[] ep = {"id", "dataSheetContaminationCompositions"};
//                    if (dsh.findByExample(cc, ep).size() == 1) {
//                        cb.addItem(cb.getSelectedItem().toString());
//                    }
//                }
//            }
//        });
//        TableColumn portionColumn = jTable1.getColumnModel().getColumn(1);
//        JComboBox cb2 = new JComboBox();
//        cb2.addItem("1");
//        cb2.addItem("2");
//        cb2.addItem("3");
//        cb2.addItem("4");
//        cb2.addItem("5");
//        portionColumn.setCellEditor(new DefaultCellEditor(cb2));
    }

    public ContaminationCompositionInputPanel(ContaminationComposition contaminationComposition) {
        initComponents();
        this.contaminationComposition = contaminationComposition;
    }

    //editable outside
    public ContaminationComposition getContaminationComposition() {
        return contaminationComposition;
    }

    public void setContaminationComposition(ContaminationComposition contaminationComposition) {
        this.contaminationComposition = contaminationComposition;
    }

//    public synchronized DataSheet getDataSheet() {
//        return dataSheet;
//    }
//
//    public synchronized void setDataSheet(DataSheet dataSheet) {
//        this.dataSheet = dataSheet;
//        if (null == dataSheet) {
//            jtxtBalance.setText("");
//        } else {
//            StringBuffer buf = new StringBuffer();
//            Formatter format = new Formatter(buf);
//            format.format("%d (%s)", dataSheet.getContamination().getCode(), dataSheet.getContamination().getDescription());
//            jtxtBalance.setText(format.toString());
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jbtnSaveContaminationComposition = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtxtBalance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        setLayout(layout);

        jbtnSaveContaminationComposition.setAlignmentX(0.5F);
        jbtnSaveContaminationComposition.setLabel("Сохранить");
        jbtnSaveContaminationComposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveContaminationCompositionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 38;
        add(jbtnSaveContaminationComposition, gridBagConstraints);

        jbtnCancel.setAlignmentX(0.5F);
        jbtnCancel.setLabel("Отмена");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 38;
        add(jbtnCancel, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 36;
        gridBagConstraints.gridwidth = 25;
        gridBagConstraints.weighty = 1.0;
        add(jPanel2, gridBagConstraints);

        jLabel17.setText("Остаток");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        add(jLabel17, gridBagConstraints);

        jtxtBalance.setEditable(false);
        jtxtBalance.setBackground(new java.awt.Color(230, 230, 230));
        jtxtBalance.setText("100");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(jtxtBalance, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Вещество", "Содержание"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.gridheight = 31;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSaveContaminationCompositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveContaminationCompositionActionPerformed
        // TODO add your handling code here:
        ContaminationComposition cc = new ContaminationComposition("картон");
        ContaminationComposition cc2 = new ContaminationComposition("бумага");
        DataSourceHibernate<ContaminationComposition> dsh = new DataSourceHibernate<>(ContaminationComposition.class);
        dsh.makePersistent(cc);
        dsh.makePersistent(cc2);
    }//GEN-LAST:event_jbtnSaveContaminationCompositionActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        ((CardLayout) getParent().getLayout()).previous(getParent());
        getParent().remove(this);
    }//GEN-LAST:event_jbtnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnSaveContaminationComposition;
    private javax.swing.JTextField jtxtBalance;
    // End of variables declaration//GEN-END:variables
}
