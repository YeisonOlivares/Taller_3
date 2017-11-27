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
public class Grupo extends PaginaGrupo{
    
    private ListaUsuario listaAdministradores;
    
    public Grupo(String nombre, Usuario creador){
        super(nombre,creador);
        this.listaAdministradores = null;
    }
    
    public void cambiarAdministrador(Usuario administrador){
        this.administrador = administrador;
    }
    
    @Override
    public double calcularFactor(){
        
    }
    
}
