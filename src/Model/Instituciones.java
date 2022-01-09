package Model;

public class Instituciones {
    //Declarando variables
    int ruc;
    String objetivo;
    String ubicacion;
    String tipo_cuenta;
    String cuenta;
    String banco;
    //Constructor

    public Instituciones(int ruc, String objetivo, String ubicacion, String tipo_cuenta, String cuenta, String banco) {
        this.ruc = ruc;
        this.objetivo = objetivo;
        this.ubicacion = ubicacion;
        this.tipo_cuenta = tipo_cuenta;
        this.cuenta = cuenta;
        this.banco = banco;
    }
    //super CONSTRUCTOR
    public  Instituciones(){
        this.ruc =23241315;
        this.objetivo ="";
        this.cuenta = "";
        this.tipo_cuenta ="";
        this.banco="";

    }
    //GETTER AND SETTER

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
