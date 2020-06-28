package ec.edu.ups.vista;


import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiantes
 */
public class VentanaIngresoTicket extends javax.swing.JInternalFrame {
    
    ControladorTicket controladorTicket;
    ControladorVehiculo controladorVehiculo;
    ControladorCliente controladorCliente;
    VentanaRegistroVehiculo ventanaRegistroVehiculo;
    
    
    public VentanaIngresoTicket(ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo, ControladorCliente controladorCliente, VentanaRegistroVehiculo ventanaRegistroVehiculo) {
        initComponents();
        
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.controladorCliente = controladorCliente;
        this.ventanaRegistroVehiculo = ventanaRegistroVehiculo;
        formatearPlacaVehiculo();
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNumeroTicket = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblFechaIngreso = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        btnRegistrarTickets = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblEnunciadoTicket = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBusquedaFormatted = new javax.swing.JFormattedTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Registro de Ticktes");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setText("Ingrese los datos:");

        lblNumeroTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNumeroTicket.setText("Numero de ticket:");

        txtNumero.setEditable(false);

        lblFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechaIngreso.setText("Fecha de ingreso:");

        txtIngreso.setEditable(false);

        btnRegistrarTickets.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnRegistrarTickets.setText("Regisrar y Agregar");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnCancelar.setText("Cancelar");

        lblPlaca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPlaca.setText("Placa:");

        txtPlaca.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroTicket)
                            .addComponent(lblFechaIngreso)
                            .addComponent(lblPlaca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(txtIngreso))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnRegistrarTickets)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroTicket)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaIngreso)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarTickets)
                    .addComponent(btnCancelar))
                .addGap(44, 44, 44))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEnunciadoTicket.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        lblEnunciadoTicket.setText("Seleccione un vehiculo:");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cedula", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        btnMostrar.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btnMostrar.setText("Mostrar todos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        lblBuscar.setText("Buscar placa:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addComponent(lblEnunciadoTicket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBusquedaFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addGap(50, 50, 50))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnunciadoTicket)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(lblBuscar)
                    .addComponent(txtBusquedaFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarNumero();
        cargarFecha();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

    cargarDatosTabla();
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String placa = txtBusquedaFormatted.getText();
        Cliente c = controladorCliente.buscarVehiculos(placa);
        if(c!=null){
            cargarVehiculoTabla(c, placa);
        }else{
            int i = JOptionPane.showConfirmDialog(this, "Vehiculo no registrado, Desea agregar un nuevo", "Nuevo Vehiculo" ,JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.YES_OPTION){
                ventanaRegistroVehiculo.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    

    public void cargarNumero(){
        int codigo = controladorTicket.codigo();
        txtNumero.setText(codigo+"");
    }
    
    public void cargarFecha(){
        Date ahora = new Date();
        txtIngreso.setText(ahora+"");
    }
   
     
     public void formatearPlacaVehiculo() {
        try {
            txtBusquedaFormatted.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(
                            new javax.swing.text.MaskFormatter("***-####")
                    )
            );
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de la placa erroneo");
            ex.printStackTrace();
        }

    }
     
    public void cargarDatosTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);
        
        Map<String, Cliente> lista = controladorCliente.listarClientes();
        for (Map.Entry<String, Cliente> entry : lista.entrySet()) {
            String key = entry.getKey();
            Cliente cliente = lista.get(key);
            
            List<Vehiculo> listaVehiculos = cliente.getListaVehiculos();
            
            for (Vehiculo listaV : listaVehiculos) {
                Object[] objeto = {listaV.getPlaca(), listaV.getMarca(), listaV.getModelo(), cliente.getCedula(), cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()};
                modelo.addRow(objeto);
            }
            
        }
        
        tblVehiculos.setModel(modelo);
        
    }
    
    public void cargarVehiculoTabla(Cliente c, String placa){
        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);
        
        List<Vehiculo> listaVehiculos = c.getListaVehiculos();
        
        for (Vehiculo listaV : listaVehiculos) {
            if(listaV.getPlaca().equals(placa)){
                Object[] objeto = {listaV.getPlaca(), listaV.getMarca(), listaV.getModelo(), c.getCedula(), c.getNombre(), c.getDireccion(), c.getTelefono()};
                modelo.addRow(objeto);                
            }
        }
        tblVehiculos.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrarTickets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEnunciadoTicket;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblNumeroTicket;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JFormattedTextField txtBusquedaFormatted;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
