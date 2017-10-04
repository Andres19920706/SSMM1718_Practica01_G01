package es.ujaen.ssmm.ssmm1718_practica01_g01.packageUsuario;


/**
 * Created by Andres on 04/10/2017.
 */

public class ConnectionUserData extends Usuario {
    protected String connectionIP="127.0.0.1";
    protected short connectionPort=6000;

    public ConnectionUserData (String user,String pwd,String ip,short port){
        super(user,pwd);
        this.connectionIP = ip;
        this.connectionPort = port;
    }

    public String getConnectionIP() {
        return connectionIP;
    }

    public void setConnectionIP(String connectionIP) {
        this.connectionIP = connectionIP;
    }

    public short getConnectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(short connectionPort) {
        this.connectionPort = connectionPort;
    }
}
