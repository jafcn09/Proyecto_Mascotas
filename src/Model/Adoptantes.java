package Model;

public class Adoptantes {
    //DECLARANDO VARIABLES
    int Codigo;

    String nombre;
    String apellido;
    int edad;

    int dni;
    String sexo;
    String correo;
    String tipo_mascota;
    int celular;
//CONSTRUCTOR
    public Adoptantes(int codigo, String nombre, String apellido, int edad, int dni, String sexo, String correo, String tipo_mascota, int celular) {
        Codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.correo = correo;
        this.tipo_mascota = tipo_mascota;
        this.celular = celular;
    }
    //SUPER CONSTRUCTOR
    public  Adoptantes(){
        this.Codigo = 1;
        this.nombre = "";
        this.apellido = "";
        this.dni =3049224;
        this.edad = 21;
        this.correo = "";
        this.tipo_mascota = "";
        this.celular=938498292;

    }
    //GETTER AND SETTER


    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
