/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vista;

/**
 *
 * @author root
 */
public class frmArticulo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPersonas
     */
    public frmArticulo() {
        initComponents();
        
        //tamaño (ancho, alto)
        this.setSize(600, 400);
        this.resizable = true;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigoArticulo = new javax.swing.JLabel();
        jTextFieldCodigoArticulo = new javax.swing.JTextField();
        jLabelArticuloDescripcion = new javax.swing.JLabel();
        jLabelArticuloPrecio = new javax.swing.JLabel();
        jTextArticuloPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabelAcrticuloFechaFab = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Artículos");
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCodigoArticulo.setText("Código");

        jLabelArticuloDescripcion.setText("Descripción");

        jLabelArticuloPrecio.setText("Precio");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jLabelAcrticuloFechaFab.setText("Fecha de Fabricación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAcrticuloFechaFab)
                    .addComponent(jLabelCodigoArticulo)
                    .addComponent(jLabelArticuloPrecio)
                    .addComponent(jLabelArticuloDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextArticuloPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(jTextFieldCodigoArticulo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelCodigoArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelArticuloPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArticuloPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelArticuloDescripcion)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAcrticuloFechaFab)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Artículo");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAcrticuloFechaFab;
    private javax.swing.JLabel jLabelArticuloDescripcion;
    private javax.swing.JLabel jLabelArticuloPrecio;
    private javax.swing.JLabel jLabelCodigoArticulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextArticuloPrecio;
    private javax.swing.JTextField jTextFieldCodigoArticulo;
    // End of variables declaration//GEN-END:variables
}