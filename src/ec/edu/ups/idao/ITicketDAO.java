package ec.edu.ups.idao;

import ec.edu.ups.modelo.Ticket;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public interface ITicketDAO {
    
    public void create(Ticket ticket);
    public Ticket read(int numero);
    public void update(Ticket ticket);
    public void delite(Ticket ticket);
    public Map<Integer, Ticket> findAll();
    public int codigo();
    
}
