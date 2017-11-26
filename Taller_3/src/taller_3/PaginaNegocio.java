/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3;

/**
 *
 * @author Therockwsnake
 */
public class PaginaNegocio extends Pagina{
    
    private String direccion;
    private String ciudad;
    private int codigoPostal;
    private int telefono;
    
    public PaginaNegocio(String nombre, Usuario administrador, String clasificacion, String categoria, String direccion, String ciudad, int codigoPostal, int telefono){
        super(nombre,administrador,clasificacion,categoria);
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }
    
    public int getCodigoPostal(){
        return this.codigoPostal;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
}
