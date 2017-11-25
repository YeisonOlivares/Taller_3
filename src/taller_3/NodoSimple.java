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
public class NodoSimple {
    
    private Usuario usuario;
    private NodoSimple next;
    
    public NodoSimple(Usuario usuario){
        this.usuario = usuario;
        this.next = null;
    }
    
    public String getNombres(){
        return this.usuario.getNombres();
    }
    
    public String getApPaterno(){
        return this.usuario.getApPaterno();
    }
    
    public String getApMaterno(){
        return this.usuario.getApMaterno();
    }
    
    public String getCorreo(){
        return this.usuario.getCorreo();
    }
    
    public String getPassword(){
        return this.usuario.getPassword();
    }
    
    public String getFechaNacimiento(){
        return this.usuario.getFechaNacimiento();
    }
    
    public char getSexo(){
        return this.usuario.getSexo();
    }
    
    public ListaUsuario getListaAmigo(){
        return this.usuario.getListaAmigo();
    }
    
    public void setNombres(String nombres){
        this.usuario.setNombres(nombres);
    }
    
    public void setApPaterno(String apPaterno){
        this.usuario.setApPaterno(apPaterno);
    }
    
    public void setApMaterno(String apMaterno){
        this.usuario.setApMaterno(apMaterno);
    }
    
    public void setCorreo(String correo){
        this.usuario.setCorreo(correo);
    }
    
    public void setPassword(String password){
        this.usuario.setPassword(password);
    }
    
    public void setFechaNacimiento(String fechaNacimiento){
        this.usuario.setFechaNacimiento(fechaNacimiento);
    }
    
    public void setSexo(char sexo){
        this.usuario.setSexo(sexo);
    }
    
    
}
