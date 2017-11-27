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
}
