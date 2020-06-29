package ec.edu.ups.idao;

import ec.edu.ups.modelo.Vehiculo;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public interface IVehiculoDAO {
    
    public void create(Vehiculo vehiculo);
    public Vehiculo read(String placa);
    public void update(Vehiculo vehiculo);
    public void delite(Vehiculo vehiculo);
    public Vehiculo buscarTicket(int numero);
    public Map<String, Vehiculo> findAll();
    
}
