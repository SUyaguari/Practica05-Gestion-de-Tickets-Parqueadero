package ec.edu.ups.controlador;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class ControladorVehiculo {
    
    private IVehiculoDAO vehiculoDAO;
    private ITicketDAO ticketDAO; 
    
    private Vehiculo vehiculo;

    public ControladorVehiculo() {
    }

    public ControladorVehiculo(IVehiculoDAO vehiculoDAO, TicketDAO ticketDAO) {
        this.vehiculoDAO = vehiculoDAO;
        this.ticketDAO = ticketDAO;
    }
    
    
    public Vehiculo crearVehiculo(String placa, String marca, String modelo){
        
        vehiculo = new Vehiculo(placa, marca, modelo);
        vehiculoDAO.create(vehiculo);
        return vehiculo;
    }
    
    
    public Vehiculo buscarVehiculo(String placa){
        
        vehiculo = vehiculoDAO.read(placa);
        
        if(vehiculo != null){
            return vehiculo;
        }else{
            return null;
        }
        
    }
    
    
    public void actualizarVehiculo(String placa, String marca, String modelo){
        
        vehiculo = new Vehiculo(placa, marca, modelo);
        vehiculoDAO.update(vehiculo);
        
    }
    
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        
        vehiculoDAO.delite(vehiculo);
        
    }
    
    public Map<String, Vehiculo> listarVehiculos(){
        
        Map<String, Vehiculo> lista;
        lista = vehiculoDAO.findAll();
        return lista;
                
    }
    
    public void agregarTicket(Ticket ticket, String placa){
        
        vehiculo = vehiculoDAO.read(placa);
        if(vehiculo!=null){
            
            vehiculo.agregarTIcket(ticket);
            vehiculoDAO.update(vehiculo);
            
        }
    }
    
    
    public void actualizarTicket(Ticket ticket, Vehiculo vehiculo){
        
        ticketDAO.update(ticket);
        vehiculo.actualizarTicket(ticket);
        vehiculoDAO.update(vehiculo);
        
    }
    
    public void eliminarTicket(Ticket ticket, Vehiculo vehiculo){
        
        ticketDAO.delite(ticket);
        vehiculo.eliminarTicket(ticket);
        vehiculoDAO.update(vehiculo);
        
    }
    
     public Vehiculo buscarTicket(int numero){
        
        Vehiculo vehiculo = vehiculoDAO.buscarTicket(numero);
        if(vehiculo!=null){
            return vehiculo;
        }else{
            return null;
        }
        
    }
}
