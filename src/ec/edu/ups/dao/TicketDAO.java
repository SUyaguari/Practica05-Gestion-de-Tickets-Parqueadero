package ec.edu.ups.dao;

import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.modelo.Ticket;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class TicketDAO implements ITicketDAO{
    
    private Map<Integer, Ticket> listaTickets;
    private int codigo;

    public TicketDAO() {
    
        listaTickets = new HashMap<>();
        codigo=0;
        
    }    
    

    @Override
    public void create(Ticket ticket) {
        
        listaTickets.put(ticket.getNumero(), ticket);
        ticket.setNumero(++codigo);
    }

    @Override
    public Ticket read(int numero) {
        
        return listaTickets.get(numero);
        
    }

    @Override
    public void update(Ticket ticket) {
        
        listaTickets.put(ticket.getNumero(), ticket);
        
    }

    @Override
    public void delite(Ticket ticket) {
        
        listaTickets.remove(ticket.getNumero());
        
    }

    @Override
    public Map<Integer, Ticket> findAll() {
        
        return listaTickets;
                
    }

    @Override
    public int codigo() {
        return codigo;
    }
    
}
