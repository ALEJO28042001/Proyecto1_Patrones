package Users;
import Attributes.*;
import java.util.*;

import Actions.*;


public class Persona implements Consultar {

    /**
     * Default constructor
     */
    public Persona() {
    }
    private long ID;
    private String Nombre;
    private String Apelllido;
    private String Correo;
    private String Contraseña;
    private Horario Horario;
    private int Facultad;
    private double numTelefono;
    private String direccion;
    
    public Certificado SolicitarCertificado() {
        
        return null;
    }

    public void RealizarPagos() {
     
    }

    public void Consultar() {
    }

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApelllido() {
		return Apelllido;
	}

	public void setApelllido(String apelllido) {
		Apelllido = apelllido;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public Horario getHorario() {
		return Horario;
	}

	public void setHorario(Horario horario) {
		Horario = horario;
	}

	public int getFacultad() {
		return Facultad;
	}

	public void setFacultad(int facultad) {
		Facultad = facultad;
	}

	public double getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(double numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
	

}