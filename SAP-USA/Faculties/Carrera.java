package Faculties;
import java.util.ArrayList;
import Attributes.Materia;

public class Carrera {

    public Carrera() {
    }
    public String Nombre;
    public String ID;
    public ArrayList<Materia> Pensum;
    
    public void addMateria()
    {
    	this.Pensum.add(new Materia());
    }
    public void delMateria(int ID)
    {
    	this.Pensum.remove(this.Pensum.get(ID));
    }

}