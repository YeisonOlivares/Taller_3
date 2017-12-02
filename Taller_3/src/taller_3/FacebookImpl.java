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
public class FacebookImpl implements Facebook {
    
    private ListaUsuario listaUsuarios;
    private ListaPaginaGrupo listaPaginas;
    private ListaPaginaGrupo listaGrupo;
    
    public FacebookImpl(){
        this.listaUsuarios = null;
        this.listaPaginas = null;
        this.listaGrupo = null;
    }
    
    public ListaUsuario getListaUsuario(){
        return this.listaUsuarios;
    }
    
    public ListaPaginaGrupo getListaPagina(){
        return this.listaPaginas;
    }
    
    public ListaPaginaGrupo getListaGrupo(){
        return this.listaGrupo;
    }

    @Override
    public boolean registrarse(Usuario usuario){
        NodoSimple aux=this.listaUsuarios.getHead();
        for(int i = 0; i<this.listaUsuarios.getCantUsuario();i++){
           if(aux.getUsuario().getCorreo().equalsIgnoreCase(usuario.getCorreo())){
               return false;
           }else{
               aux = aux.getNext();
           }
        }
        this.listaUsuarios.agregarUsuario(usuario);
        return true;
    }

    @Override
    public void iniciarSesion(String correo, String password) {
        NodoSimple aux = this.listaUsuarios.getHead();
        for(int i =0; i<this.listaUsuarios.getCantUsuario();i++){
            if(aux.getUsuario().getCorreo().equalsIgnoreCase(correo) && aux.getUsuario().getPassword().equals(password)){
                
            }
        }
        
    }

    @Override
    public boolean agregarAmigo(String correoAmigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarAmigo(String correoaAmigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearPagina(Pagina pagina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearGrupo(Grupo grupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarAmigoGrupo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unirsePagina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abandonarPagina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abandonarGrupo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visualizarPuntajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cerrarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
