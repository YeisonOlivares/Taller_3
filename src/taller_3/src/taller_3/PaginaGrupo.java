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
public abstract class PaginaGrupo {
    
    private String nombre;
    private Usuario administrador;
    private int identificador;
    private String fechaCreacion;
    private ListaUsuario listaMiembros;
    
    public PaginaGrupo(String nombre, Usuario administrador){
        this.nombre = nombre;
        this.administrador = administrador;
        
    }
    
    abstract double calcularFactor();
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Usuario getAdministrador(){
        return this.administrador;
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public String getFechaCreacion(){
        return this.fechaCreacion;
    }
    
    public ListaUsuario getListaMiembros(){
        return this.listaMiembros;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setAdministrador(Usuario usuario){
        this.administrador = usuario;
    }
    
    public void setIdentificador(int id){
        this.identificador = id;
    }
    
    
}
