package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Estudiantes
 */
public class Ticket {
    
    private int numero;
    private Date ingreso;
    private Date salida;
    private int fracciones;
    private double total;

    public Ticket() {
        
    }

    public Ticket(int numero, Date ingreso) {
        this.numero = numero;
        this.ingreso = ingreso;
    }

    public Ticket(int numero, Date ingreso, Date salida, int fracciones, double total) {
        this.numero = numero;
        this.ingreso = ingreso;
        this.salida = salida;
        this.fracciones = fracciones;
        this.total = total;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int getFracciones() {
        return fracciones;
    }

    public void setFracciones(int fracciones) {
        this.fracciones = fracciones;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.numero;
        return hash;
    }

    public double calcularTotal(Date ingreso, Date salida){
       
        int añoIngreso = ingreso.getYear()*525600;
        int mesIngreso = ingreso.getMonth()*43800;
        int diaIngreso = ingreso.getDay()*1440;
        int horaIngreso = ingreso.getHours()*60;
        int minutoIngreso = ingreso.getMinutes();
        
        int añoSalida = salida.getYear()*525600;
        int mesSalida = salida.getMonth()*43800;
        int diaSalida = salida.getDay()*1440;
        int horaSalida = salida.getHours()*60;
        int minutoSalida = salida.getMinutes();
        
        int totalIngreso= añoIngreso+mesIngreso+diaIngreso+horaIngreso+minutoIngreso;
        int totalSalida= añoSalida+mesSalida+diaSalida+horaSalida+minutoSalida;
        
        int totalTotal = totalSalida-totalIngreso;
        
        int fracciones = (int) totalTotal/10;
        
        double total = 0.25 + (fracciones*0.25);
        
        return total;
    }
    
    public int calcularFracciones(double total){
        
        double frac =  (total-0.25)/0.25;
        int fracciones = (int) frac;
        
        return fracciones;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", ingreso=" + ingreso + ", salida=" + salida + ", total=" + total + '}';
    }
    
    
    
}
