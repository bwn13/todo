package com.example.mati.listapersona;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona (String nombre, String apellido, int edad) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre () {
        return nombre;
    }
    public  String getApellido (){
        return apellido;
    }
    public int getEdad (){
        return edad;
    }

    public void setNombre (String nuevoNom){
        nombre=nuevoNom;
    }
    public void setApellido (String nuevoApe){
        apellido=nuevoApe;
    }

    public void setEdad (int num){
        edad=num;
    }

    public String toString () {
        String cad=" ";
        cad+="Nombre:"+nombre+ "Apellido:"+apellido+" con edad:"+edad;
        return cad;
    }




}


