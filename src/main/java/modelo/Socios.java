/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author carlo
 */
public class Socios
{
   private int idSocio;
   private String nombre;
   private String apellido;
   private String localidad; 
   private LocalDate fnac;
   private String email;
   private String telefono;
   private boolean activo;

   public Socios (int idSocio, String nombre, String apellido, String localidad,LocalDate fnac, String email, String telefono, boolean activo)

   {
       this.idSocio=idSocio;
       this.nombre=nombre;
       this.apellido=apellido;
       this.localidad=localidad;
       this.fnac=fnac;
       this.email=email;
       this.telefono=telefono;
       this.activo=activo;
       
   }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
   
   

}


