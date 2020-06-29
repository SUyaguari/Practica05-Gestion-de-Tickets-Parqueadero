package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Ticket;
import java.util.Date;
import javax.swing.JOptionPane;

public class VentanaSaliidaTicket extends javax.swing.JInternalFrame {

    ControladorTicket controladorTicket;
    ControladorVehiculo controladorVehiculo;
    ControladorCliente controladorCliente;
    Date ahora;
    
    public VentanaSaliidaTicket(ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo, ControladorCliente controladorCliente) {
        initComponents();
        
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.controladorCliente = controladorCliente;
        
        botones();
    }
    
    
    public void botones(){
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnRegresar.setEnabled(true);
        btnRetirar.setEnabled(false);
    }
    
    public void limpiar(){
        txtFechaIngreso.setText("");
        txtFechaSalida.setText("");
        txtFracciones.setText("");
        txtIngresarCodigo.setText("");
        txtTotalPagar.setText("");
    }
    
    public void calcularHora(){
        ahora = new Date();
        txtFechaSalida.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloRetiroTikets = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtIngresarCodigo = new javax.swing.JTextField();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFechaSalida = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JFormattedTextField();
        btnRetirar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        lblFracciones = new javax.swing.JLabel();
        txtFracciones = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setTitle("Retido de Tickets");

        lblTituloRetiroTikets.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lblTituloRetiroTikets.setText("Retiro de Tickets");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEncabezado.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblEncabezado.setText("Ingrese los datos:");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCodigo.setText("Codigo:");

        lblFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaIngreso.setText("Fecha ingreso:");

        txtFechaIngreso.setEditable(false);

        lblFechaSalida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaSalida.setText("Fecha Salida:");

        txtFechaSalida.setEditable(false);

        btnRetirar.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnCancelar.setText("Cancelar");

        lblTotalPagar.setText("Total a pagar:");

        txtTotalPagar.setEditable(false);

        btnRegresar.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnRegresar.setText("Regresar");

        lblFracciones.setText("fracciones:");

        txtFracciones.setEditable(false);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRetirar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(btnCancelar))
                                    .addComponent(txtIngresarCodigo, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaIngreso)
                                    .addComponent(lblFechaSalida))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaSalida)
                                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTotalPagar)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFracciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtIngresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRetirar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaIngreso)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaSalida))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPagar)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFracciones)
                    .addComponent(txtFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloRetiroTikets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloRetiroTikets)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String num = txtIngresarCodigo.getText();
        
        if(num.isEmpty()){
            JOptionPane.showConfirmDialog(this, "Ingrese el numero de ticket");
        }else{
            int numero = Integer.parseInt(num);
            Ticket ticket = controladorTicket.buscarTicket(numero);
            
            if(ticket!=null){
                
                txtFechaIngreso.setText(ticket.getIngreso()+"");
                calcularHora();
                double total = controladorTicket.calcularTotal(ticket.getIngreso(), ahora);
                txtTotalPagar.setText(total+"");
                int fraciones = controladorTicket.calcularFracciones(total);
                txtFracciones.setText(fraciones+"");
                
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblFracciones;
    private javax.swing.JLabel lblTituloRetiroTikets;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JFormattedTextField txtFechaSalida;
    private javax.swing.JTextField txtFracciones;
    private javax.swing.JTextField txtIngresarCodigo;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
