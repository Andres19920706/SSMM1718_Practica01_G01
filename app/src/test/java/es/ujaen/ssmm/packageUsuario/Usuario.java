package es.ujaen.ssmm.packageUsuario;

/**
 * Created by Andres on 26/09/2017.
 */

public class Usuario {
    //Atributos
    private String name;
    private String pwd;
    private String dir;
    private int port;
    //Constructores
    public Usuario(){
        this.name = "";
        this.pwd = "";
        this.dir = "";
        this.port = 0;
    }
    public Usuario (String name, String pwd, String dir, int port){
        this.name = name;
        this.pwd = pwd;
        this.dir = dir;
        this.port = port;
    }

    //Métodos de acceso getters and setters
    //Getters
    public String getName(){
        return this.name;
    }
    public String getPwd(){
        return this.pwd;
    }
    public String getDir(){
        return this.dir;
    }
    public int getPort(){
        return this.port;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public void setDir(String dir){
        this.dir = dir;
    }
    public void setPort(int port){
        this.port = port;
    }

    @Override
    public String toString(){
        return "Usuario{"+" name="+this.name+", pwd="+this.pwd+", dir="+this.dir+", port="+this.port+"}";
    }
}
