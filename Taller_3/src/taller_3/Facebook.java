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
public interface Facebook{
    
   public boolean registrarse(Usuario usuario);
   
   public void iniciarSesion(String correo, String password);
   
   public boolean agregarAmigo(String correoAmigo);
   
   public boolean eliminarAmigo(String correoaAmigo);
   
   public void crearPagina(Pagina pagina);
   
   public void crearGrupo(Grupo grupo);
   
   public void agregarAmigoGrupo();
   
   public void unirsePagina();
   
   public void abandonarPagina();
   
   public void abandonarGrupo();
   
   public void visualizarPuntajes();
   
   public void cerrarSesion();
    
}

