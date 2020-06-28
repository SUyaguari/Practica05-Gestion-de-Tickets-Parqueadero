package ec.edu.ups.dao;

import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class ClienteDAO implements IClienteDAO{

    Map<String, Cliente> listaClientes;

    public ClienteDAO() {
    
        listaClientes = new HashMap<>(); 
    
    }
    
    
    @Override
    public void create(Cliente cliente) {
    
        listaClientes.put(cliente.getCedula(), cliente);
    
    }

    @Override
    public Cliente read(String cedula) {
    
        return listaClientes.get(cedula);
    
     }

    @Override
    public void update(Cliente cliente) {
        
        listaClientes.put(cliente.getCedula(), cliente);
        
    }

    @Override
    public void delite(Cliente cliente) {
        
        listaClientes.remove(cliente.getCedula());
        
    }

    @Override
    public Map<String, Cliente> findAll() {
        
        return listaClientes;
    
    }
    
}
