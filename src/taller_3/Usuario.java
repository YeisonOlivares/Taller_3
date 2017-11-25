/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3;

/**
 *
 * @author Wolf Paradise
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
//Incluir código
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

}
