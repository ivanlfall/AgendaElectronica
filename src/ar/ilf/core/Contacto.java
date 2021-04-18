package ar.ilf.core;

import java.util.Date;


public class Contacto {
    
    public static final int CONTACTOSMAXIMO = 10;
    
    private String nombre[];
    private String apellido[];
    private String direccion[];
    private String telefono[];
    private int dni[];
    private Date fechaNacimiento[];
    
    public Contacto(){
        nombre = new String[CONTACTOSMAXIMO];
        apellido = new String[CONTACTOSMAXIMO];
        direccion = new String[CONTACTOSMAXIMO];
        telefono = new String[CONTACTOSMAXIMO];
        dni = new int[CONTACTOSMAXIMO];
        fechaNacimiento = new Date[CONTACTOSMAXIMO];
    }
    
    public void nuevoContacto(
            int posicion,
            String nombre,
            String apellido,
            String direccion,
            String telefono,
            int dni,
            Date fecha
    ){
        
        this.nombre[posicion] = nombre;
        this.apellido[posicion] = apellido;
        this.direccion[posicion] = direccion;
        this.telefono[posicion] = telefono;
		this.dni[posicion] = dni;
        this.fechaNacimiento[posicion] = fecha;
    }

    public String[] getNombre() {
        return nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public String[] getTelefono() {
        return telefono;
    }

    public int[] getDni() {
        return dni;
    }

    public Date[] getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
    
}
