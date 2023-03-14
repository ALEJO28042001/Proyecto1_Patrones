package Payments;

import java.util.*;

/**
 * 
 */
public class Pago {


    public Pago() {
    }

    public String usuario;  //toString(Users.Persona.Nombre+Persona.Apellido);
    public double NumeroTelefono;
    public String Direccion;
    
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getNumeroTelefono() {
		return NumeroTelefono;
	}
	public void setNumeroTelefono(double numeroTelefono) {
		NumeroTelefono = numeroTelefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
    
    

   

}