package Faculties;

import java.util.*;

public class Facultad {

	public String Nombre;
    public int ID;
    public ArrayList<Carrera> Carreras;
    public Facultad() {
    }
    

    public void addCarrera()
    {
    	this.Carreras.add(new Carrera());
    }
    public void delCarrera(int ID)
    {
    	this.Carreras.remove(this.Carreras.get(ID));
    }
    
}