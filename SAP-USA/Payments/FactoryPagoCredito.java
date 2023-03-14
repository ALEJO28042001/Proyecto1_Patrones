package Payments;

import java.util.*;

import Users.Persona;

/**
 * 
 */
public class FactoryPagoCredito extends FactoryPago {

    /**
     * Default constructor
     */
    public FactoryPagoCredito() {
    }

    public PagoCredito RealizarPago(Persona p) {
    	Scanner sc = new Scanner(System.in);
    	PagoCredito pago = new PagoCredito();
    	
    	String usuario = p.getNombre()+" "+p.getApelllido();
    	
    	
    	pago.setUsuario(usuario);
    	pago.setNumeroTelefono(p.getNumTelefono());
    	pago.setDireccion(p.getDireccion());
    	System.out.println("Numero de tarjeta: ");
    	pago.setNumTarjeta(sc.nextLong());
    	System.out.println("Fecha de vencimiento:");
    	pago.setFechaVencimiento(sc.next());
    	System.out.println("Numero de cuotas");
    	pago.setNumeroCuotas(sc.nextInt());
    	//inferir tipo de tarjeta:
    	//pago.setTipoTajeta(tipo);
    	
    	
        
        return pago;
    }
    
    
    
    
    

}