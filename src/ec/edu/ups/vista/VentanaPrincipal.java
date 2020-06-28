package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;

/**
 *
 * @author Estudiantes
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ClienteDAO clienteDAO;
    private VehiculoDAO vehiculoDAO;
    private TicketDAO ticketDAO;
    
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;
    
    private VentanaRegistroCliente venRegistroCliente;
    private ventanaRegistroVehiculo ventRegistroVehiculo;
            
    public VentanaPrincipal() {
        initComponents();
        
        clienteDAO = new ClienteDAO();
        vehiculoDAO = new VehiculoDAO();
        ticketDAO = new TicketDAO();
        
        controladorCliente = new ControladorCliente(clienteDAO, vehiculoDAO);
        controladorVehiculo = new ControladorVehiculo(vehiculoDAO, ticketDAO);
        controladorTicket = new ControladorTicket(ticketDAO);
        
        venRegistroCliente = new VentanaRegistroCliente(controladorCliente);
        ventRegistroVehiculo = new ventanaRegistroVehiculo(controladorVehiculo, controladorCliente);
        
        desktopPane.add(venRegistroCliente);
        desktopPane.add(ventRegistroVehiculo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        registrarMenu = new javax.swing.JMenu();
        registrarClienteMenuItem = new javax.swing.JMenuItem();
        registrarVehiculoMenuItem = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        ticketMenu = new javax.swing.JMenu();
        ingresarTicketMenuItem = new javax.swing.JMenuItem();
        retirarTicketMenuItem = new javax.swing.JMenuItem();
        listarMenu = new javax.swing.JMenu();
        listarClientesMenuItem = new javax.swing.JMenuItem();
        listarVehiculosMenuItem = new javax.swing.JMenuItem();
        listarTicketsMenuItem = new javax.swing.JMenuItem();
        idiomaMenu = new javax.swing.JMenu();
        españolMenuItem = new javax.swing.JMenuItem();
        inglesMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de tickets");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        registrarMenu.setMnemonic('f');
        registrarMenu.setText("Registro");

        registrarClienteMenuItem.setMnemonic('o');
        registrarClienteMenuItem.setText(" Registrar Cliente");
        registrarClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteMenuItemActionPerformed(evt);
            }
        });
        registrarMenu.add(registrarClienteMenuItem);

        registrarVehiculoMenuItem.setMnemonic('s');
        registrarVehiculoMenuItem.setText("Registrar Vehiculo");
        registrarVehiculoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVehiculoMenuItemActionPerformed(evt);
            }
        });
        registrarMenu.add(registrarVehiculoMenuItem);

        salirMenuItem.setMnemonic('x');
        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        registrarMenu.add(salirMenuItem);

        menuBar.add(registrarMenu);

        ticketMenu.setMnemonic('e');
        ticketMenu.setText("Tickets");

        ingresarTicketMenuItem.setMnemonic('t');
        ingresarTicketMenuItem.setText("Ingresar Tickets");
        ticketMenu.add(ingresarTicketMenuItem);

        retirarTicketMenuItem.setMnemonic('y');
        retirarTicketMenuItem.setText("Retirar Tickets");
        ticketMenu.add(retirarTicketMenuItem);

        menuBar.add(ticketMenu);

        listarMenu.setMnemonic('h');
        listarMenu.setText("Listar");

        listarClientesMenuItem.setMnemonic('a');
        listarClientesMenuItem.setText("Listar Clientes");
        listarMenu.add(listarClientesMenuItem);

        listarVehiculosMenuItem.setMnemonic('c');
        listarVehiculosMenuItem.setText("Listar Vehiculos");
        listarMenu.add(listarVehiculosMenuItem);

        listarTicketsMenuItem.setText("Listar Tickets");
        listarMenu.add(listarTicketsMenuItem);

        menuBar.add(listarMenu);

        idiomaMenu.setText("Idioma");

        españolMenuItem.setText("Español");
        idiomaMenu.add(españolMenuItem);

        inglesMenuItem.setText("Ingles");
        idiomaMenu.add(inglesMenuItem);

        menuBar.add(idiomaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void registrarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteMenuItemActionPerformed
        
        cerrarVentanas();
        venRegistroCliente.setVisible(true);
        
    }//GEN-LAST:event_registrarClienteMenuItemActionPerformed

    private void registrarVehiculoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVehiculoMenuItemActionPerformed
        cerrarVentanas();
        ventRegistroVehiculo.setVisible(true);
    }//GEN-LAST:event_registrarVehiculoMenuItemActionPerformed

    public void cerrarVentanas(){
        venRegistroCliente.setVisible(false);
        ventRegistroVehiculo.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem españolMenuItem;
    private javax.swing.JMenu idiomaMenu;
    private javax.swing.JMenuItem inglesMenuItem;
    private javax.swing.JMenuItem ingresarTicketMenuItem;
    private javax.swing.JMenuItem listarClientesMenuItem;
    private javax.swing.JMenu listarMenu;
    private javax.swing.JMenuItem listarTicketsMenuItem;
    private javax.swing.JMenuItem listarVehiculosMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registrarClienteMenuItem;
    private javax.swing.JMenu registrarMenu;
    private javax.swing.JMenuItem registrarVehiculoMenuItem;
    private javax.swing.JMenuItem retirarTicketMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JMenu ticketMenu;
    // End of variables declaration//GEN-END:variables

}