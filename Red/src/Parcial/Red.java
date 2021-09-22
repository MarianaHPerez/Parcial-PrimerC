package Parcial;


public class Red {
    
    private String Nombre;
    private String TipoDeRed;
    Host host;
    private int A = 3;
    private int B = 5;
    private int C = 7;
    
    public Red ( String Nombre,String TipoDeRed ){
    
    this.Nombre = Nombre;
    this.TipoDeRed = TipoDeRed;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipoDeRed() {
        return TipoDeRed;
    }

    public Host getHost() {
        return host;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipoDeRed(String TipoDeRed) {
        this.TipoDeRed = TipoDeRed;
    }

    public void setHost(Host host) {
        this.host = host;
    }
    
    
    
    
    
 public void  isLimitHost(){
        boolean limite;
        if (this.A > 3 ) {
            limite = true;
        } else {
            limite = false ;
        if (this.B > 5){
            limite = true;
        } else {
            limite = false;
                
        if (this.C > 7);
            limite = false;
        }
    }
 }
}
    