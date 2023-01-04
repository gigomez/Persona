/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introd_programacion;

/**
 *
 * @author gloir
 */
public class Persona {


    private int edad;
    private String nombre;
    private String telefono;    

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setEdad(35);
        persona.setNombre("Gloria");
        persona.setTelefono("3128855745");
        
       
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        
        

    }


    public void setEdad( int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return this.telefono;
    }

}
