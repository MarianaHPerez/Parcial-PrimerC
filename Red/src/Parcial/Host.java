
package Parcial;


public class Host {
   
    
    private String NombreHost;
    private String SistemaOp;
    private int A;
    private int B;
    private int C;
    private int D;
    InterfazRed ip;
    
    
    public Host ( String NombreHost ,String SistemaOp ){
    
    this.NombreHost = NombreHost;
    this.SistemaOp = SistemaOp;
    
    }
    public Host (   int A ,int B,int C, int D  ){
    
    this.A = A;
    this.B = B;
    this.C = C;
    this.D = D;
    
    
    
    }
    public String getNombreHost() {
        return NombreHost;
    }

    public String getSistemaOp() {
        return SistemaOp;
    }

    public void setNombreHost(String NombreHost) {
        this.NombreHost = NombreHost;
    }

    public void setSistemaOp(String SistemaOp) {
        this.SistemaOp = SistemaOp;
    }
    
    public boolean sLimitHost( ){
    
    
    
        return false;
    
    
    
    }
}
        