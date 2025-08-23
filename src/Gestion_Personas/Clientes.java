/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Personas;

import java.time.LocalDate;

/**
 *
 * @author Jeshuan
 */
public class Clientes extends Personas {
    private String licenciaConducir;
private LocalDate fechaExpedicion;

    public Clientes(String nombre, int cedula, LocalDate fechaNacimiento, String telefono, String correo, String licenciaConducir, LocalDate fechaExpedicion) {
        super(nombre, cedula, fechaNacimiento, telefono, correo);
        this.licenciaConducir = licenciaConducir;
        this.fechaExpedicion = fechaExpedicion;
        }
    

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }
    
    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }
    private boolean licenciaVigente(){
        LocalDate hoy = LocalDate.now();
        return fechaExpedicion.plusYears(6).isAfter(hoy);
       
    }
    public boolean tieneLicencia(){
        if(licenciaConducir==null){
            return false;
        }
        if(!licenciaConducir.equals(cedula)){
            return false;
        }
        if(!licenciaVigente()){
            return false;
        }
        return true;
    } 
}
