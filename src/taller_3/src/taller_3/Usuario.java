/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3;

/**
 *
 * @author Yeison Olivares - Rodrigo Dominguez
 */
public class Usuario {
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private String correo;
    private String password;
    private String fechaNacimiento;
    private char sexo;
    private ListaUsuario listaAmigos;
    
public Usuario(String nombres, String apPaterno,String apMaterno,String correo,String password,String fechaNacimiento,char sexo){
    this.nombres= nombres;
    this.apPaterno= apPaterno;
    this.apMaterno=apMaterno;
    this.correo=correo;
    this.password= password;
    this.fechaNacimiento=fechaNacimiento;
    this.sexo=sexo;
}

public double calcularPuntaje(){
//Incluir códigoPuntaje Usuario = Suma de Factor páginas * 0,7 + Suma de Factor grupo * 0,3
double factorPagina = 0;
double factorGrupo = 0;
}

public String getNombres (){
    return this.nombres;
}

public String getApPaterno (){
    return this.apPaterno;
}

public String getApMaterno (){
    return this.apMaterno;
}

public String getCorreo (){
    return this.correo;
}

public String getPassword(){
    return this.password;
}

public String getFechaNacimiento(){
    return this.fechaNacimiento;
}

public char getSexo(){
    return this.sexo;
}

public ListaUsuario getListaAmigo(){
        return this.listaAmigos;
    }

public void setNombres(String nombres){
    this.nombres = nombres;
}

public void setApPaterno(String apPaterno){
    this.apPaterno = apPaterno;
}

public void setApMaterno(String apMaterno){
    this.apMaterno = apMaterno;
}

public void setCorreo(String correo){
    this.correo = correo;
}

public void setPassword(String password){
    this.password = password;
}

public void setFechaNacimiento(String fechaNacimiento){
    this.fechaNacimiento = fechaNacimiento;
}

public void setSexo(char sexo){
    this.sexo = sexo;
}

}
