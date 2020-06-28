package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.modelo.Ticket;
import java.util.Date;

/**
 *
 * @author Estudiantes
 */
public class ControladorTicket {
    
    private ITicketDAO ticketDAO;

    private Ticket ticket;

    public ControladorTicket(ITicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }
    
   public Ticket crearTicket(int numero, Date ingreso){
       
       ticket = new Ticket(numero, ingreso);
       ticketDAO.create(ticket);
       return ticket;
   }
   
   public Ticket buscarTicket(int numero){
       
       ticket = ticketDAO.read(numero);
       
       if(ticket!= null){
           return ticket;
       }else{
           return null;
       }
   }
   
   public void actualizarTicket(int numero, Date ingreso, Date salida, int fracciones, double total){
       
       ticket= new Ticket(numero, ingreso, salida, fracciones, total);
       
       ticketDAO.update(ticket);
       
   }
   
   public void eliminarTicket(Ticket ticket){
       
       ticketDAO.delite(ticket);
       
   }
   
   public double calcularTotal(Date ingreso, Date salida){
       
       double total = ticket.calcularTotal(ingreso, salida);
       return total;
       
   }
   
   public int calcularFracciones(double total){
       
       int fracciones = ticket.calcularFracciones(total);
       return fracciones;
       
   }
   
   public int codigo(){
       
       int codigo = ticketDAO.codigo();
       return (++codigo) ;
   
   }
    
}
