package Payments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Users.Persona;

public class FactoryPagoPSE extends FactoryPago {
    public FactoryPagoPSE() {
    }

    public PagoDebito RealizarPago(Persona p) {
        Scanner sc = new Scanner(System.in);
    	
    	PagoDebito pago = new PagoDebito();
    	String usuario = p.getNombre()+" "+p.getApelllido();
    	
    	ArrayList<String> bancos = new ArrayList<String>();
    	
    	//Lista de bancos aceptados
    	Collections.addAll(bancos, "Scotiabank", "Davivienda","BBVA", "Bancolombia");
    	
    	pago.setUsuario(usuario);
    	pago.setNumeroTelefono(p.getNumTelefono());
    	pago.setDireccion(p.getDireccion());
    	System.out.println("Ingrese su banco");
    	System.out.println(bancos.toString());
    	String opcion = sc.next();
    	
    	Boolean valida = true;
    	
    	while(valida) {
    		if (bancos.contains(opcion)) {
    			pago.setBanco(opcion);
    			valida = false;
    		} else {
    			System.out.println("Ingrese un banco valido");
    			System.out.println(bancos.toString());
    		}
    	}
    	
    	
    	
        return pago;
    }

}