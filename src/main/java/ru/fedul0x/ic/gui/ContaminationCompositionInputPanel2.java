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
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;
import javax.swing.text.NumberFormatter;
import ru.fedul0x.ic.dataaccess.DataSourceHibernate;
import ru.fedul0x.ic.dataaccess.dataobject.ContaminationComposition;
import ru.fedul0x.ic.gui.component.model.AutoCompletion;
import ru.fedul0x.ic.gui.component.model.HibernatedComboBoxModel;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class ContaminationCompositionInputPanel2 extends javax.swing.JPanel implements PropertyChangeListener {

    private ContaminationComposition contaminationComposition;
    private List<ContaminationComposition> allContaminations;
    private int balance;

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form CompanyInputPanel
     */
    public void updateComboBox() {
        DataSourceHibernate<ContaminationComposition> dsh = new DataSourceHibernate<>(ContaminationComposition.class);
        allContaminations = dsh.findAll();
        TableColumn nameColumn = jTable1.getColumnModel().getColumn(0);
        JComboBox cb = new JComboBox();
        cb.setModel(new HibernatedComboBoxModel());
        cb.setEditable(true);
        AutoCompletion.enable(cb);
        DefaultCellEditor dce = new DefaultCellEditor(cb);
        dce.setClickCountToStart(2);
        nameColumn.setCellEditor(dce);

        TableColumn portionColumn = jTable1.getColumnModel().getColumn(1);
//        DecimalFormat df = new DecimalFormat("###");
//        NumberFormatter nf = NumberFormatter(df);
//        nf.setMinimum(0);
//        nf.setMaximum(100);
//        nf.setValueClass(Integer.class);
//        DefaultCellEditor dce2 = new DefaultCellEditor(new JFormattedTextField(nf));
//        portionColumnColumn.setCellEditor(dce2);
//        NumberFormat nf = NumberFormat.getInstance();
//        nf.setMinimumFractionDigits(1);
//        nf.setMaximumFractionDigits(4);
//        JFormattedTextField ftf = new JFormattedTextField(nf);///{
////            public void processKeyEvent(KeyEvent ev) {
////                char c = ev.getKeyChar();
////                if (c >= 48 && c <= 57) { // c = '0' ... c = '9'
////                    super.processKeyEvent(ev);
////                }
////            }
////        };
//        ftf.setFocusLostBehavior(JFormattedTextField.COMMIT);
//        ftf.setValue(new Double(12.34));
////        ftf.addPropertyChangeListener("value", this);
//        DefaultCellEditor dce2 = new DefaultCellEditor(ftf);
//        portionColumn.setCellEditor(dce);
        NumberFormat nf = NumberFormat.getNumberInstance();
//        nf.setMaximumFractionDigits(2);
//        nf.setMinimumFractionDigits(1);
        nf.setMinimumIntegerDigits(1);
        nf.setMaximumIntegerDigits(3);
        portionColumn.setCellEditor(new CurrencyCellEditor(new JFormattedTextField(), nf));

    }

    public ContaminationCompositionInputPanel2() {
        initComponents();
        contaminationComposition = null;
        balance = 100;
        updateComboBox();
    }

    public ContaminationCompositionInputPanel2(ContaminationComposition contaminationComposition) {
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
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable1.setMinimumSize(new java.awt.Dimension(30, 100));
        jTable1.setName(""); // NOI18N
        jTable1.setPreferredSize(new java.awt.Dimension(150, 100));
        jTable1.setRowHeight(24);
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

class CurrencyCellEditor extends DefaultCellEditor {

    private NumberFormat numberFormat;

    public CurrencyCellEditor(final JFormattedTextField tf, NumberFormat nf) {
        super(tf);
        numberFormat = nf;
        tf.setFocusLostBehavior(JFormattedTextField.COMMIT);
        tf.setHorizontalAlignment(SwingConstants.RIGHT);
        tf.setBorder(null);

        delegate = new EditorDelegate() {

            @Override
            public void setValue(Object param) {
                Double _value = (Double) param;
                if (_value == null) {
                    tf.setValue(numberFormat.format(0.0));
                } else {
                    double _d = _value.doubleValue();
                    String _format = numberFormat.format(_d);
                    tf.setValue(_format);
                }
            }

            public Object getCellEditorValue() {
                try {
                    String _field = tf.getText();
                    Number _number = numberFormat.parse(_field);
                    double _parsed = _number.doubleValue();
                    Double d = new Double(_parsed);
                    return d;
                } catch (ParseException e) {
                    e.printStackTrace();
                    return new Double(0.0);
                }
            }
        };
    }
}
