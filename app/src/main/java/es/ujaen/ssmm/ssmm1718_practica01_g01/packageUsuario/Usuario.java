package es.ujaen.ssmm.ssmm1718_practica01_g01.packageUsuario;

/**
 * Created by Andres on 26/09/2017.
 */

public class Usuario {
    //Atributos

    protected String name="";
    protected String surname="";

    protected String user="";
    protected String pwd="";
    protected int port;
    //Constructores
    public Usuario(){
        //Constructor obligatorio, al utilizar herencia
    }
    //Construcutro que inicializa el usuario y la clave
    public Usuario (String user, String pwd){
        this.name = name;
        this.pwd = pwd;
    }

    //Métodos de acceso getters and setters
    //Getters
    public String getUser(){
        return this.user;
    }
    public String getPwd(){
        return this.pwd;
    }

    //Setters
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public void setDir(String user){ this.user = user;   }


}
