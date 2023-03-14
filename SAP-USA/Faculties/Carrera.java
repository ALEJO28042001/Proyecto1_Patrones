package Faculties;
import java.util.ArrayList;
import Attributes.Materia;

public class Carrera {


    public String nombre;
    public String id;
    public ArrayList<Materia> pensum;

    public Carrera(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.pensum = new ArrayList<Materia>();

    }
    
    public void addMateria()
    {
    	this.pensum.add(new Materia());
    }
    public void delMateria(int ID)
    {
    	this.pensum.remove(this.pensum.get(ID));
    }

}