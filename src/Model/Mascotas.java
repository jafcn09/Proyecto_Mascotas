package Model;

public class Mascotas {
    //Declarando variables publicas

    int edad;
    int estatura;
    String nombre;
    String ubicación;
    String tipo;
    String estado;
    String ciudad;
    String foto;
    String control_medico;
    //Constructor

    public Mascotas(int edad, int estatura, String nombre, String ubicación, String tipo, String estado, String ciudad, String foto, String control_medico) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
        this.ubicación = ubicación;
        this.tipo = tipo;
        this.estado = estado;
        this.ciudad = ciudad;
        this.foto = foto;
        this.control_medico = control_medico;
    }
    //Super constructor

    public Mascotas() {
        this.edad = 0;
        this.estatura= 0;
        this.nombre = "";
        this.ubicación = "";
        this.tipo = "";
        this.ciudad = "";
        this.foto = "";
        this.control_medico = "";
    }
    //Getter and setter

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getControl_medico() {
        return control_medico;
    }

    public void setControl_medico(String control_medico) {
        this.control_medico = control_medico;
    }
}
