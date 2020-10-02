package entidades;

public class Persona {
    
    private int id;
    private String nombre;
    private String sexo;
    private String Ap_paterno;
    private String Ap_materno;

    public String getAp_paterno() {
        return Ap_paterno;
    }

    public void setAp_paterno(String Ap_paterno) {
        this.Ap_paterno = Ap_paterno;
    }

    public String getAp_materno() {
        return Ap_materno;
    }

    public void setAp_materno(String Ap_materno) {
        this.Ap_materno = Ap_materno;
    }

    public void Comer() {
        System.out.println("Comer en Person");
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp_Paterno(String ap_paterno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
    