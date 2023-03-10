package Users;
import Attributes.*;
import java.util.*;
import Accions.*;
import Faculties.Carrera;

/**
 * 
 */
public class Estudiante extends Persona {

    /**
     * Default constructor
     */
    public Estudiante() {
    }
    private float PromedioAcumulado;
    private float PromedioSemestre;
    private ArrayList<PrototypeMateria> materiasInscritas = new ArrayList();
    private ArrayList<PrototypeMateria> materiasVistas = new ArrayList();
    private Materia ArrayList;
    private Horario HashSet;
    private long Descuento;
    private List Bloqueos;
    private Carrera Carrera;
    private Set EstadoDeCuenta;
    private int creditosInscritos=0;
    private int creditosVistos=0;
    
    public boolean TieneICETEX() 
    {
    	return false;
    }

    private void SolicitudGrado() {
    }
    private void PromediarSemestre() {
    	this.CalcularCreditosIsncritos();
    	for (int i=0;i<this.materiasInscritas.size();i++)
    	{
    		this.PromedioSemestre+=this.materiasInscritas.get(i).Creditos*this.materiasInscritas.get(i).Nota[3]/this.creditosInscritos;
    	}
    }
    private void PromediarAcumulado() {
    	
    }
    
    private void CalcularCreditosIsncritos()
    {
    	for (int i=0;i<this.materiasInscritas.size();i++)
    	{
    		this.creditosInscritos+=this.materiasInscritas.get(i).Creditos;
    	}
    }

}