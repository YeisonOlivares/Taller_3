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
public class Pagina extends PaginaGrupo{
    private String clasificacion;
    private String categoria;
    
    public Pagina(String nombre, Usuario administrador,String clasificacion,String categoria){
        super(nombre,administrador);
        this.categoria = categoria;
        this.clasificacion = clasificacion;
    }
    
    @Override
    public double calcularFactor(){
        double aux=0;
        
        return aux;
    }
    
    public String getClasificacion(){
        return this.clasificacion;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
}
