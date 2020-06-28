/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class VehiculoDAO implements IVehiculoDAO{

    Map<String, Vehiculo> listaVehiculos;

    public VehiculoDAO() {
        
        listaVehiculos = new HashMap<>();
        
    }
    
    
    @Override
    public void create(Vehiculo vehiculo) {
        
        listaVehiculos.put(vehiculo.getPlaca(), vehiculo);
    }

    @Override
    public Vehiculo read(String placa) {
        
         return listaVehiculos.get(placa);
         
    }

    @Override
    public void update(Vehiculo vehiculo) {
        
        listaVehiculos.put(vehiculo.getPlaca(), vehiculo);
        
    }

    @Override
    public void delite(Vehiculo vehiculo) {
        
        listaVehiculos.remove(vehiculo.getPlaca());
    }

    @Override
    public Map<String, Vehiculo> findAll() {
        
        return listaVehiculos;
    
    }
    
}
