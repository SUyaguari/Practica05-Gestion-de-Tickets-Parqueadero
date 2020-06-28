package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class ControladorCliente {
    
    private IClienteDAO clienteDao;
    private IVehiculoDAO vehiculoDao;
    
    private Cliente cliente;

    public ControladorCliente() {
    
    }

    public ControladorCliente(ClienteDAO clienteDao, VehiculoDAO vehiculoDao) {
        
        this.clienteDao = clienteDao;
        this.vehiculoDao = vehiculoDao;
    
    }
    
    public void crearCliente(String cedula, String nombre, String direccion, String telefono){
        
        cliente = new Cliente(cedula, nombre, direccion, telefono);
        
        clienteDao.create(cliente);
    }
    
    public Cliente buscarCliente(String cedula){
        
        cliente = clienteDao.read(cedula);
        if(cliente!=null){
            
            return cliente;
    
        }else{
            return null;
        }
        
    }
    
    public void actualizarCliente(String cedula, String nombre, String direccion, String telefono){
        
       
        cliente = new Cliente(cedula, nombre, direccion, telefono);
        clienteDao.update(cliente);
        
    }
    
    public void eliminarCliente(Cliente cliente){

        clienteDao.delite(cliente);

    }
    
    public Map<String, Cliente> listarClientes(){
        
        Map<String, Cliente> listar;
        listar = clienteDao.findAll();
        return listar;
        
    }
    
        public void agregrarVehiculo(Vehiculo vehiculo, String cedula){
        
        cliente = clienteDao.read(cedula);
        if(cliente!=null){
            
            cliente.agregarVehiculo(vehiculo);
            clienteDao.update(cliente);
            
        }
    
    }
    
    public void actualizarVehiculo(Vehiculo vehiculo, Cliente cliente){
        
        vehiculoDao.update(vehiculo);
        cliente.actualizarVehiculo(vehiculo);
        clienteDao.update(cliente);
        
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo, Cliente cliente){
        
        vehiculoDao.delite(vehiculo);
        cliente.eliminarVehiculo(vehiculo);
        clienteDao.update(cliente);
    
    }
    
}
